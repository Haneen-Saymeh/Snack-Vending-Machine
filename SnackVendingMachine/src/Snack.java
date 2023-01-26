
public class Snack {
	private int index;
    private String name;
    private double price;
    private int amount;
    
    public Snack() {
        
    }

    public  Snack(int index, String name, double price, int amount){
        this.index= index;
        this.name = name;
        this.price = price;
        this.amount = amount;
        

    }

	public int getSnackIndex() {
		return index;
	}

	public void setSnackIndex(int index) {
		this.index = index;
	}

	public String getSnackName() {
		return name;
	}

	public void setSnackName(String name) {
		this.name = name;
	}

	public double getSnackPrice() {
		return price;
	}

	public void setSnackPrice(double price) {
		this.price = price;
	}

	public int getSnackAmount() {
		return amount;
	}

	public void setSnackAmount(int amount) {
		this.amount = amount;
	}


}
