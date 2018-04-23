/**
 * This is the orange class that inherits from the Fruit class
 * @author Zeyad
 *
 */
public class Orange extends Fruit {
	
	static double cost=25;
	/**
	 * Constructor of the Orange class
	 * @param d
	 * @param offer
	 */
	public Orange( String offer) {
		super(cost,offer);
		
	}
	
	/**
	 * This method returns the price of orange item
	 * @return
	 */
	public double getOrangePrice() {
		return super.getPrice();
	}

}
