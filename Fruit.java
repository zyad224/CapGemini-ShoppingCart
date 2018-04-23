/**
 * 
 * @author Zeyad
 * 
 * This is an abstract class for the object Fruit in the shop.
 * Each Fruit object has a cost and an offer depending on the Fruit [apple or orange].
 */
public class Fruit {
	
	private float cost;
	private String fruitOffer;
	
	
	/**
	 * Constructor of the class Fruit
	 * @param cost cost of the item
	 * @param fruitOffer offer on the item
	 */
	public Fruit(float cost, String fruitOffer) {
		this.cost=cost;
		this.fruitOffer=fruitOffer;
	}
	
	/**
	 * This method returns the price of the item
	 * @return cost
	 */
	public float getPrice() {
		return this.cost;
	}
	
	/**
	 * This method return the offer of the item
	 * @return
	 */
	public String getFruitOffer() {
		return this.fruitOffer;
	}

}
