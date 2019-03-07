//by JoeK 8-03-19
package com.jokin.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		 
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		 
		return new String[] {"/"};
	}

	
}
