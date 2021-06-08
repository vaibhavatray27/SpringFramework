package com.springconcepts.di.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {

	public static void main(String[] args) {

		ApplicationContext appC = new ClassPathXmlApplicationContext("bean.xml");
		Airtel airtel = appC.getBean("airtel",Airtel.class);
		airtel.activateService();
	}

}
