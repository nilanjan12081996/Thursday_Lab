/*
 * Author Nilanjan Dasgupta
 */
/*
 * wap to find out maximum and minimum number in array.
 */
package array;
import java.util.*;
public class Max_MinArray {

	public static void main(String[] args) {
		int arr[]=new int[10];// create an integer array of size 10
		// variable n is for number elements input by the user in  array
		// variable i is use as  index of array
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		n=sc.nextInt();
		System.out.println("enter the elements: ");
		//take elements from user
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		// initialize max and min varible with the 1st value of array
		int max=arr[0];
		int min=arr[0];
		//logic for check max and min
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)//if other array elements is maximum than 1st value of array store them in max variable
				max=arr[i];
			if(arr[i]<min)//if other array elements is minimum than 1st value of array store them in min variable
				min=arr[i];
		}
		System.out.println("Maximum element is: "+max);//print the maximum element
		System.out.println("Minimum element is: "+min);//print the minimum element
	}

}
