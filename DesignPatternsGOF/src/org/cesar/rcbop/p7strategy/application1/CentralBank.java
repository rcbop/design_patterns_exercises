package org.cesar.rcbop.p7strategy.application1;

public class CentralBank extends CentralBankStrategy {

	@Override
	public void addRegistry() {
		print("Adding registry to system");
	}

	@Override
	public void verifyRegistry() {
		print("Registry verification");
	}

	@Override
	public void saveRegister() {
		print("Saving registry to database");
	}
	
	private void print(String log) {
		System.out.println("["+this.getClass().getSimpleName() + "] " + log);
	}

}
