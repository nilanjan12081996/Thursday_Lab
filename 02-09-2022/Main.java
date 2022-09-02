/*
 * @Author Nilanjan Dasgupta
 */
package restrurantmanagment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//create Main class
public class Main {
	//main method
	public static void main(String[] args) {
		// create a HasMap of Menu type of with key value pair where key is id here and value is food name and its price
		HashMap<Integer, Menu> hmap=new HashMap<Integer, Menu>();
		//create instance of Scanner class
		Scanner sc=new Scanner(System.in);
		// take variables id ,quantity for food quantity
		//and ch for enter user choice that user orderd food or not
		int id, quantity;
		char ch='y';
		//put the value and key in the HashMap
		hmap.put(1,new Menu("Biriyani",250));
		hmap.put(2,new Menu("Chinese Combo",350));
		hmap.put(3,new Menu("Kebab Platter",230));
		hmap.put(4,new Menu("Mixed Fried Rice",240));
		hmap.put(5,new Menu("Chicken Noodles",150));
		hmap.put(6,new Menu("Chicken Momos",99));
		hmap.put(7,new Menu("PanFried Momos",120));
		hmap.put(8,new Menu("Dry Chilli Chicken(8pcs)",150));
		hmap.put(9,new Menu("Crispy Chilli Babycorn",120));
		hmap.put(10,new Menu("Fresh Lime Soda",60));
		hmap.put(11,new Menu("Coke(With Sugar)",50));
		hmap.put(12,new Menu("Coke(With out Sugar)",80));
		//print the key and value(food id ,food name and price)
Set<Map.Entry<Integer, Menu>> menu = hmap.entrySet();
		
		for(Map.Entry em:menu)
	{
			
			Menu mn = (Menu) em.getValue();
			System.out.print(em.getKey()+".");
			mn.display();//invoke display method
			
		}
		//take input from user for food id
		do {
		System.out.println("enter the food id: ");
		id=sc.nextInt();
		Menu mn= (Menu)hmap.get(id);
		Bill.BM(mn.getFooditem(),mn.getPrice());
		System.out.println("Do you want to order food(y/n?)");
		ch=sc.next().charAt(0);
	}while(ch!='n');
		Bill.getBill();

}
}
