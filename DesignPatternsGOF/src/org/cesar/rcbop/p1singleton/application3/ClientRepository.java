package org.cesar.rcbop.p1singleton.application3;

import java.util.LinkedList;

public class ClientRepository {

	/**
	 * Singleton without lazy initiation
	 */
	private static ClientRepository instance = new ClientRepository();
	private LinkedList<Client> dataList = new LinkedList<>();

	private ClientRepository() {
		dataList = new LinkedList<>();
	}

	/**
	 * Synchronized getInstance()
	 * 
	 * @return
	 */
	public synchronized static ClientRepository getInstance() {
		return instance;
	}

	public void addClient(Client c) {
		dataList.add(c);
	}

	public Client getClient(long id) {
		Client rtn = null;
		for (Client client : dataList) {
			if (client.getId() == id)
				rtn = client;
		}
		return rtn;
	}

	public void dump() {
		System.out.println("DUMPING!!");
		for (Client cli : dataList) {
			System.out.println(cli.toString());
		}
	}

}
