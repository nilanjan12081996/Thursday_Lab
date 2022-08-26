/*
 * @Author Nilanjan Dasgupta
 */
/*
 * Write a program to calculate bubble sort.
 */
package thursdaylab;

import java.util.Scanner;

public class BubbleSort {//class BubbleSort
	public static void bubbleSortasc(int arr[],int n)// method to perform bubble sort ascending order
	{
		int temp=0,i,j;
		// logic for bubblesort for ascending order
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++) {
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		// print the array elements after sorting
		for(i=0;i<n;i++)
		
		System.out.println(arr[i]);
	}
	public static void bubbleSortdes(int arr[],int n)//method to perform bubble sort desending order
	{
		int temp=0,i,j;
		// logic for bubblesort for desending order
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++) {
				if(arr[i]<arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		// print the array elements after sorting
		for(i=0;i<n;i++)
		
		System.out.println(arr[i]);
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];//create an array
		int n,i,ch;
		// user choice for Ascending order or Descending order sorting
		do {
			System.out.println("1.Ascending order\n2.Descending\n3.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
		case 1:
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("sorted array is: ");
		BubbleSort.bubbleSortasc(arr, n); //invoke method for  Ascending order sorting
		break;
		case 2:
			System.out.println("Enter the number of elements: ");
			n=sc.nextInt();
			for(i=0;i<n;i++)
			{
				System.out.println("enter the elements: ");
				arr[i]=sc.nextInt();
			}
			System.out.println("sorted array is: ");
			BubbleSort.bubbleSortdes(arr, n); //invoke method for  Descending sorting sorting
			break;
		case 3:
			System.exit(0);
	}
	}while(true);
	}

}
