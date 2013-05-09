package org.cesar.rcbop.p5command.application1;

public class TurnOnCommand implements Command{
	
	private Light light;

	public TurnOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		System.out.println("turning lamp on");
		light.turnOn();
	}
	

}
