package com.epam.patterns.singleton;

public final class SimpleSingleton implements Singleton {
	private static final Singleton INSTANCE = new SimpleSingleton();

	private SimpleSingleton() {
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
}
