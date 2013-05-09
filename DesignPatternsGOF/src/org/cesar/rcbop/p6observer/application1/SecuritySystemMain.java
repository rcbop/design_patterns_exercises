package org.cesar.rcbop.p6observer.application1;

public class SecuritySystemMain implements Runnable {

	private int TIMEOUT = 10;
	private SecurityaAnaliserObserver analiser;

	public SecuritySystemMain() {
		analiser = new SecurityaAnaliserObserver();
		new SecurityTerminal1(analiser);
		new SecurityTerminal2(analiser);
	}

	@Override
	public void run() {
		System.out.print("SEARCHING INTRUDERS: ");
		try {
			for (int i = 0; i < TIMEOUT; i++) {
				System.out.print(i + 1 + " ");
				if (i+1 == 10) {
					System.out.println();
				}
				synchronized (this) {
					wait(1000);
				}
			}
			analiser.soundAlarm();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
