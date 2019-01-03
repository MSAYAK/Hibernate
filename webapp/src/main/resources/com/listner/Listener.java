package com.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
public class Listener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Listener() {
   
    }


    public void contextDestroyed(ServletContextEvent arg0)  { 
contextevent.getServletContext().setAttribute("last_username","oracle");
    }

	
    public void contextInitialized(ServletContextEvent ace)  { 
       ace.getServletContext().setAttribute("username", "java");
    }
	
}
