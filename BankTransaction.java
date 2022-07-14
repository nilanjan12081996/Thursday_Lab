/*
 * @Author Nilanjan Dasgupta
 */
package basicprogram;
import java.util.*;
/*
 * create a bank class to calculate withdraw and deposit.if amount will be given from user.if amount is sufficient then “withdraw successful” will going to print. 
 * Later on deposit 5000rs in the account balance.
 */
public class BankTransaction {

	public static void main(String[] args) {
		float balance;//  declare a variable balance to store Account balance
		float withdraw;// declare a variable to store withdraw amount
		float deposite=5000.00f;//declare a variable deposite and initialize with 5000.
		Scanner sc=new Scanner(System.in);// creating the object of scanner class
		System.out.println("Enter your Balance: ");
		balance=sc.nextFloat();//take input from user and store in the balance
		System.out.println("Enter the ammout you want to withdraw: ");
		withdraw=sc.nextFloat();// take input from user how much amount user want to withdraw and store in the variable withdraw
		if(withdraw>balance)// check if withdraw amount is greater than or not
			System.out.println("insufficient Balance");
		else
		{
			balance=balance-withdraw;// update the balance after successful transaction
			System.out.println("withdraw successful");
			System.out.println("Reamining balace is: "+balance);// print the updated balance
		}
		
		System.out.println("Do you want to deposite:(Y/N)");//ask user for deposite
		char ch=sc.next().charAt(0);
		if(ch=='Y')// check if YES or NO
		{
			
			balance=balance+deposite;// update the balance after deposite
			System.out.println("Your ac is credited with "+balance);// print the updated balance
		}
		else
			System.out.println("Thank You");

	}

}
