package com.epam.patterns.singleton;

public class InstanceHolderSingleton implements Singleton {
	private InstanceHolderSingleton() {
	}

	private static class InstanceHolder {
		private static final Singleton INSTANCE = new InstanceHolderSingleton();
	}

	public static Singleton getInstance() {
		return InstanceHolder.INSTANCE;
	}
}
