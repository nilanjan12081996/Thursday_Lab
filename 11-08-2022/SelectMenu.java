package array;

import java.util.Scanner;
//create a class 
public class SelectMenu {
	// set the menus price and id of food
	String m1="Biriyani Combo";
	String m2="Chinese Combo";
	String m3="Bada Platter";
	String m4="Kebab Platter";
	String m5="Steam Momo(6pcs)";
	String m6="Panfried Momo(6pcs)";
	double p1=200,p2=350,p3=150,p4=250,p5=100,p6=120;
	int i1=1,i2=2,i3=3,i4=4,i5=5,i6=6,i7=7;
	//create a carry of Menu type and pass the menus price and id of food
	Menu[] m={new Menu(i1,m1,p1),new Menu(i2,m2,p2),new Menu(i3,m3,p3),
			new Menu(i4,m4,p4),new Menu(i5,m5,p5),new Menu(i6,m6,p6)
	};
	
	static int index=0;
	Menu food[]=new Menu[10];//create another array of Menu type
	Scanner sc=new Scanner(System.in);
	// method for display menu
	public void displaymenu()
	{
		for(int i=0;i<m.length;i++)
		{
			System.out.print(m[i].getFid()+"."+m[i].getMenuName()+"      Rs."+m[i].getPrice()+"\n");
		}
	}
	//method for select menus
	public  void selectmenu()
	{
		int i,quantity,id;
		//double total=0.0;
		System.out.println("\nenter the food id: ");
		 id=sc.nextInt();
		for(i=0;i<m.length;i++)
		{
			// search by food id
	if(m[i].getFid()==id)
	{
		System.out.println(m[i].getMenuName());
		System.out.println("enter the quantity: ");
		String menu=m[i].getMenuName();
		 quantity=sc.nextInt();
		 double price1=m[i].getPrice();
		 double totalinduvisual=quantity*price1;
		 //copy the price total indivisual price and quantity input by the user to the food array
		 food[index]=new Menu(quantity,price1,totalinduvisual,menu);
		 index++;
	}
		}
	
	}
	// method for generate the bill
	public void bill()
	{
		double total=0.0;
		// for print the food item name quantity and total price of the food
		for(int i=0;i<index;i++)
		{
			System.out.println(food[i].menu+"       "+food[i].quantity+" "+food[i].totalinduvisual);
			total=total+food[i].totalinduvisual;
		}
		System.out.println("Total: "+total);
	}
}
	
