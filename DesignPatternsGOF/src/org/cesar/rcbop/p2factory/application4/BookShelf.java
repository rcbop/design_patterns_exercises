package org.cesar.rcbop.p2factory.application4;

public class BookShelf implements IGenericShelf {

	@Override
	public ILibraryItem makeItem() {
		return new Book();
	}

}
