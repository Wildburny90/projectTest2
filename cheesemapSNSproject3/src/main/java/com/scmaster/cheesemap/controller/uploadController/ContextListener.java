package com.scmaster.cheesemap.controller.uploadController;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.File;

public class ContextListener implements ServletContextListener {

	public ContextListener() {
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	// Run this before web application is started
	@Override
	public void contextInitialized(ServletContextEvent event) {

		// Create public folder.
		// Eclipse deploys the apps to
		// workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/
		// So public folder is located here:
		// workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Examples/public
		ServletContext servletContext = event.getServletContext();
		String contextpath = servletContext.getRealPath("/");
		String publicFolderPath = contextpath + "resources\\img";
		File path = new File(publicFolderPath);

		if (!path.exists()) {
			path.mkdirs();
		}

		System.out.println("Public folder is located here: " + publicFolderPath);
	}
}
