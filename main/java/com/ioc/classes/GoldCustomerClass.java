package com.ioc.classes;

import org.springframework.stereotype.Component;

@Component("gc")
public class GoldCustomerClass {
	
	public void display() {
		System.out.println("Gold customer classes");
	}
}
