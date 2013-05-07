package org.cesar.rcbop.p1singleton.application2;

public class MediatorSingleton {

	private static MediatorSingleton instance;

	private ClassA objA;
	private ClassB objB;
	private ClassC objC;
	private ClassD objD;
	
	private MediatorSingleton(){
		System.out.println("mediator instance is up!");
	}

	/**
	 * Synchronized getInstance with lazy initiation
	 * 
	 * @return
	 */
	public synchronized static MediatorSingleton getInstance() {
		if (instance == null) {
			instance = new MediatorSingleton();
		}
		return instance;
	}

	/**
	 * Get propA with lazy initiation
	 * 
	 * @return
	 */
	public int getPropA() {
		if (objA == null) {
			objA = new ClassA();
		}
		return objA.getPropA();
	}

	/**
	 * Get propB with lazy initiation
	 * 
	 * @return
	 */
	public int getPropB() {
		if (objB == null) {
			objB = new ClassB();
		}
		return objB.getPropB();
	}

	/**
	 * Get propB with lazy initiation
	 * 
	 * @return
	 */
	public int getPropC() {
		if (objC == null) {
			objC = new ClassC();
		}
		return objC.getPropC();
	}

	/**
	 * Get propB with lazy initiation
	 * 
	 * @return
	 */
	public int getPropD() {
		if (objD == null) {
			objD = new ClassD();
		}
		return objD.getPropD();
	}
	
}
