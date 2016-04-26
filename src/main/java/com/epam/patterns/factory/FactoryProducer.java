package com.epam.patterns.factory;

public class FactoryProducer {
	public static FoodFactory getFactory(String name) {
		if ("meat".equalsIgnoreCase(name)) {
			return new MeatFactory();
		} else if ("plant".equalsIgnoreCase(name)) {
			return new PlantFactory();
		}

		return null;
	}
}
