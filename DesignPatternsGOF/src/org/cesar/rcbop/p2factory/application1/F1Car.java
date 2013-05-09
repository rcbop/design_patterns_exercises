package org.cesar.rcbop.p2factory.application1;

public class F1Car extends GenericCar {

	@Override
	public Tire addTire() {
		return new F1Tire();
	}

}
