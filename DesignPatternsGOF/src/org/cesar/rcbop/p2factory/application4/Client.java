package org.cesar.rcbop.p2factory.application4;

public class Client {

	public Client() {
		IGenericShelf generic = new BookShelf();
		ILibraryItem book = generic.makeItem();
		System.out.println(book.getPrice());
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
