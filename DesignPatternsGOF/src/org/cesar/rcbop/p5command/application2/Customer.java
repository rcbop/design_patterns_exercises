package org.cesar.rcbop.p5command.application2;

public class Customer {

	String name;
	Waitress currentWaitress;
	
	public Customer(String name) {
		this.name = name;
	}

	public void orderFood(Order order) {
		currentWaitress.placeOrder(order);
	}

}
