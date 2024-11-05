package com.si.setterInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ioc.classes.GoldCustomer;
import com.ioc.classes.PlatinumCustomer;
import com.ioc.config.AppConfig;

// Setter injection using
public class SetterInjectionApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	
		GoldCustomer gc = (GoldCustomer)ac.getBean("goldCustomer");
		PlatinumCustomer pc = (PlatinumCustomer)ac.getBean("platinumCustomer");
		gc.display();
		pc.display();
		
	}
	/*
	 * 		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
			JavaTrainer jt = (JavaTrainer)cpx.getBean("jt");
			sqlTrainer st = (sqlTrainer)cpx.getBean("st");
			jt.giveTask();
			st.giveTask();
	 */
}
