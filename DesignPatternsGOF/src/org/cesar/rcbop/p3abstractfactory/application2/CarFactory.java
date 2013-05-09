package org.cesar.rcbop.p3abstractfactory.application2;

public class CarFactory {

	private CarFactory() {
	}

	public static Car buildCar(Model model) {
		Car car = null;

		Location location = Configuration.DEFAULT_LOCATION;

		switch (location) {
		case NORTH_AMERICA:
			car = USACarFactory.buildCar(model);
			break;
		case ASIA:
			car = AsiaCarFactory.buildCar(model);
			break;
		default:
			car = DefaultCarFactory.buildCar(model);
			break;
		}
		return car;
	}

}
