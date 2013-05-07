package org.cesar.rcbop.p3abstractfactory.application1;

public class GtkButton implements Button {

	@Override
	public void paint() {
		System.out.println("painting GTK Button");
	}
}
