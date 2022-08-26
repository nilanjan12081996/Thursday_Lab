/*
 * @author Nilanjan Dasgupta
 */
package array;

import java.util.Scanner;

public class SeacrchElement {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int n,i;
		int value;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("enter the elements: ");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the value you want to search: ");
		value=sc.nextInt();
		//logic for searching value
		
		for(i=0;i<n;i++)
		{
			//check array value ans searched value is equal
			if(arr[i]==value) {
				System.out.println("value is found in "+(i+1)+"th position");
				break;
			}
			
		}
		if(i==n)
			System.out.println("value not found");
		
		
	}

}
