package com.epam.patterns.model;

public class Chicken implements Meat{

	@Override
	public void consume() {
		System.out.println("---Chicken---");
	}

	@Override
	public void fry() {
		System.out.println("---Chicken fried---");
	}

}
