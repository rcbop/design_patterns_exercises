package org.cesar.rcbop.p1singleton.application4;

public class MainTest {
	public static void main(String[] args) {
		GuiController gui = GuiController.getInstance();
		gui.addListener(new ViewChangedObserver());
		gui.changeCurrentView(GuiController.Views.INPUT_VIEW);
		gui.changeCurrentView(GuiController.Views.OUTPUT_VIEW);
	}
}
