package thursdaylab;

import java.util.Scanner;
//create a class StudentBatch
public class StudentBatch {
	//create two static array java and aws for store student detalis of different course
	static Student java[]=new Student[50];
	static Student aws[]=new Student[50];
	static Scanner sc=new Scanner(System.in);
	static int indexj=0;//index for java array
	static int indexa=0;//index for aws array
	//create method for batch creation
	public void createBatch()
	{
		int id;
		String name;
		String mailid;
		long phno;
		String course;
		System.out.println("enter the id of student: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name of student: ");
		name=sc.nextLine();
		System.out.println("enter the Phone Number of student: ");
		phno=sc.nextLong();
		sc.nextLine();
		System.out.println("enter the Email of student: ");
		mailid=sc.nextLine();
		System.out.println("enter the course for which student is enrolled: ");
		course=sc.next();
		//check for enrolled course
		if (course.equalsIgnoreCase("java"))
		{
			if(indexj<=50)// check for batch strength
			{
			java[indexj]=new Student(id,name,mailid,phno,course);// copy details in java array
			indexj++;//increase the index of java array
		}
			else
				System.out.println("Batch is full");
		}
		//check for aws course
		else if(course.equalsIgnoreCase("aws"))
		{
			if(indexa<=50)
			{
			aws[indexa]=new Student(id,name,mailid,phno,course);// copy details in aws array
			indexa++;//increase the index of java array
			}
			else
				System.out.println("Batch is full");
		}
		
		//it throw exception if anyone enter other course except java and aws
		else
			throw new NoCourseFoundException("we do not have that course avilable");
	}
	//create display method for print student details
	public void displayStudent()
	{
		String batch;
		System.out.println("enter the batch name: ");//ask for batch
		batch=sc.next();
		int i;
		//if java batch
		if (batch.equalsIgnoreCase("java"))
		{
			System.out.println("Java Batch");
			// print the java array
			for(i=0;i<indexj;i++)
			{
				System.out.println("Student Id: "+java[i].getStdId());
				System.out.println("Student Name: "+java[i].getStdName());
				System.out.println("Student Phone: "+java[i].getPhNo());
				System.out.println("Student E-mail: "+java[i].getMailId());
				System.out.println("Student Enrolled course: "+java[i].getCourse());
			}
		}
		//if aws batch
		else if(batch.equalsIgnoreCase("aws"))
		{
			System.out.println("Aws batch");
			//print aws array
			for(i=0;i<indexa;i++)
			{
				System.out.println("Student Id: "+aws[i].getStdId());
				System.out.println("Student Name: "+aws[i].getStdName());
				System.out.println("Student Phone: "+aws[i].getPhNo());
				System.out.println("Student E-mail: "+aws[i].getMailId());
				System.out.println("Student Enrolled course: "+aws[i].getCourse());
			}
			
		}
	}
	// create a method update for update student detalis
	
	public void update()
	{
		boolean status=false;
		int i;
		System.out.println("enter Student id: ");
		int id=sc.nextInt();
		System.out.println("Enter the course Name:");
		String batch=sc.next();
		//search for course
		if(batch.equalsIgnoreCase("java"))
		{
			for(i=0;i<indexj;i++)
			{
				if(id==java[i].getStdId())//search for student id if found it will update
				{
					System.out.println("enter the new student id: ");
					int sid=sc.nextInt();
					sc.nextLine();
					System.out.println("enter the new name: ");
					String name=sc.nextLine();

					System.out.println("enter the new mail: ");
					String mail=sc.nextLine();
					System.out.println("eneter the new phone number: ");
					long phone=sc.nextLong();
					sc.nextLine();
					System.out.println("enter the course: ");
					String course=sc.next();
					//if student change the course java to aws copy the details in aws array
					if(course.equalsIgnoreCase("aws"))
					{
						aws[i]=new Student(sid,name,mail,phone,course);
						System.out.println("Update successful");
					}
					// if not change copy the details in java array
					else if(course.equalsIgnoreCase("java")) {
						java[i]=new Student(sid,name,mail,phone,course);
					System.out.println("Update successful");
					}
					// if give other course except java and aws throw exception
					else
						throw new NoCourseFoundException("we do not have that course avilable");
					status=true;
				}
			}
			// check for id is found or not
			if(status==false)
				System.out.println("Student not found");
			
		}
		////search for course
		if(batch.equalsIgnoreCase("aws"))
		{
			for(i=0;i<indexa;i++)
			{
				if(id==aws[i].getStdId())//search for student id if found it will update
				{
					System.out.println("enter the new student id: ");
					int sid=sc.nextInt();
					sc.nextLine();
					System.out.println("enter the new name: ");
					String name=sc.nextLine();
					System.out.println("enter the new mail: ");
					String mail=sc.nextLine();
					System.out.println("eneter the new phone number: ");
					long phone=sc.nextLong();
					sc.nextLine();
					System.out.println("enter the course: ");
					String course=sc.nextLine();
					//if not change copy the details in aws array
					if(course.equalsIgnoreCase("aws"))
					{
						aws[i]=new Student(sid,name,mail,phone,course);
						System.out.println("Update successful");
					}
					//if student change the course aws to java copy the details in java array
					else if(course.equalsIgnoreCase("java")) {
						java[i]=new Student(sid,name,mail,phone,course);
					System.out.println("Update successful");
					}
					// if give other course except java and aws throw exception
					else
						throw new NoCourseFoundException("we do not have that course avilable");
					status=true;
				}
			}
			// check for id is found or not
			if(status==false)
				System.out.println("student not found");
		}
	}
	
	

}
