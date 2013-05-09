package org.cesar.rcbop.p6observer.application2;

public class Screen {

	public Screen() {
	}

	public void displayData(String data) {
		System.out.println("Updating data: " + data);
	}

	public void insertData(String data) {
		Controller.getInstance().updateData(data);
	}

}
