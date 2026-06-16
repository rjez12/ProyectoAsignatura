package org.example.untitled.run;

import org.openxava.util.*;

/**
 * Execute this class to start the application.
 */

public class untitled {

	public static void main(String[] args) throws Exception {
		DBServer.start("uam_bfa_espacial"); // To use your own database comment this line and configure src/main/webapp/META-INF/context.xml
		AppServer.run("FigurasIdenticas"); // Use AppServer.run("") to run in root context
	}

}
