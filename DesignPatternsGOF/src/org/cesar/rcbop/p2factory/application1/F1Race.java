package org.cesar.rcbop.p2factory.application1;

public class F1Race extends GenericRace {

	@Override
	public GenericCar addCar() {
		return new F1Car();
	}

	@Override
	public void race() {
		F1Car car1 = (F1Car) addCar();
		car1.addTire();
		F1Car car2 = (F1Car) addCar();
		car2.addTire();
	}
}
