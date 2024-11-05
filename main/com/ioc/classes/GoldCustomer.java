package com.ioc.classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoldCustomer {
	String type;
	
	public String getType() {
		return type;
	}

	@Autowired
	public void setType(@Value("Gold Customer")String type) {
		this.type = type;
	}


	public void display() {
		System.out.println("This is Gold Customer "+type);
	}
}
