import java.util.ArrayList;
import java.util.Scanner;

import Money.CardSlot;
import Money.CoinSlot;
import Money.NoteSlot;

public class SnackMachine {
	private ArrayList<Snack> menu;
    public static double total=0.0;
   
    private  ArrayList<Purchase> purchases;
    private CoinSlot coins;
    private NoteSlot notes;
    private CardSlot card;
    private  double change;
    
    public SnackMachine(){
        this.menu = new ArrayList<Snack>();
        this.purchases = new ArrayList<Purchase>();
    }

	public ArrayList<Snack> getMenu() {
		return menu;
	}
	

	public CoinSlot getCoins() {
		return coins;
	}

	public void setCoins(CoinSlot coins) {
		this.coins = coins;
	}

	public NoteSlot getNotes() {
		return notes;
	}

	public void setNotes(NoteSlot notes) {
		this.notes = notes;
	}

	public CardSlot getCard() {
		return card;
	}

	public void setCard(CardSlot card) {
		this.card = card;
	}

	public void setMenu(ArrayList<Snack> menu) {
		this.menu = menu;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		SnackMachine.total = total;
	}

	public ArrayList<Purchase> getPurchases() {
		return purchases;
	}

	public void setPurchases(ArrayList<Purchase> purchases) {
		this.purchases = purchases;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}
    
	// to calculate total accumulated money entered in the machine
	public void calTotal(double inmoney) {
			setTotal(getTotal() + inmoney);
	        System.out.println("accumulated amount of money: "+ getTotal());
	       

		}
	
	// Creating an item by instantiating new snack objects 
	public void addSnackToMenu(int index,  String name, double price, int amount){
	    Snack newsnack = new Snack(index, name, price, amount);
	    
	    this.menu.add(newsnack);
	   
	}
	
	// Display the menu consitsting of snacks index, name, prince and amount
	public void displayMenu(){
	    for (Snack item: this.menu){
	    //    System.out.println( item.getSnackIndex() + " " + item.getNameOfSnack()+ " -- $ "+ item.getPriceofSnack());
	       System.out.println( item.getSnackIndex() + "|" + item.getSnackName()+ " -- $ "+ item.getSnackPrice() + "--" + item.getSnackAmount());

	    }
	    }
	
	// The process of purchasing
    // 1- Menu of snacks is displayed to the user
    // 2- The user is asked to enter his name for the purchase
    // 3 the user is asked to enter the id of snack item, if snack isn't in stock it'll show the message that
    // this snack isn't available
    // 4- the user can keep picking snacks until he enter x to exit
    // 5- the costumer name and the list of his purchase with the total cost is displayed
    // 6- the user is asked to choose payment method by entering associated number
    // 7- for each payment method the machine checked if the money is valid
    // 8- if the entered amount isn't enough or money type entered isn't valid an error message will be display 
    // 9- if all is good, total amount of money entered of the machine and,,, success purchase with amount of change will be displayed 
	public void newPurchase() {
		Scanner userName = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        
        Scanner userInMoney = new Scanner(System.in);
        Scanner inIndex = new Scanner(System.in);
        double inMoney=0.0;
    	
        System.out.println("Please enter customer name for new order:");
        
		String inputName = userName.next();
//        String name = System.console().readLine();
    
    
        Purchase newPurchase = new Purchase(inputName);
        System.out.println("-------------");
        System.out.println("Check out our menu:");
        System.out.println("-------------");
        displayMenu();
        System.out.println("-------------");
        
    
        System.out.println("Please enter a menu item index or x to exit:");
        String snackNumber = inIndex.next();
        
       
        while(!snackNumber.equals("x")) {
            
            int snackIndex = Integer.parseInt(snackNumber);
                    Snack purchasedSnack = this.menu.get(snackIndex);
                    
                     int remain  =purchasedSnack.getSnackAmount();
                     int totalremain = remain -1;
                     purchasedSnack.setSnackAmount(totalremain);

                    if (purchasedSnack.getSnackAmount() == 0){
                        System.out.println("This snack is not available");
                    }

                    else {
                    
                    newPurchase.addSnack(purchasedSnack);
                    System.out.println("Please enter a menu item index or x to exit:");
        snackNumber = inIndex.next();;
        
        

                    }   
        
    }
        System.out.println("-------------");
        System.out.println("Your orders and Total price");
    System.out.println("-------------");
    newPurchase.display();
    System.out.println("-------------");
   
        System.out.println("Choose Your Payment Method");
		
		System.out.println("1 for Coins");
		System.out.println("2 for Notes");
		System.out.println("3 for Cards");
        int enterdMethod = userInput.nextInt();
		
        switch(enterdMethod) {
		case 1:
			System.out.println("accepted Coints in 10 cents, 20 cents, 50 cents, 1$");
			inMoney = userInMoney.nextDouble();
			if(inMoney >= newPurchase.getPurchaseTotal() && (inMoney == .1 || inMoney == .2 || inMoney == .5 || inMoney == 1)) {
				System.out.println("-------------");
					System.out.println("SUCCESSFULLY PURCHASED.");
					System.out.println("The CHANGE: " + (inMoney - newPurchase.getPurchaseTotal()));
                    System.out.println("-------------");
                    calTotal(inMoney);
                    System.out.println("-------------");		
				
			}
			else {
                System.out.println("-------------");
				System.out.println("Entered Money is not enough or Invalid!");
                System.out.println("-------------");
			}
			break;

            case 2:
			System.out.println("accepted Notes in 20$ or 50$");
			inMoney = userInMoney.nextDouble();
			if(inMoney >= newPurchase.getPurchaseTotal() && (inMoney == 50 || inMoney == 20)) {
                System.out.println("-------------");
					System.out.println("SUCCESSFULLY PURCHASED.");
					System.out.println("The CHANGE: " + (inMoney - newPurchase.getPurchaseTotal()));
                     System.out.println("-------------");
                    calTotal(inMoney);
                    System.out.println("-------------");
						
				
			}
			else {
                System.out.println("-------------");
				System.out.println("Entered Money is not enough or Invalid!");
                System.out.println("-------------");
			}
			break;

            case 3:
			System.out.println("Enter the amount from your card balance");
			inMoney = userInMoney.nextDouble();
			if(inMoney >= newPurchase.getPurchaseTotal()) {
				    System.out.println("-------------");
					System.out.println("SUCCESSFULLY PURCHASED.");
					System.out.println("The CHANGE: " + (inMoney - newPurchase.getPurchaseTotal()));
                     System.out.println("-------------");
                    calTotal(inMoney);
                    System.out.println("-------------");
						
			}
			else {
                System.out.println("-------------");
				System.out.println("Entered Money is not enough!");
                System.out.println("-------------");
			}
			break;

            case 4:
			
		
			System.out.println("Machine is out of service!");

}


}

}
