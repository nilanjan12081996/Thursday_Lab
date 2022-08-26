/* 
 @Author Nilanjan Dasgupta
 */
//write a program to find out first and last digit of any number
package basicprogram;
import java.util.*;
public class FirstAndLastDigit {

	public static void main(String[] args) {
		int n;//declare a variable n 
		Scanner sc=new Scanner(System.in);// creating object of Scanner class
		System.out.println("Enter the Number: ");
		n=sc.nextInt();//take input from user and store the value in the variable 
		int firstDigit=0;// declare a variable firstDigit and initialize it with 0
		int lastDigit=0;//declare a variable LastDigit and initialize it with 0
		lastDigit=n%10;//find the last digit
		System.out.println("The Last Digit is: "+lastDigit);
		//finding the 1st digit
		for(;n>=10;)
		{
			n=n/10;
		}
		System.out.println("The first Digit is: "+n);
	}

}
