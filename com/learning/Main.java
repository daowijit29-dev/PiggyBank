package com.learning;

public class Main {
	public static void main(String[] args) {
		PiggyBank porjai = new PiggyBank("น้องพอใจ");

		porjai.showMoney();

		porjai.addMoney(20);
		porjai.addMoney(50);
		porjai.addMoney(30);

		porjai.showMoney();
	}
}


