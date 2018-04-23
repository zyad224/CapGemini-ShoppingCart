
/**
 * This is the Apple class that inherits from the Fruit class.
 * @author Zeyad
 *
 */
public class Apple extends Fruit {
	
	static double cost= 60;
	
	/**
	 * Constructor of the Apple class
	 * @param d
	 * @param offer
	 */
	public Apple( String offer) {
		super(cost,offer);
		
		
	}
	
	

	/**
	 * This method returns the price of the apple item
	 * @return
	 */
	public double getApplePrice() {
		return super.getPrice();
	}

}
