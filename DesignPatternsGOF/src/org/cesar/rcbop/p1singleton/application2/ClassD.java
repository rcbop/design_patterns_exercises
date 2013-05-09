package org.cesar.rcbop.p1singleton.application2;

public class ClassD {
	
	private int propD = 4;
	
	public int getPropD() {
		return propD;
	}

	public void setPropD(int propD) {
		this.propD = propD;
	}
	
	public void printExternalPropA() {
		System.out.println(MediatorSingleton.getInstance().getPropA());
	}

	public void printExternalPropC() {
		System.out.println(MediatorSingleton.getInstance().getPropC());
	}
	
	public void printExternalPropB() {
		System.out.println(MediatorSingleton.getInstance().getPropB());
	}
	

}
