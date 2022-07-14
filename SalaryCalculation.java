/*
 * @Author Nilanjan Dasgupta
 */
package basicprogram;
import java.util.*;
/*
 * write a program to calculate gross salary of an employee. Basic salary should be taken from user.
If basic salary is grater that 1500 ,HRA=20% and DA=90% will be given else HRA=500 and DA 70% given to the employee.
 */
public class SalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int basic;// declare a variable basic to store basic salary of employee
		float DA,HRA;// declare variable DA and HRA for store DA and HRA of employee
		Scanner sc=new Scanner(System.in);// creating the object of scanner class
		System.out.println("Enter the basic salaray: ");
		basic=sc.nextInt();// taking input from user
		if(basic>1500)// check the basic salary is greater than 1500 or not
		{
			 DA=basic*0.9f;//DA 90% of basic salary
			HRA=basic*0.2f;//HRA 20% of basic salary
		}
		else {
			 HRA=500.00f;//HRA 500
			 DA=basic*0.7f;//DA 70% of basic salary
		}
		float gross_salary=DA+HRA+basic;// Calculate gross salary o employee
		System.out.println(gross_salary);
		

	}

}
