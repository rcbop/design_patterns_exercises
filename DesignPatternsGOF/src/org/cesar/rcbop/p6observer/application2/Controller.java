package org.cesar.rcbop.p6observer.application2;

public class Controller {

	private static Controller instance;

	public void addDataListener(OnUpdateDataListener listener) {
		DataRepository.getInstance().addListener(listener);
	}

	public void updateData(String data) {
		DataRepository.getInstance().updateData(data);
	}

	public static synchronized Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}
		return instance;
	}
}
