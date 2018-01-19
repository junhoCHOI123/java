package oop6;

public class Account {
	int money1;
	static int money2;
	
	public Account(int money) {		//con
		money1 += money;
		money2 += money;
	}
	
	@Override
	public String toString() {
		return money1 + ","+ money2;
	}
}