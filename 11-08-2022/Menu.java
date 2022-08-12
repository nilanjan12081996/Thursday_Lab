package array;
//Menu class
public class Menu {
	//instance variable
int fid;
String menuName;
double price;
int quantity;
double price1;
double totalinduvisual;
String menu;
//constructor for send the data to the array which print the menu list
Menu(int fid,String menuName,double price)

{
	this.fid=fid;
	this.menuName=menuName;
this.price=price;
	}
//constructor for send the data to the array which print the order details input by users
Menu(int quantity,double price1,double totalinduvisual,String menu)
{
	this.quantity=quantity;
	this.price1=price1;
	this.totalinduvisual=totalinduvisual;
	this.menu=menu;
}
//call the getter and setter method
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
