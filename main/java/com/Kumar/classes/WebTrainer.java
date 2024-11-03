package com.Kumar.classes;

import com.Kumar.interfaces.Trainer;

public class WebTrainer implements Trainer{

	@Override
	public String giveTask() {
		return "Web trainer says pratice full stack";
	}

}
