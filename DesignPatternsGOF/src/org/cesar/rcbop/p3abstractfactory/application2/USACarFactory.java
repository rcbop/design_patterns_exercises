package org.cesar.rcbop.p3abstractfactory.application2;

public class USACarFactory {

	public static Car buildCar(Model model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.NORTH_AMERICA);
			break;
		case LUXURY:
			car = new SedanCar(Location.NORTH_AMERICA);
			break;
		case SEDAN:
			car = new LuxuryCar(Location.NORTH_AMERICA);
			break;
		default:
			throw new IllegalArgumentException();
		}
		return car;
	}
}
