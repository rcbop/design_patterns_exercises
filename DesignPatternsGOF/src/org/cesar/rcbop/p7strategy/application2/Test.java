package org.cesar.rcbop.p7strategy.application2;

public class Test {
	public static void main(String[] args) {
		ArithmeticOperation addition = new ArithmeticOperation(new Add());
		ArithmeticOperation subtraction = new ArithmeticOperation(new Subtract());
		ArithmeticOperation division = new ArithmeticOperation(new Divide());
		ArithmeticOperation multiplication = new ArithmeticOperation(new Multiply());

		System.out.println(addition.executeOperation(10, 5));
		System.out.println(subtraction.executeOperation(10, 5));
		System.out.println(division.executeOperation(10, 5));
		System.out.println(multiplication.executeOperation(10, 5));
	}
}
