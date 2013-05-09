package org.cesar.rcbop.p8facade.application2;

public class ClientOther implements IClient {

	public ClientOther() {
		askDoSomething();
	}

	@Override
	public void askDoSomething() {
		System.out.println(new Facade().doSomething());
	}
}
