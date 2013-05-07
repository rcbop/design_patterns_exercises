package org.cesar.rcbop.p1singleton.application5;

import java.io.IOException;

public class MainTest {

	public static void main(String[] args) {
		try {
			System.out.println(StaticBlockSingleton.getInstance().read().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
