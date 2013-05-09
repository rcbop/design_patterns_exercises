package org.cesar.rcbop.p7strategy.application1;

public class PrivateBank extends PrivateBankStrategy{

	@Override
	public void addRegistry() {
		print("Adding registry");
	}

	@Override
	public void verifyRegistry() {
		print("Verifying registry");
	}

	@Override
	public void validateRegistryWithCentralBank() {
		print("Validating registry with central bank");
	}

	@Override
	public void saveRegistry() {
		print("Saving registry to database");
	}
	
	private void print(String log) {
		System.out.println("["+this.getClass().getSimpleName() + "] " + log);
	}
	

}
