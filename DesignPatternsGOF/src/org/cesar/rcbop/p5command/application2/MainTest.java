package org.cesar.rcbop.p5command.application2;

public class MainTest {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Alfredo");
		Customer customer2 = new Customer("Lídia");

		Waitress waitress1 = new Waitress("Cathy");
		customer1.currentWaitress = waitress1;
		customer2.currentWaitress = waitress1;

		Order order1 = new Order("Chicken");
		customer1.orderFood(order1);
		customer2.orderFood(new Order("Salad"));
		customer1.orderFood(new Order("Spagetti"));

		Cook cook1 = new Cook("Vinccenzo");
		cook1.addOnAvaiableListener(waitress1);

		waitress1.avaiableCook(cook1);

		customer2.orderFood(new Order("Hamburguer"));
		customer1.orderFood(new Order("Meat loaf"));
	}
}
