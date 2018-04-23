/**
 * This is the orange class that inherits from the Fruit class
 * @author Zeyad
 *
 */
public class Orange extends Fruit {
	
	/**
	 * Constructor of the Orange class
	 * @param cost
	 * @param offer
	 */
	public Orange(float cost, String offer) {
		super(cost,offer);
		
	}
	
	/**
	 * This method returns the price of orange item
	 * @return
	 */
	public float getOrangePrice() {
		return super.getPrice();
	}

}
