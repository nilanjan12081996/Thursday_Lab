/*
 * @Author Nilanjan Dasgupta
 */
package restrurantmanagment2;

import java.util.ArrayList;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//Bill class
public class Bill {
	//create a static ArrayList of Billing Type of
	static ArrayList<Billing> alist=new ArrayList<Billing>();
	// create a static method BM to take food name and price and pass from the BM method
	 static void BM(String fname,double d)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the food quantity: ");//ask user for quantity
		int quantity=sc.nextInt();
		alist.add(new Billing(fname,quantity,quantity*d));//calculate total price total food quantity and food name
	}
	 //create getbill method to generate total bill
	static void getBill()
	{
		double total=0.0;
		System.out.println("============================================================");
		
		for(Billing i: alist)
		{
			System.out.println(i.fname+" "+i.quantity+" "+i.amount);
			total+=i.amount;
		}
		System.out.println("===============================================================");
		System.out.println("You Have to pay: "+total);
	}
	
}
