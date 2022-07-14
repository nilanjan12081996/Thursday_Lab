/*
 * @Author Nilanjan Dasgupta
 */

package basicprogram;
/*
 * print this pattern:
1
12
123
1234
12345
 * */
public class NumberPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)// outer loop
		{
			for(int j=1;j<=i;j++)// innerloop
			{
				System.out.print(j);//print the value of j
			}
			System.out.println();//print in next row
		}

	}

}
