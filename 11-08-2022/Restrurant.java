/*
 * @Author Nilanjan Dasgupta
 */
package array;

import java.util.Scanner;
//Restrurant class
public class Restrurant {
	
//main method
	public static void main(String[] args) {
		System.out.println("******************************WelCome to Restrurant management System********************");
		SelectMenu sm=new SelectMenu();
		char ch;
		sm.displaymenu();//invoke the display menu function
		//sm.selectmenu();
		Scanner sc=new Scanner(System.in);
		do {
			//ask user for order food or not
		System.out.println("do you want to order(y/n)?");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'y':
			sm.selectmenu(); //invoke selectmenu method
			break;
		case 'n':
		sm.bill();// invoke bill method
		break;
		}
		}while(ch!='n');
		
		
		
	}

}
