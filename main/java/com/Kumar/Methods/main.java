package com.Kumar.Methods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Kumar.classes.JavaTrainer;
import com.Kumar.classes.SQLTrainer;
import com.Kumar.classes.WebTrainer;
import com.Kumar.interfaces.Trainer;


// By default Spring follows single ton design pattern.
public class main {

	public static void main(String[] args) {
		// Getting objects/ reference from bean container/ facatory
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");

		Trainer jt = (JavaTrainer)cpx.getBean("javaT");
		Trainer st  =(SQLTrainer)cpx.getBean("sqlT");
		Trainer wt = (WebTrainer)cpx.getBean("webT");

		// This is object which i was created
		//		Trainer jt = new JavaTrainer();
		//		Trainer st = new SQLTrainer();
		//		Trainer wt = new WebTrainer();




		// i want Spring container to give me an object
		System.out.println(jt.giveTask());
		System.out.println(st.giveTask());
		System.out.println(wt.giveTask());
		
		
		
	/* same object for below code/ references.
	 * com.Kumar.classes.JavaTrainer@5906ebcb
		com.Kumar.classes.JavaTrainer@5906ebcb
		com.Kumar.classes.JavaTrainer@5906ebcb
	 */
		
		Trainer jt1 = (JavaTrainer)cpx.getBean("javaT");
		System.out.println(jt1);
		Trainer jt2 = (JavaTrainer)cpx.getBean("javaT");
		System.out.println(jt2);
		Trainer jt3 = (JavaTrainer)cpx.getBean("javaT");
		System.out.println(jt3);
		
		
		/*
		 *  com.Kumar.classes.JavaTrainer@f2f2cc1 // for every classes containes different object
		 *  com.Kumar.classes.SQLTrainer@3a079870
			com.Kumar.classes.WebTrainer@3b2cf7ab
		 */
		ClassPathXmlApplicationContext cpx1 = new ClassPathXmlApplicationContext("beans.xml");
		// Another cpx factory
		Trainer jt0 = (JavaTrainer)cpx1.getBean("javaT");
		Trainer st1  =(SQLTrainer)cpx1.getBean("sqlT");
		Trainer wt1 = (WebTrainer)cpx1.getBean("webT");
		System.out.println(jt0);
		System.out.println(st1);
		System.out.println(wt1);
		
		
		// scope = "prototype.
		/*
		 *  com.Kumar.classes.JavaTrainer@2aa5fe93
			com.Kumar.classes.JavaTrainer@5c1a8622
		 */
		
		// Different object reference will created every time.
//		Trainer jt4 = (JavaTrainer)cpx.getBean("javaT");
//		System.out.println(jt4);
//		Trainer jt5 = (JavaTrainer)cpx.getBean("javaT");
//		System.out.println(jt5);
//		Trainer jt6 = (JavaTrainer)cpx.getBean("javaT");
//		System.out.println(jt6);
	}

}
