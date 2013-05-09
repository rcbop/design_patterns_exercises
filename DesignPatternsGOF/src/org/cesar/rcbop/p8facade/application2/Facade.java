package org.cesar.rcbop.p8facade.application2;

public class Facade {
	public String doSomething() {
		return new Server().doSomething();
	}
}
