package org.cesar.rcbop.p3abstractfactory.application2;

public class SmallCar extends Car {

	public SmallCar(Location location) {
		super(Model.SMALL, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Small car");
		// accessories
	}

}
