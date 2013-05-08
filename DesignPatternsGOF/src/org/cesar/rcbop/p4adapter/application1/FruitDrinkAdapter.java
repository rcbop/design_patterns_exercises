package org.cesar.rcbop.p4adapter.application1;

import java.util.List;

public class FruitDrinkAdapter implements Drink{

	private List<FruitDrink> drinkList;
	
	public FruitDrinkAdapter(List<FruitDrink> drinkList) {
		this.drinkList = drinkList;
	}
	
	@Override
	public void drink(int i) {
		FruitDrink drink = drinkList.get(i);
		drink.mix();
		drink.drink();
	}
	
	public List<FruitDrink> getDrinkList() {
		return drinkList;
	}

}
