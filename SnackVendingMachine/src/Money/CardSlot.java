package Money;

public class CardSlot extends MoneySlot {
	private double balance;

	   public CardSlot() {
	       
	    }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void findTotal() {
		System.out.println("user balance" + this.balance);
	}
	   
	   
	   
	

}
