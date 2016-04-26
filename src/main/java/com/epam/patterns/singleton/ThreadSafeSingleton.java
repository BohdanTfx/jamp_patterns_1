package com.epam.patterns.singleton;

public class ThreadSafeSingleton implements Singleton {
	private static Singleton instance = null;

	private ThreadSafeSingleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}

		return instance;
	}
}
