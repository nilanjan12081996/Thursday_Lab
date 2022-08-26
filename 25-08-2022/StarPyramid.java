/*
 * 
 * 
 * /*
 * @Author Nilanjan Dasgupta
 
 		 * 
       * * * 
     * * * * * 
   * * * * * * * 
 * * * * * * * * *
 */
package thursdaylab;


import java.util.Scanner;

public class StarPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//take no. of rows from user
		System.out.println("enter the number of row: ");
		int row=sc.nextInt();
		// logic for print star pyramid
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=(row*2)-1;j++)
			{
				if(j>=(row+1)-i&&j<=(row-1)+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
