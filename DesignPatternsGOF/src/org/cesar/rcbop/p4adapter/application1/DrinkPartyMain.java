package org.cesar.rcbop.p4adapter.application1;

import java.util.ArrayList;
import java.util.List;

public class DrinkPartyMain {

	private static final int PARTY_SIZE = 10;

	public static void main(String[] args) {
		buyingChildrensSupplies();

		SoftDrinkAdapter softAdapter = new SoftDrinkAdapter(
				buyingChildrensSupplies());

		System.out.println("\n////Comencing children's party////\n");

		for (int i = 0; i < softAdapter.getListDrink().size(); i++) {
			softAdapter.drink(i);
		}

		FruitDrinkAdapter fruitAdapter = new FruitDrinkAdapter(
				buyingOldPeoplesSupplies());

		System.out.println("\n////Comencing old people's party////\n");

		for (int i = 0; i < fruitAdapter.getDrinkList().size(); i++) {
			fruitAdapter.drink(i);
		}
	}

	private static List<FruitDrink> buyingOldPeoplesSupplies() {
		List<FruitDrink> oldPeoplesParty = new ArrayList<>();
		for (int i = 0; i < PARTY_SIZE; i++) {
			oldPeoplesParty.add(new FruitDrink(i + 1));
		}
		return oldPeoplesParty;
	}

	private static List<Softdrink> buyingChildrensSupplies() {
		List<Softdrink> childrensParty = new ArrayList<>();
		for (int i = 0; i < PARTY_SIZE; i++) {
			childrensParty.add(new Softdrink(i + 1));
		}
		return childrensParty;
	}
}
