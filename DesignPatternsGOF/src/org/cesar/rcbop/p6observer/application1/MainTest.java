package org.cesar.rcbop.p6observer.application1;

public class MainTest {

	public static void main(String[] args) {
		SecuritySystemMain ssm = new SecuritySystemMain();
		new Thread(ssm).start();
	}
}
