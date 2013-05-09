package org.cesar.rcbop.p8facade.application1;

public class Facade {

	private static Facade instance;

	public static Facade getInstance() {
		if (instance == null) {
			instance = new Facade();
		}
		return instance;
	}

	public void playTheDrums() {
		Drums.getInstance().playTheDrums();
	}

	public void playTheGuitar(Chord chord) {
		Guitar guitar = new Guitar();
		guitar.playGuitar(chord);
	}

	public void playThePiano() {
		Piano piano = new Piano();
		piano.playThePiano();
	}

	public String playTheBass() {
		Bass bass = new Bass();
		return bass.playTheBass();
	}
}
