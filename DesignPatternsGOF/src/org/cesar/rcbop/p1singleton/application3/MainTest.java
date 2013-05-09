package org.cesar.rcbop.p1singleton.application3;

public class MainTest {

	public static void main(String[] args) {

		final ClientRepository db = ClientRepository.getInstance();

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				ClientRepository db2 = ClientRepository.getInstance();
				for (int i = 0; i < 10; i++) {
					db2.addClient(new Client(i, "roger" + i));
				}
				System.out.println("TRUE IF SAME OBJECT:" + db2.equals(db));
			}
		});

		thread.start();

		db.addClient(new Client(001, "DB1 roger"));
		db.addClient(new Client(543, "DB1 roger2"));

		db.dump();
	}
}
