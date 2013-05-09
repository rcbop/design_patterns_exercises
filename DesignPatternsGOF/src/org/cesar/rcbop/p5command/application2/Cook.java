package org.cesar.rcbop.p5command.application2;

import java.util.ArrayList;
import java.util.List;

public class Cook implements OnFinishedCooking {

	String name;
	private List<OnAvaiableCook> avaiableListeners;

	public Cook(String name) {
		this.name = name;
	}

	public void addOnAvaiableListener(OnAvaiableCook listener) {
		if (avaiableListeners == null) {
			avaiableListeners = new ArrayList<>();
		}
		avaiableListeners.add(listener);
	}

	public void cookFood(String orderName) {
		new CookingProcess(this, orderName).start();
	}

	@Override
	public void onFinishedCooking(String orderName) {
		System.out.println(name + " has finished cooking order: " + orderName);
		System.out.println(name + " is avaiable");
		if (avaiableListeners != null && avaiableListeners.size() > 0) {
			avaiableListeners.get(0).avaiableCook(Cook.this);
		}
	}
}
