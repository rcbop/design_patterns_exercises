package org.cesar.rcbop.p3abstractfactory.application2;

public class HardDisk implements Memory{

	@Override
	public void recordData() {
		System.out.println("Recording data in hard disk");		
	}
	
}
