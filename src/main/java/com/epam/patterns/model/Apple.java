package com.epam.patterns.model;

public class Apple implements Plant{

	@Override
	public void consume() {
		System.out.println("---Apple---");
	}

	@Override
	public void wash() {
		System.out.println("---Apple washing---");
	}

}
