package com.doo.md5server.init;

import com.doo.md5server.config.WebAppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

public class Initializer implements WebApplicationInitializer {
	//private static final Logger logger = Logger.getLogger(Initializer.class);
	
	public static String CONTAINER;
	public static String VERSION;

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebAppConfig.class);
       // ctx.register(WebSocketConfig.class);
		servletContext.addListener(new ContextLoaderListener(ctx));
		
		CONTAINER = servletContext.getServerInfo().split("/")[0];
		VERSION = servletContext.getServerInfo().split("/")[1];
		
		ctx.setServletContext(servletContext);
		ctx.setDisplayName("Spring Java Example");

		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		servlet.setAsyncSupported(true);
		
		FilterRegistration.Dynamic springSecurityFilterChain = servletContext.addFilter("springSecurityFilterChain", DelegatingFilterProxy.class);
        springSecurityFilterChain.setAsyncSupported(true);
		springSecurityFilterChain.addMappingForUrlPatterns(null, false, "/*");

	}
}
