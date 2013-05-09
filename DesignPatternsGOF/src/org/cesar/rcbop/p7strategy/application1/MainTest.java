package org.cesar.rcbop.p7strategy.application1;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		System.out.println("//COMENCING STRATEGY//");
		
		List<IStrategy> commandQueue = new ArrayList<>();
		
		IStrategy privateBank = new PrivateBank();
		IStrategy centralBank = new CentralBank();
		
		commandQueue.add(centralBank);
		commandQueue.add(privateBank);
		
		for (IStrategy strategy : commandQueue)
			strategy.doMethod();
	}
}
