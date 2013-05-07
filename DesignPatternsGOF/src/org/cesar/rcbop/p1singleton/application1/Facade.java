package org.cesar.rcbop.p1singleton.application1;

/**
 * 
 * @author rcbop@cesar.org.br
 *
 */
public class Facade {

	private static Facade instance;
	
	/**
	 * Singleton with lazy initiation.
	 * @return
	 */
	public static Facade getInstance() {
		if (instance == null) {
			instance = new Facade();
		}
		return instance;
	}
	
	private Facade(){
		System.out.println("running!");
	}
	
	public static void main(String[] args) {
		Facade.getInstance();
	}
}
