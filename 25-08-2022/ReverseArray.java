/*
 * @Author Nilanjan Dasgupta
 */
//print reverse of an array
package thursdaylab;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//create an integer array of size 10
		int arr[]=new int[10];
		// variable n is for number elements input by the user in  array
		// variable i is use as  index of array
		int n,i;
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		//take elements from user
		for(i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();
		}
		//logic for reverse array
		System.out.println("after reverse: ");
		for(i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		

	}

}
