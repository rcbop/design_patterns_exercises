package org.cesar.rcbop.p1singleton.application4.views;

public class OutputView extends View {

	private static OutputView instance;

	@Override
	public void showView() {
		System.out.println("Your output view");
	}

	public static View getInstance() {
		if (instance == null) {
			instance = new OutputView();
		}
		return instance;
	}

}
