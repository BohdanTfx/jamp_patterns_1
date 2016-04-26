package com.epam.patterns.factory;

import com.epam.patterns.model.Apple;
import com.epam.patterns.model.Banana;
import com.epam.patterns.model.Meat;
import com.epam.patterns.model.Plant;
import com.epam.patterns.model.Potato;

public class PlantFactory implements FoodFactory {

	@Override
	public Plant getPlant(String name) {
		switch (name) {
			case "potato":
				return new Potato();
			case "banana":
				return new Banana();
			case "apple":
				return new Apple();
			default:
				return null;
		}
	}

	@Override
	public Meat getMeat(String name) {
		return null;
	}

}
