package com.epam.patterns.model;

public class Banana implements Plant{

	@Override
	public void consume() {
		System.out.println("---Banana!--");
	}

	@Override
	public void wash() {
		System.out.println("---Banana washing---");
	}

}
