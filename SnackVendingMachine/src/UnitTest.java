import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddVendingBalance()  {
	    SnackMachine machineTest = new SnackMachine();
	    machineTest.calTotal(7);
	    assertEquals("Test total money in machine.",7, SnackMachine.getTotal(), 0);
	}
	
	@Test
	public void testAddVendingBalance2()  {
	    SnackMachine machineTest = new SnackMachine();
	    machineTest.calTotal(10);
	    assertEquals("Test total money in machine.",10, SnackMachine.getTotal(),10);
	}
	
	@Test
	public void testAddingSnacktoMenu()  {
	    SnackMachine machineTest = new SnackMachine();
	    machineTest.addSnackToMenu(0, "sth", 5.5, 5);
	    ArrayList<Snack> actual = machineTest.getMenu();
	    Object [] expected = {0, "sth", 5.5, 5};
	    Assert.assertEquals(expected[0],actual);
	}



}
