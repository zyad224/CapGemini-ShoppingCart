import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class implements the checkout system for the shop.
 * It reads a list of fruits from the user and then calculates
 * the total price that the user should pay.
 * 
 * @author Zeyad
 *
 */
public class checkoutSystem {
	
	private ArrayList<Fruit> itemsScanned ;
	private double totalPrice;
	private ArrayList<Fruit> shoppingBag=new ArrayList<Fruit>();
	private int  orangeCounter;
	/**
	 * Constructor of the checkout system
	 */
	public checkoutSystem() {
		
		itemsScanned= new ArrayList<Fruit>();	
	}
	
	/**
	 * This method scan the items from the user as a string. It uses the method
	 * equalsIgnoreCase to make the program to handle different situations.
	 * {orange, ORANGE, oraNGE, etc}. 
	 */
	void scanItems() {
		
		try {
			System.out.println("Insert items then click enter (insert exit to terminates)");
	        // Get the object of DataInputStream
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        String line = "";
	        while ((line = br.readLine()) != null && !line.equals("exit") ) {
	        	if(line.equalsIgnoreCase("Apple")) {
	        		Apple a= new Apple("0");
		        	itemsScanned.add(a);

	        	}
	        	else if(line.equalsIgnoreCase("Orange")) {
	        		Orange o= new Orange("0");
		        	itemsScanned.add(o);
	        	}
	        }
	        isr.close();
	    } catch (IOException ioe) {
	        ioe.printStackTrace();
	    }
	    
	}
	
	/**
	 * This method calculates the total amount of money the user should pay
	 * from the scanned items.
	 * @return
	 */
	double calculateTotalPrice() {
		
		Iterator itr = itemsScanned.iterator();
		
		
		while (itr.hasNext()) {
			 Fruit e= (Fruit) itr.next();
			 shoppingBag.add(e);
			 if(e.getPrice()==60) {
				 shoppingBag.add(new Apple("0)"));
			 }
			 else if(e.getPrice()==25) {
				 orangeCounter++;
				 if(orangeCounter==3) {
				    totalPrice-=25;
				    orangeCounter=0;
				 }
				 
			 }
			totalPrice+=e.getPrice();
		}
		
		  System.out.println("shopping bag"+shoppingBag);

		return totalPrice/100.0;
	}




public static void main(String args[]) 
{
	double totalPrice;
     
    checkoutSystem c=new checkoutSystem();
    
   c.scanItems();
   totalPrice=c.calculateTotalPrice();
   System.out.println("Total Price="+totalPrice + " pounds");
   
    
         
}
}
