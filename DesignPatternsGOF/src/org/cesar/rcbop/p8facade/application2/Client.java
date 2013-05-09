package org.cesar.rcbop.p8facade.application2;

public class Client implements IClient {

	public Client() {
		askDoSomething();
	}

	@Override
	public void askDoSomething() {
		System.out.println(new Facade().doSomething());
	}

}
