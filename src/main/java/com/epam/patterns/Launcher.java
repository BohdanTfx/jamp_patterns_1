package com.epam.patterns;

import java.util.Arrays;

import com.epam.patterns.factory.FactoryProducer;
import com.epam.patterns.factory.FoodFactory;
import com.epam.patterns.model.Apple;
import com.epam.patterns.model.Banana;
import com.epam.patterns.model.Dinner;
import com.epam.patterns.model.Lunch;
import com.epam.patterns.model.Pork;
import com.epam.patterns.model.Potato;
import com.epam.patterns.singleton.InstanceHolderSingleton;
import com.epam.patterns.singleton.LazySingleton;
import com.epam.patterns.singleton.SimpleSingleton;
import com.epam.patterns.singleton.Singleton;
import com.epam.patterns.singleton.ThreadSafeSingleton;

public class Launcher {
	public static void main(String[] args) throws Exception {
		testPrototype();
		testFactory();
		testSingleton();
	}

	private static void testSingleton() {
		Singleton singleton = SimpleSingleton.getInstance();
		System.out.println(singleton);
		singleton = SimpleSingleton.getInstance();
		System.out.println(singleton);

		singleton = InstanceHolderSingleton.getInstance();
		System.out.println(singleton);
		singleton = InstanceHolderSingleton.getInstance();
		System.out.println(singleton);
		
		
		singleton = LazySingleton.getInstance();
		System.out.println(singleton);
		singleton = LazySingleton.getInstance();
		System.out.println(singleton);
		
		singleton = ThreadSafeSingleton.getInstance();
		System.out.println(singleton);
		singleton = ThreadSafeSingleton.getInstance();
		System.out.println(singleton);
	}

	private static void testFactory() {
		FoodFactory meatFactory = FactoryProducer.getFactory("meat");
		meatFactory.getMeat("pork").consume();
		meatFactory.getMeat("beef").fry();
		meatFactory.getMeat("chicken").consume();

		FoodFactory plantFactory = FactoryProducer.getFactory("plant");
		plantFactory.getPlant("banana").consume();
		plantFactory.getPlant("apple").wash();
		plantFactory.getPlant("potato").consume();
	}

	private static void testPrototype() throws CloneNotSupportedException {
		Lunch lunch = new Lunch(5, new Pork(), Arrays.asList(new Banana(), new Apple(), new Banana()));
		Lunch myLunch = lunch.clone();
		System.out.println(lunch);
		System.out.println(myLunch);

		Dinner dinner = new Dinner(6, 2.56, Arrays.asList(new Pork(), new Banana(), new Potato()));
		Dinner myDinner = dinner.clone();
		System.out.println(dinner);
		System.out.println(myDinner);
	}
}
