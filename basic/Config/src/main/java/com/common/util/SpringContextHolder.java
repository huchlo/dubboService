/**
 * @author ivy	ivy@ivyb2b.com
 * Date:2014-1-9
 */
package com.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * String的应用上下文持有器
 * @author ivy	ivy@ivyb2b.com
 *
 */
public class SpringContextHolder implements ApplicationContextAware, ServletContextAware {
	private static ApplicationContext applicationContext;
	private static ServletContext servletContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextHolder.applicationContext = applicationContext;
	}

	public static final ApplicationContext getApplicationContext(){
		return applicationContext;
	}
	
	/** 
     * 获取一个BEAN 
     * @param beanName bean的名字 
     * @return 返回一个bean对象 
     */  
    public static Object getBean(String beanName ) {
        return applicationContext.getBean( beanName );  
    }

	@Override
	public void setServletContext(ServletContext servletContext) {
		SpringContextHolder.servletContext = servletContext;
	}

	public static ServletContext getServletContext() {
		return servletContext;
	} 
}
