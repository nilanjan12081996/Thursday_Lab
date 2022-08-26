package thursdaylab;

import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declare local variables
		int arr1[]=new int[10];
		int i,j,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		n=sc.nextInt();
		 // use for loop to enter the elements one by one in an array  
		for(i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr1[i]=sc.nextInt();
		}
		 // use nested for loop to find the duplicate elements in array 
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				// use if statement to check duplicate element  
			if(arr1[i]==arr1[j])
			{
				// delete the current position of the duplicate element 
				for(k=j;k<n-1;k++)
				{
					arr1[k]=arr1[k+1];
				}
				 // decrease the size of array after removing duplicate elemen
			n--;
			// if the position of the elements is changes, don't increase the index j  
			j--;
			}
			}
		}
		  /* display an array after deletion or removing of the duplicate elements */  
		System.out.println("After removing duplicate elements ");
		// for loop to print the array  
		for(i=0;i<n;i++)
		{
			System.out.println(arr1[i]);
		}
		

	}

}
