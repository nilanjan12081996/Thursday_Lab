/*
 * @author Nilanjan Dasgupta
 */
/*
 * wap to copy all elements from an array to another array
 */
package array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		//create two integer array of size 10
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		// variable n is for number elements input by the user in array
		// variable i is use as  index of array
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		n=sc.nextInt();
		//take array elements from user
		System.out.println("enter the elements: ");
		for( i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		//copy the one array elements to another array
		for(i=0;i<n;i++)
		{
			arr2[i]=arr1[i];
		}
	
		System.out.println("After copy");
		// print the elements after copy
		for(i=0;i<n;i++)
		{
			System.out.println(arr2[i]);
		}
	}

}
