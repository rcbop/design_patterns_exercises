package org.cesar.rcbop.p5command.application1;

public class MainTest {

	public static void main(String[] args) {
		Interruptor interruptor = new Interruptor();
		Light roomLight = new Light();

		executeCommands(interruptor, roomLight);

		logCommandHistory(interruptor);
		
		
		testLight(roomLight);
	}

	private static void testLight(Light roomLight) {
		System.out.println();
		roomLight.work();
	}

	private static void executeCommands(Interruptor interruptor, Light roomLight) {
		for (int i = 0; i < 5; i++) {
			interruptor.executeAndLogCommand(new TurnOnCommand(roomLight));
			interruptor.executeAndLogCommand(new TurnOffCommand(roomLight));
		}
		interruptor.executeAndLogCommand(new TurnOffCommand(roomLight));
		interruptor.executeAndLogCommand(new TurnOnCommand(roomLight));
	}

	private static void logCommandHistory(Interruptor interruptor) {
		System.out.println("\n<<<<< COMMAND HISTORY >>>>>\n");
		for (Command command : interruptor.getHistory()) {
			System.out.println(command.getClass().getSimpleName());
		}
	}
}
