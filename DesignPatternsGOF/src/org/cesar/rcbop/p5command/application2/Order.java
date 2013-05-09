package org.cesar.rcbop.p5command.application2;

public class Order implements Command {

	String name;

	public Order(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void execute(Cook cook) {
		cook.cookFood(name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
