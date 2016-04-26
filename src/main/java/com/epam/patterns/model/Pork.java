package com.epam.patterns.model;

public class Pork implements Meat{

	@Override
	public void consume() {
		System.out.println("---Pork---");
	}

	@Override
	public void fry() {
		System.out.println("---Pork fried");
	}

}
