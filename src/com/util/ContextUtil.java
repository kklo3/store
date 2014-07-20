package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContextUtil {
	public static Object getContext(String serviceName){
		ApplicationContext context = new FileSystemXmlApplicationContext("file:G:/MyDesign/store/WebRoot/WEB-INF/applicationContext.xml");
		return context.getBean(serviceName);
	}
}
