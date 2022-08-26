/*
 * @Author Nilanjan Dasgupta
 */
/*
 * Write a program to find out total how many palindrome word is there in a string
 */
package thursdaylab;

import java.util.Scanner;

public class CountPalindromString {//class CountPalindromString
	//method to perform count palindrom string
	public  void palindrom(String str)
	{
		int count =0;
		String[] arr1=str.split(" ");// split the string in to array using the space
		// logic for palindrome string count
		for(int i=0;i<arr1.length;i++)
		{
			String rev="";
			for(int j=arr1[i].length()-1;j>=0;j--)
			{
				rev=rev+arr1[i].charAt(j);				
			}
			if(arr1[i].equalsIgnoreCase(rev))
				count++;
		}
		System.out.println("Number of palindrom: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		CountPalindromString cs=new CountPalindromString();// create the instance of CountPalindromString class
		cs.palindrom(str); // invoke the method palindrome
	}

}
