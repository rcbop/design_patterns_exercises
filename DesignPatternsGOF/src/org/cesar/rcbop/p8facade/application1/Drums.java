package org.cesar.rcbop.p8facade.application1;

public class Drums {

	private static Drums instance;

	void playTheDrums() {
		System.out.println("tá, pum pum pá... tss.. tá, pum pum pá... tss...");
	}

	public static Drums getInstance() {
		if (instance == null) {
			instance = new Drums();
		}
		return instance;
	}
}
