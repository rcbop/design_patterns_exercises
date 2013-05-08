package org.cesar.rcbop.p6observer.application1;

public class SecurityTerminal2 implements ISecuritySystem {

	public SecurityTerminal2(SecurityaAnaliserObserver sao) {
		sao.addSystem(this);
	}

	@Override
	public void soundAlarm(String currentTime) {
		System.out.println("["+this.getClass().getSimpleName()+"]"+
				" INTRUDER DETECTED AT: " + currentTime);
	}

}
