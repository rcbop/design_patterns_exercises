package org.cesar.rcbop.p4adapter.application1;

import java.util.List;

public class SoftDrinkAdapter implements Drink {

	private List<Softdrink> listDrink;

	public SoftDrinkAdapter(List<Softdrink> listDrink) {
		super();
		this.listDrink = listDrink;
	}

	@Override
	public void drink(int i) {
		Softdrink drink = listDrink.get(i);
		drink.refrigerate();
		drink.drink();
	}

	public List<Softdrink> getListDrink() {
		return listDrink;
	}

}
