package com.epam.patterns.factory;

import com.epam.patterns.model.Meat;
import com.epam.patterns.model.Plant;

public interface FoodFactory {
	public Plant getPlant(String name);

	public Meat getMeat(String name);
}