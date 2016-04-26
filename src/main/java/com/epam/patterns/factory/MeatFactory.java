package com.epam.patterns.factory;

import com.epam.patterns.model.Beef;
import com.epam.patterns.model.Chicken;
import com.epam.patterns.model.Meat;
import com.epam.patterns.model.Plant;
import com.epam.patterns.model.Pork;

public class MeatFactory implements FoodFactory {

	@Override
	public Plant getPlant(String name) {
		return null;
	}

	@Override
	public Meat getMeat(String name) {
		switch (name) {
			case "beef":
				return new Beef();
			case "chicken":
				return new Chicken();
			case "pork":
				return new Pork();
			default:
				return null;
		}
	}
}
