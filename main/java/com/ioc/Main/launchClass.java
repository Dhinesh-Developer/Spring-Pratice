package com.ioc.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ioc.classes.GoldCustomerClass;
import com.ioc.classes.platiniumCustomerClass;

public class launchClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
		GoldCustomerClass gc = (GoldCustomerClass)cpx.getBean("gc");
		platiniumCustomerClass pc = (platiniumCustomerClass)cpx.getBean("pc");
		gc.display();
		pc.display();
	
	}
}
