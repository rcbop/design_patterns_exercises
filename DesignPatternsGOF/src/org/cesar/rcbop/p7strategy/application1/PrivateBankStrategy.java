package org.cesar.rcbop.p7strategy.application1;

public abstract class PrivateBankStrategy implements IStrategy{
	
	@Override
	public void doMethod() {
		addRegistry();
		verifyRegistry();
		validateRegistryWithCentralBank();
		saveRegistry();
	}
	
	public abstract void addRegistry();
	
	public abstract void verifyRegistry();
	
	public abstract void validateRegistryWithCentralBank();
	
	public abstract void saveRegistry();

}
