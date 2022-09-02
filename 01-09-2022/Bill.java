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
	 static void order(String fname,double d)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("============================================================");
		
		for(Billing i: alist)
		{
			System.out.println(i.fname+" "+i.quantity+" "+i.amount);
			total+=i.amount;
		}
		System.out.println("===============================================================");
		System.out.println("Total: "+total);
		//ask user for coupon
		System.out.println("do you have coupon:(y/n?) ");
		char co=sc.next().charAt(0);
		//if coupon apply then get 10% discount
		if(co=='y')
		{
			System.out.println("enter coupon number: ");
			long num=sc.nextLong();
			if(num==123456789l)
			{
				double dis=total*0.10;
				double ftotal=total-dis;
				System.out.println("You have to pay: "+ftotal);
				
			}
			else
				System.out.println("coupon not applicable");
		}
		//otherwise you have to pay total bill
		else 
		{
			System.out.println("You Have to pay: "+total);
		}
	}
	
}
