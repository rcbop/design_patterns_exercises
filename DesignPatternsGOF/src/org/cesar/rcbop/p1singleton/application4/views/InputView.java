package org.cesar.rcbop.p1singleton.application4.views;


public class InputView extends View {

	private static InputView instance;
	
	@Override
	public void showView() {
		System.out.println("State your input");
	}

	public static View getInstance() {
		if (instance == null) {
			instance = new InputView();
		}
		return instance;
	}

}
