package com.epam.patterns.singleton;

public class LazySingleton implements Singleton {
	private static Singleton instance = null;

	private LazySingleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
