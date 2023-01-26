import java.util.ArrayList;

public class Purchase {
	private String name;
	private ArrayList<Snack> snacks = new ArrayList<Snack>();
	
	public Purchase(){
	    this.name = "sth";
	    ArrayList<Snack> snacks = new ArrayList<Snack>();

	}
	
	public Purchase(String name){
	    this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Snack> getSnacks() {
		return snacks;
	}

	public void setSnacks(ArrayList<Snack> snacks) {
		this.snacks = snacks;
	}
	
	public ArrayList<Snack> addSnack(Snack item){
	    this.snacks.add(item);
	    return this.snacks;
	    
	}

	public void getPurchaseSnacks(){
	    
	    for (Snack snack : this.snacks){
	    System.out.println(snack.getSnackName()+ ":" + snack.getSnackPrice());
	}   
	}
	
	public double getPurchaseTotal(){
	    double total = 0;
	    for (Snack snack: this.snacks){
	        total= total+ snack.getSnackPrice();
	    }
	    return total;
	}
	
	public void display(){
	    // This method is to print customer entered name and associated menu list and total price required.

	    System.out.println("costumer name:" + this.name);
	    for (Snack snack: this.snacks){
	    System.out.println( snack.getSnackName()+ " "+ snack.getSnackPrice());
	    

	    }
	 
	    System.out.println("total:" + this.getPurchaseTotal());

	}

}
