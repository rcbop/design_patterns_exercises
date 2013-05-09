package org.cesar.rcbop.p6observer.application1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SecurityaAnaliserObserver {

	private List<ISecuritySystem> systems;
	private Calendar calendar;

	public SecurityaAnaliserObserver() {
		calendar = Calendar.getInstance();
		systems = new ArrayList<>();
	}

	public void addSystem(ISecuritySystem system) {
		systems.add(system);
	}

	public void soundAlarm() {
		calendar.setTimeInMillis(System.currentTimeMillis());
		for (ISecuritySystem securitySystem : systems) {
			securitySystem.soundAlarm(calendar.getTime().toString());
		}
	}
}
