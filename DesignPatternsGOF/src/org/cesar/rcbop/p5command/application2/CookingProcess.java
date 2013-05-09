package org.cesar.rcbop.p5command.application2;

public class CookingProcess extends Thread {

	private String orderName;
	private OnFinishedCooking listener;

	public CookingProcess(OnFinishedCooking listener, String orderName) {
		this.orderName = orderName;
		this.listener = listener;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("is cooking order: " + orderName);
		System.out.print("cooking...");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				synchronized (this) {
					wait(300);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("\n");
		if (listener != null) {
			listener.onFinishedCooking(orderName);
		}
	}

}
