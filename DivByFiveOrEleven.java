/*write a program to to check if the number is 
 * divisible by 5 and 11 or not.*/
package basicprogram;
import java.util.*;
public class DivByFiveOrEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number: ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		if(num%5==0&&num%11==0)
			System.out.println(num+" is divisibale by 5 and 11");

	}

}
