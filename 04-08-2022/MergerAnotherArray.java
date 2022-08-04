/*
 * Author Nilanjan Dasgupta
 */
/*
 * wap to merger two array in to another array.
 */
package array;

import java.util.Scanner;

public class MergerAnotherArray {

	public static void main(String[] args) {
		// create three integer array of size 10
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		int arr3[]=new int[20];
		// variable n is for number elements input by the user in 1st array
		// variable i is use as  index of array
		// variable j is use as index of 3rd array
		// variable m is for number of elements input by the user in 2nd array
		int n,i,j=0,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements for 1st array: ");
		n=sc.nextInt();
		System.out.println("enter the elements for 1st array: ");
		//take input of 1st array
		for( i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the number of elements for 2nd array: ");
		m=sc.nextInt();
		System.out.println("enter the elements for 2nd array: ");
		//take input of 2nd array
		for( i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		//copy the elements of 1st array into 3rd array
		for(i=0;i<n;i++)
		{
			arr3[j]=arr1[i];
			j++;
		}
		//copy the elements of 2nd array into 3rd array
		for(i=0;i<m;i++)
		{
			arr3[j]=arr2[i];
			j++;
		}
		//print the array elements after merging
		System.out.println("after merging: ");
		for(i=0;i<j;i++)
		{
			System.out.println(arr3[i]);
		}
	}

}
