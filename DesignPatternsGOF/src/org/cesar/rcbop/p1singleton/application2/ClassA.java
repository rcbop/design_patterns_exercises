package org.cesar.rcbop.p1singleton.application2;

public class ClassA {

	private int propA = 1;

	public int getPropA() {
		return propA;
	}

	public void setPropA(int propA) {
		this.propA = propA;
	}
	
	public void printExternalPropB() {
		System.out.println(MediatorSingleton.getInstance().getPropB());
	}
	
	public void printExternalPropC(){
		System.out.println(MediatorSingleton.getInstance().getPropC());
	}
	
	public void printExternalPropD(){
		System.out.println(MediatorSingleton.getInstance().getPropD());
	}
	
}
