package com.si.Trainers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st")
public class sqlTrainer {
	String name;
	String message;
	public void giveTask() {
		System.out.println(name+" says "+message);
	}
	public String getName() {
		return name;
	}
	@Autowired
	public void setName(@Value("spongebob") String name) {
		System.out.println("Name setted");
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	@Autowired
	public void setMessage(@Value("pratice complex queries")String message) {
		System.out.println("Message setted");
		this.message = message;
	}
}
