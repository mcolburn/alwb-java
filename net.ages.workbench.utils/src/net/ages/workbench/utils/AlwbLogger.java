package net.ages.workbench.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.FileAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.config.XMLConfigurationFactory;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.apache.logging.log4j.Level;


/**
 * AlwbLogger
 * <p>A utility class to be used by all ALWB classes as a common means to initialize the logger context
 * <p> 
 * @author mac002
 *
 */
public class AlwbLogger {
	private static boolean initialized = false;
	private static LoggerContext _ctx = (LoggerContext) LogManager.getContext(false);
	private static Configuration _config;
	private static LoggerConfig _loggerConfig;
	private static String _home = normalizePath(AlwbGeneralUtils.getAgesStringPreference(AlwbConstants.P_STRING_LOG4J_PATH));
	private static URI _configURI;
	private static String _configFileLocation = _home + "log4j2.xml";
	private static String _logfilename = _home + "alwb.log";
	public static enum LogLevel {
        ALL(Level.ALL.toString()), 
        OFF(Level.OFF.toString()), 
        FATAL(Level.FATAL.toString()),
        ERROR(Level.ERROR.toString()),
        WARN(Level.WARN.toString()), 
        INFO(Level.INFO.toString()),
        DEBUG(Level.DEBUG.toString()),
        TRACE(Level.TRACE.toString())
        ;

		private String config = 
		"<?xml version='1.0' encoding='UTF-8'?>\n" +
		"<configuration status='error'>\n" +
		 "\t<appenders>\n" +
		 "\t\t<Console name='Console' target='SYSTEM_OUT'>\n" +
		 "\t\t\t<ThresholdFilter level='ERROR' onMatch='ACCEPT' onMismatch='DENY'/>\n" +
		 "\t\t\t<PatternLayout pattern='%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n'/>\n" +
		 "\t\t</Console>\n" +
		 "\t\t<File name='log' fileName='${sys:logFilename}' append='false'>\n" + 
		 "\t\t\t<PatternLayout pattern='%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n'/>\n" +
		 "\t\t</File>\n" +
		 "\t</appenders>\n" +
		 "\t<loggers>\n" +
		 "\t\t<root level='trace'>\n" +
		 "\t\t\t<appender-ref ref='log'/>\n" +
		 "\t\t</root>\n" +
		 "\t</loggers>\n" +
		 "</configuration>\n";  
		
        private String value;

        private LogLevel(String value) {
                this.value = value;
        }
		};   		

