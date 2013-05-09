package org.cesar.rcbop.p1singleton.application2;

public class ClassC {

	private int propC = 3;

	public int getPropC() {
		return propC;
	}

	public void setPropC(int propC) {
		this.propC = propC;
	}

	public void printExternalPropA() {
		System.out.println(MediatorSingleton.getInstance().getPropA());
	}

	public void printExternalPropB() {
		System.out.println(MediatorSingleton.getInstance().getPropB());
	}

	public void printExternalPropD() {
		System.out.println(MediatorSingleton.getInstance().getPropD());
	}
}
