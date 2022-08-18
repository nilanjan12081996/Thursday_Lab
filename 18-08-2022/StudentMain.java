/*
 * @author Nilanjan Dasgupta
 */
/*
 * develop an application where we will create batch with students.
1.there will be two course-java and aws.
2.after admission ,we will assign students with details like student id,student name,email id,ph no in that batch in which course
students took admission.
3.make sure each batch capacity is 50,we can't assign more than 50 students in the batch.
4.we can update studdents details also if required.
5.if student want to take admission other than these course to NoCourseFoundException will thrown.and print the message "no suitable course found".
6.at the time of updating student details,if any id not found so StudentIdNotFoundException will thrown, and print the message that "no such student found in system".

 */
package thursdaylab;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		StudentBatch sbatch=new StudentBatch();
		//Chose option from the menu
		do {
			System.out.println("1.Create Batch\n2.Display Student Details by batch\n3.Update\n4.Exit");
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				//handle the exception
				try {
				sbatch.createBatch();
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				sbatch.displayStudent();
				break;
			case 3:
				//handle the exception
				try {
				sbatch.update();
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.exit(0);
			
			}
		}while(true);

	}

}
