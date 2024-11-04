package com.si.setterInjection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.si.Trainers.JavaTrainer;
import com.si.Trainers.sqlTrainer;
// Setter injection using
public class SetterInjectionApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
		JavaTrainer jt = (JavaTrainer)cpx.getBean("jt");
		sqlTrainer st = (sqlTrainer)cpx.getBean("st");
		jt.giveTask();
		st.giveTask();

	}

}
