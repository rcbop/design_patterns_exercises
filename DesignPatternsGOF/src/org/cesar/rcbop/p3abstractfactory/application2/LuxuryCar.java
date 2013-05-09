package org.cesar.rcbop.p3abstractfactory.application2;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(Model.LUXURY, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Luxury car");
		// accessories
	}

}
