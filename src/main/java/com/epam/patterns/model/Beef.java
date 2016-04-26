package com.epam.patterns.model;

public class Beef implements Meat{

	@Override
	public void consume() {
		System.out.println("---Beef---");
	}

	@Override
	public void fry() {
		System.out.println("---Beef fried---");
	}

}
