package org.cesar.rcbop.p1singleton.application4;

public class MainTest {
	public static void main(String[] args) {
		GuiController gui = GuiController.getInstance();
		gui.changeCurrentView(GuiController.Views.INPUT_VIEW);
	}
}
