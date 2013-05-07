package org.cesar.rcbop.p1singleton.application7;

/**
 * Joshua Bloch version
 * 
 * DRAWBACKS: NO LAZY INITIALIZATION
 * 
 * @author rcbop@cesar.org.br
 * 
 */
public enum EnumSingleton {
	INSTANCE;
	public void executeMethod() {
		// .......
		System.out.println("the enum form of singleton");
	}
}
