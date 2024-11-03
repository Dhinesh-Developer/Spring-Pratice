package com.Kumar.classes;

import com.Kumar.interfaces.Trainer;

public class SQLTrainer implements Trainer {

	@Override
	public String giveTask() {
		return "Sql trainer says pratice queries";
	}

}
