package org.cesar.rcbop.p5command.application1;

public class TurnOffCommand implements Command {
	private Light light;
	
	public TurnOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("turning lamp off");
		light.turnOff();
	}

}
