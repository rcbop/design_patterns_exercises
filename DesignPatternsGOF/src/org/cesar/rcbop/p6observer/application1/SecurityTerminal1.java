package org.cesar.rcbop.p6observer.application1;

public class SecurityTerminal1 implements ISecuritySystem {

	public SecurityTerminal1(SecurityaAnaliserObserver sao) {
		sao.addSystem(this);
	}

	@Override
	public void soundAlarm(String currentTime) {
		System.out.println("[" + this.getClass().getSimpleName() + "]"
				+ " INTRUDER DETECTED AT: " + currentTime);
	}

}
