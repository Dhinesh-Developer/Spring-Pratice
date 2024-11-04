package com.si.Trainers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jt")
public class JavaTrainer {
	String name;
	String message;
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("Kumar")String name) {
		System.out.println("Name setted");
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(@Value("pratice coding")String message) {
		System.out.println("Message setted");
		this.message = message;
	}
	public void giveTask() {
		System.out.println(name+" says "+message);
	}
}
