package com.epam.patterns.model;

import java.util.ArrayList;
import java.util.List;

public class Lunch implements Cloneable {
	private Integer totalDishNumber;
	private Meat meat;
	private List<Plant> plants;

	public Lunch(Integer totalDishNumber, Meat meat, List<Plant> plants) {
		this.totalDishNumber = totalDishNumber;
		this.meat = meat;
		this.plants = plants;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lunch [");
		builder.append(super.toString());
		builder.append(" ");
		if (totalDishNumber != null) {
			builder.append("totalDishNumber=");
			builder.append(totalDishNumber);
			builder.append(", ");
		}
		if (meat != null) {
			builder.append("meat=");
			builder.append(meat);
			builder.append(", ");
		}
		if (plants != null) {
			builder.append("plants=");
			builder.append(plants);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public Lunch clone() throws CloneNotSupportedException {
		List<Plant> plants = new ArrayList<>(this.plants);
		Lunch newLunch = new Lunch(totalDishNumber, meat, plants);
		return newLunch;
	}
}
