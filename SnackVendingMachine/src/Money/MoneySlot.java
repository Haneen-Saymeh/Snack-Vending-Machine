package Money;

public abstract  class MoneySlot {
	 private double value;

	    
	   
     public MoneySlot() {
    }



	public double getValue() {
		return value;
	}



	public void setValue(double value) {
		this.value = value;
	}
     
	public abstract void findTotal();

}
