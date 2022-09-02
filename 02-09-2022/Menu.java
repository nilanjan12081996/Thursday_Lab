/*
 * @Author Nilanjan Dasgupta
 */
package restrurantmanagment2;
//Menu class for store fooditem and price
public class Menu {
	
	String fooditem;
	double price;
	
	public String getFooditem() {
		return fooditem;
	}
//getter and setter method
	public void setFooditem(String fooditem) {
		this.fooditem = fooditem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
//constructor of Menu class
	public Menu(String fooditem, double price) {
		super();
		this.fooditem = fooditem;
		this.price = price;
	}
	//display method to display food Menu
	public void display()
	{
		System.out.println(getFooditem()+"   "+getPrice());
	}

}
