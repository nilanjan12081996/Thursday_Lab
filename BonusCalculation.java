/*wap to calculate bonus.if employee is serving  in organization for more than 3years, 
 * bonus =2500 will be given to employee.*/
package basicprogram;
import java.util.Scanner;
public class BonusCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int servingYear,bonus=0,joiningYear,currentYear;
		
		System.out.println("Enter the joining year: ");
		Scanner obj=new Scanner(System.in);
		joiningYear=obj.nextInt();
		System.out.println("Enter the current year: ");
		currentYear=obj.nextInt();
		servingYear=currentYear-joiningYear;
		if(servingYear>3)
			bonus=2500;
		System.out.println("Bounus is: "+bonus);
		

	}

}
