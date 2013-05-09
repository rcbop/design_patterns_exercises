package org.cesar.rcbop.p5command.application1;

public class Light {

	private boolean stateOn;

	public Light() {
	}

	public void turnOn() {
		stateOn = true;
	}

	public void turnOff() {
		stateOn = false;
	}
	
	public void work(){
		if (stateOn) {
			System.out.println("Bright!");
		}
		else {
			System.out.println("Dark!");
		}
	}

}
