package com.epam.patterns.model;

import java.util.List;

public class Dinner implements Cloneable{
	private Integer dishNumber;
	private double cost;
	private List<Food> dishes;

	public Dinner(Integer dishNumber, double cost, List<Food> dishes) {
		this.dishNumber = dishNumber;
		this.cost = cost;
		this.dishes = dishes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dinner [");
		builder.append(super.toString());
		builder.append(" ");
		if (dishNumber != null) {
			builder.append("dishNumber=");
			builder.append(dishNumber);
			builder.append(", ");
		}
		builder.append("cost=");
		builder.append(cost);
		builder.append(", ");
		if (dishes != null) {
			builder.append("dishes=");
			builder.append(dishes);
		}
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public Dinner clone() throws CloneNotSupportedException {
		return (Dinner) super.clone();
	}
	
}
