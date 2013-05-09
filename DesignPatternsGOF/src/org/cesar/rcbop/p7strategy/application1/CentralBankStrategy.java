package org.cesar.rcbop.p7strategy.application1;

public abstract class CentralBankStrategy implements IStrategy {

	@Override
	public void doMethod() {
		addRegistry();
		verifyRegistry();
		saveRegister();
	}

	public abstract void addRegistry();

	public abstract void verifyRegistry();

	public abstract void saveRegister();

}
