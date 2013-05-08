package org.cesar.rcbop.p4adapter.application1;

public class Softdrink {
	
	int number;
	
	public Softdrink(int number) {
		this.number = number;
	}

	public void refrigerate() {
		System.out.println("The drink is cool enough");
	}
	
	public void drink(){
		System.out.println("Refreshing drink");
	}
}
