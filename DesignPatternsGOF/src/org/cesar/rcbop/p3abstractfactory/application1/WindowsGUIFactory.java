package org.cesar.rcbop.p3abstractfactory.application1;

public class WindowsGUIFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
