package org.cesar.rcbop.p2factory.application4;

public class MagazineShelf implements IGenericShelf{

	@Override
	public ILibraryItem makeItem() {
		return new Magazine();
	}

}
