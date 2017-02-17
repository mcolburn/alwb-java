package net.ages.workbench.templates.dsl.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;

public class ResourceTest {

	public void printLib() {
		URL url;
		try {
		    url = new URL("platform:/plugin/net.ages.workbench.templates.dsl/lib/test.xml");
		    InputStream inputStream = url.openConnection().getInputStream();
		    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		    String inputLine;
		    String x = ResourcesPlugin.getPlugin().getWorkspace().getRoot().getLocation().toString();
		    while ((inputLine = in.readLine()) != null) {
		        System.out.println(inputLine);
		    }
		 
		    in.close();
		 
		} catch (IOException e) {
		    e.printStackTrace();
		}


	}

}
