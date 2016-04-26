package com.epam.patterns.model;

public class Potato implements Plant{

	@Override
	public void consume() {
		System.out.println("---Potato---");
	}

	@Override
	public void wash() {
		System.out.println("---Potato washing---");
	}
	
}
