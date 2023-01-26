package Money;

public class CoinSlot extends MoneySlot {
	private double coins;

	   public CoinSlot() {
	       
	    }

	public double getCoins() {
		return coins;
	}

	public void setCoins(double coins) {
		this.coins = coins;
	}
	   
	public void findTotal() {
		System.out.println("coins" + this.coins);
	}

}
