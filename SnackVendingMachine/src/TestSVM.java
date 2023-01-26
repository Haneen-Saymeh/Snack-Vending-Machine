
public class TestSVM {

	public static void main(String[] args) {
		/* ============ App Test Cases ============= */

		SnackMachine machine1 = new SnackMachine();
		machine1.addSnackToMenu(0, "Kit Kat",1.00,5);
		machine1.addSnackToMenu(1, "Coffee",1.5,7);
		machine1.addSnackToMenu(2, "pringles",17,3);
		machine1.addSnackToMenu(3, "Snickers",5.00,5);
		machine1.addSnackToMenu(4, "Twix",6,2);
		machine1.addSnackToMenu(5, "Chips",5,4);
		machine1.addSnackToMenu(6, "Coca cola",3.5,3);
		machine1.addSnackToMenu(7, "m&ms",3,6);
		machine1.addSnackToMenu(8, "Doritos",7,4);
		machine1.addSnackToMenu(9, "Pop corn",20,2);
	

		machine1.newPurchase();

	}

}
