package org.cesar.rcbop.p1singleton.application2;

public class ClassB {

	private int propB = 2;

	public int getPropB() {
		return propB;
	}

	public void setPropB(int propB) {
		this.propB = propB;
	}

	public void printExternalPropA() {
		System.out.println(MediatorSingleton.getInstance().getPropA());
	}

	public void printExternalPropC() {
		System.out.println(MediatorSingleton.getInstance().getPropC());
	}

	public void printExternalPropD() {
		System.out.println(MediatorSingleton.getInstance().getPropD());
	}
}
