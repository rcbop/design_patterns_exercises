package org.cesar.rcbop.p5command.application1;

public class MainTest {

	public static void main(String[] args) {
		Interruptor interruptor = new Interruptor();
		Light roomLight = new Light();
		interruptor.executeAndLogCommand(new TurnOnCommand(roomLight));
		interruptor.executeAndLogCommand(new TurnOffCommand(roomLight));
	}
}
