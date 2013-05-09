package org.cesar.rcbop.p5command.application2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Waitress implements OnAvaiableCook {

	String name;
	List<Command> orderList;

	public Waitress(String name) {
		this.name = name;
	}

	void placeOrder(Order order) {
		if (orderList == null) {
			orderList = new ArrayList<>();
		}
		orderList.add(order);
		System.out.println("Order queue " + Arrays.toString(orderList.toArray()));
	}

	@Override
	public void avaiableCook(Cook cook) {
		Command order = null;
		if (orderList != null && orderList.size() > 0) {
			order = orderList.remove(0);
			System.out.println("Order queue " + Arrays.toString(orderList.toArray()));
		}
		if (order != null) {
			order.execute(cook);
		}
	}
}
