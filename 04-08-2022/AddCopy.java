/*
 * Author Nilanjan Dasgupta
 */
/*
 * wap to add two array elements and store it in different array
 */
package array;

import java.util.Scanner;

public class AddCopy {

	public static void main(String[] args) {
		// create three integer array of size 10
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		int arr3[]=new int[10];
		// variable n is for number elements input by the user in array
		// variable i is use as  index of array
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		n=sc.nextInt();
		//take input of 1st array
		System.out.println("enter the elements for 1st array: ");
		for( i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		// take input of 2nd array
		System.out.println("enter the elements for 2ns array: ");
		for( i=0;i<n;i++)
		{
			arr2[i]=sc.nextInt();
		}
		//add the two array elements and copy those to another array
		System.out.println("After adding two array:");
		for(i=0;i<n;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
			System.out.println(arr3[i]);
			
		}
		
	
	}

}
