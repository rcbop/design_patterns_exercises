package org.cesar.rcbop.p8facade.application1;

public class MainTest {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++)
			System.out.println(Facade.getInstance().playTheBass());

		Facade.getInstance().playTheDrums();

		for (int i = 0; i < 3; i++)
			Facade.getInstance().playTheGuitar(Chord.A);

		for (int i = 0; i < 3; i++)
			Facade.getInstance().playTheGuitar(Chord.B);
		Facade.getInstance().playThePiano();
		
		Facade.getInstance().playTheDrums();
	}
}
