package com.ioc.classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlatinumCustomer {
	
	String type;
	
	public String getType() {
		return type;
	}

	@Autowired
	public void setType(@Value("Platinum Customer")String type) {
		this.type = type;
	}
	public void display() {
		System.out.println("This is platinum customer "+type);
	}
}