	/**
	 * initialize the context to the default settings.
	 * <p>The default is to use: 
	 * <ol>
	 * <li>Log Folder Home: set to a folder named 'logs' in the user home folder, which varies depending on the Operating System.</li>
	 * <li>Configuration file: set to log4j2.xml in the folder home.</li>
	 * <li>Log file: set to alwb.log in the folder home.</li>
	 * </ol>
	 */
	public static void initialize() {
		try {
			if (! initialized) {
//				System.setProperty(XMLConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "/Users/mac002/logs1/log4j2.xml");
				setVariablePaths();
				_configURI = new URI(_configFileLocation);
				initializeConfig(_configFileLocation);
			    	System.setProperty("logFilename", _logfilename);
			    	String configProperty = System.getProperty("log4j.configurationFile");
				_ctx.setConfigLocation(_configURI); // automatically calls ctx.reconfigure();
				_config = _ctx.getConfiguration();
				_loggerConfig = _config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME);
				_ctx.updateLoggers();
				initialized = true;
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
	

	private static void setVariablePaths() {
		_home = normalizePath(AlwbGeneralUtils.getAgesStringPreference(AlwbConstants.P_STRING_LOG4J_PATH));
		_configFileLocation = _home + "log4j2.xml";
		_logfilename = _home + "alwb.log";

	}
	/**
	 * initialize the context to the settings passed by the caller.
	 * <p>
	 * @param configFileLocation
	 * @param logFileLocation
	 */
	public static void initialize(String configFileLocation, String logFileLocation) {
		try {
			setVariablePaths();
			_configFileLocation = configFileLocation;
			initializeConfig(_configFileLocation);
			_configURI = new URI(_configFileLocation);
			_logfilename = logFileLocation;
		    	System.setProperty("logFilename", _logfilename);
			_ctx.setConfigLocation(_configURI); // automatically calls ctx.reconfigure();
			_ctx.updateLoggers();
		} catch (URISyntaxException e) {
				e.printStackTrace();
		}
	}

	/**
	 * initialize the context to the settings passed by the caller.
	 * <p>
	 * @param configFileLocation
	 * @param logFileLocation
	 * @parm level
	 */
	public static void initialize(String configFileLocation, String logFileLocation, LogLevel level) {
		initialize(configFileLocation,logFileLocation);
		initializeConfig(_configFileLocation);
		setLevel(level);
	}
	
	/**
	 * Checks to see if the path is for Windows, and if so, changes separators into backslashes
	 * @param path
	 * @return
	 */
	private static String normalizePath(String path) {
		String newPath = path;
		String [] parts = path.split("\\\\");
		try {
			if (parts.length > 1) {
				newPath = path.replaceAll("\\\\", "/");
			}		
		} catch (Exception e) {
			newPath = path;
		}
		return newPath;
	}
	
	private static void initializeConfig(String path) {
		File configFile = new File(path);
		try {
			if (!configFile.exists()) {
				if (!configFile.getParentFile().exists()) {
					configFile.getParentFile().mkdirs();
				}
				configFile.createNewFile();
			}
			FileWriter fw = new FileWriter(configFile.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(getDefaultLogConfig());
			bw.close();
 		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Set the logging level to passed value.
	 * <p>
	 * Use the static AlwbLogger.LogLevel enum to pass in the value, e.g. AlwbLogger.setLevel(AlwbLogger.LogLevel.ALL);
	 * @param level - string corresponding to appropriate level 
	 * @see 
	 */
	public static void setLevel(LogLevel level) {
		try {
			_loggerConfig.setLevel(Level.toLevel(level.value));
			_ctx.updateLoggers();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static LoggerContext getLoggerContext() {
		return _ctx;
	}
	
	public static Logger getLogger(String classname) {
		return LogManager.getLogger(classname);
	}
	
	public static void setLogLevelToEclipsePreference() {
		setLevel(AlwbLogger.getLog4jLevel());
	}
	
	/**
	 * Get the log level set by the user preferences
	 * @return the level preference
	 */
	public static LogLevel getLog4jLevel() {
		
		LogLevel result = AlwbLogger.LogLevel.OFF;
		
		switch(AlwbGeneralUtils.getAgesStringPreference(AlwbConstants.P_CHOICE_LOG4J).charAt(0)) {

			case ('a'): {
				result = AlwbLogger.LogLevel.ALL;
				break;
			}
			case ('o'): {
				result = AlwbLogger.LogLevel.OFF;
				break;
			}
			case ('e'): {
				result = AlwbLogger.LogLevel.ERROR;
				break;
			}
			case ('w'): {
				result = AlwbLogger.LogLevel.WARN;
				break;
			}
			case ('i'): {
				result = AlwbLogger.LogLevel.INFO;
				break;
			}
			case ('d'): {
				result = AlwbLogger.LogLevel.DEBUG;
				break;
			}
			case ('t'): {
				result = AlwbLogger.LogLevel.TRACE;
				break;
			}
		}
		return result;
	}

	private static String getDefaultLogConfig() {
		String config = 
				"<?xml version='1.0' encoding='UTF-8'?>\n" +
		"<configuration status='error'>\n" +
		  "<appenders>\n" +
		    "<Console name='Console' target='SYSTEM_OUT'>\n" +
		     "<ThresholdFilter level='ERROR' onMatch='ACCEPT' onMismatch='DENY'/>\n" +
		      "<PatternLayout pattern='%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n'/>\n" +
		    "</Console>\n" +
		    "<File name='log' fileName='${sys:logFilename}' append='false'>\n" + 
		      "<PatternLayout pattern='%d{HH:mm:ss.SSS} %-5level %class{36} %L %M - %msg%xEx%n'/>\n" +
		    "</File>\n" +
		  "</appenders>\n" +
		  "<loggers>\n" +
		    "<root level='trace'>\n" +
		    "  <appender-ref ref='log'/>\n" +
		    "</root>\n" +
		  "</loggers>\n" +
		"</configuration>\n";
		return config;
	}
}