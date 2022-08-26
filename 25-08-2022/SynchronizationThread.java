/*
 * @Author Nilanjan Dasgupta
 */
/*
 * Create a program to show synchronization.
 */
package thursdaylab;

import java.util.Scanner;
//class Sort
class Sort {
	//create a synchronized name bubbleSortasc
		synchronized void bubbleSortasc(int arr[],int n)
		{
			int temp=0,i,j;
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
			System.out.println("Ascending: ");
			for(i=0;i<n;i++)
			{
			
			System.out.println(arr[i]);
			 try {
				 Thread.sleep(400);
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
			}
		}
		//create a synchronized name bubbleSortdes
		synchronized void bubbleSortdes(int arr[],int n)
		{
			int temp=0,i,j;
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
			System.out.println("Descending: ");
			for(i=0;i<n;i++)
			{
			System.out.println(arr[i]);
			 try {
				 Thread.sleep(400);
			 }catch(Exception e)
			 {
				 System.out.println(e);
			 }
			}
		}
}
public class SynchronizationThread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];// create array
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		//input element i array one by one
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the elements: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("After sorting");
		Sort st=new Sort();
		//create a Thread t1
		Thread t1=new Thread()
				{
			public void run()
			{
				st.bubbleSortasc(arr, n);
			}
				};
				// create a Thread t2
				Thread t2=new Thread()
				{
			public void run()
			{
				st.bubbleSortdes(arr, n);
			}
				};
				// call the start function to start the Threads
				t1.start();
				t2.start();
		
	}

}
