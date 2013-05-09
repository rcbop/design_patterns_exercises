package org.cesar.rcbop.p6observer.application2;

public class MainTest {

	public static void main(String[] args) {
		final DataScreen1 screen1 = new DataScreen1();
		final DataScreen2 screen2 = new DataScreen2();
		Thread thread1 = createThread(screen1);
		Thread thread2 = createThread(screen2);
		
		thread1.start();
		thread2.start();
	}

	private static Thread createThread(final Screen dataScreen) {
		Thread threadUI = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					dataScreen.insertData(i+1+"");
				}
			}
		});
		return threadUI;
	}
}
