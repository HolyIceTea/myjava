package mybank;

public class Kakao extends Bank{
	@Override
	public int showBalance() {
		this.setMoney(this.getMoney() / 2);
		return super.showBalance();
	}
}
