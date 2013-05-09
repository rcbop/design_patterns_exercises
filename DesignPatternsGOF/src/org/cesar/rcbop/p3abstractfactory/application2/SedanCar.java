package org.cesar.rcbop.p3abstractfactory.application2;

public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(Model.SEDAN, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Sedan car");
		// accessories
	}

}
