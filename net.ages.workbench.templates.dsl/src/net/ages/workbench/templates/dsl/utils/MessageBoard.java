package net.ages.workbench.templates.dsl.utils;

public class MessageBoard {
	private boolean hasFatalErrors;
	private boolean hasMessages;
	private StringBuffer sb = new StringBuffer();
	private String client;
	public int NON_FATAL = 0;
	public int FATAL = 1;
	public MessageBoard(String client) {
		this.client = client;
	}
	public void logMessage(int type, String message) {
		logMessage();
		if (type == FATAL) {
			logFatal();
		}
		sb.append(textForType(type) +": " + message + "\n");
	}
	
	public String getMessages() {
		return sb.toString();
	}
	
	private void logFatal() {
		hasFatalErrors = true;
	}
	
	private void logMessage() {
		hasMessages = true;
	}
	
	public String textForType(int t) {
		switch (t) {
		case 1: {return "Fatal";}
		default: {return "Non-Fatal";}
		}
	}
	
	public boolean hasFatalErrors() {
		return hasFatalErrors;
	}
	
	public boolean hasMessages() {
		return hasMessages;
	}
}
