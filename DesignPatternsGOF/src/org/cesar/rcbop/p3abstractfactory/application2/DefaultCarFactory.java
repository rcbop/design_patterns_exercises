package org.cesar.rcbop.p3abstractfactory.application2;

public class DefaultCarFactory {

	public static Car buildCar(Model model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new SmallCar(Location.DEFAULT);
			break;
		case LUXURY:
			car = new SedanCar(Location.DEFAULT);
			break;
		case SEDAN:
			car = new LuxuryCar(Location.DEFAULT);
			break;
		default:
			throw new IllegalArgumentException();
		}
		return car;
	}

}
