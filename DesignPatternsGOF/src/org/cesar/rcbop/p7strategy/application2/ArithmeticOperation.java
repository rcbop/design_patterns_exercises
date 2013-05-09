package org.cesar.rcbop.p7strategy.application2;

public class ArithmeticOperation {

	private IStrategy operation;

	public ArithmeticOperation(IStrategy operation) {
		this.operation = operation;
	}

	public double executeOperation(double a, double b) {
		return operation.execute(a, b);
	}

}
