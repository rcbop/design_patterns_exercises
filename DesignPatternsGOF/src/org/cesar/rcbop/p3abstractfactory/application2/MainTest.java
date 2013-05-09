package org.cesar.rcbop.p3abstractfactory.application2;

public class MainTest {
	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(Model.LUXURY));
		System.out.println(CarFactory.buildCar(Model.SMALL));
		System.out.println(CarFactory.buildCar(Model.SEDAN));
	}
}
