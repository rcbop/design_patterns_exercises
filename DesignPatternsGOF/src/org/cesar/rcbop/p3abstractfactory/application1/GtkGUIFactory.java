package org.cesar.rcbop.p3abstractfactory.application1;

public class GtkGUIFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new GtkButton();
	}

}
