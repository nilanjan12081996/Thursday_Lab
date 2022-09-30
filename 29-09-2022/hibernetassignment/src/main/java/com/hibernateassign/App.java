/*
 * Author Nilanjan Dasgupta
 */
package com.hibernateassign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
	static Crud  crud=new Crud();
     Scanner sc=new Scanner(System.in);
     static App ap=new App();
public void mainMethod()
{
	int ch;

	 do {
	        System.out.println("1. For instructor\n2.For Course\n3.Course assign to instructor\n4.exit");
	        System.out.println("enter your choice: ");
	         ch=sc.nextInt();
	        switch(ch) {
	        case 1:
	        	ap.instructor();
	        	break;
	        case 2:
	        	ap.course();
	        	break;
	        case 3:
	        	System.out.println("Enter the instructor id: ");
	           	int insid=sc.nextInt();
	           	System.out.println("Enter the course id: ");
	           	int csid=sc.nextInt();
	           crud.assignCourseToInstructor(insid, csid) ;
	        	break;
	        }
	        
	        }while(ch!=4);
}

	public void instructor()
	{
		int ch1;
		do {
        	System.out.println("\n1.Add instructor\n2.Display instructor\n3.update instructor\n4.delete instructor\n5.Exit");
        	System.out.println("Enter your choice: ");
          ch1=sc.nextInt();
        switch(ch1)
        {
        case 1:
        	crud.add_instructor();
        	break;
        case 2:
        	crud.dispaly_instructor();
        	break;
        case 3:
        	crud.update();
        	break;
        case 4:
        	crud.delete_instructor();
        	break;
        }
        
        }while(ch1!=5);
	}
	public void course()
	{
		int ch2;
		  do {
	    	   System.out.println("\n1.Add course\n2.Display course\n3.update course\n4.delete course\n5.Exit");
	       	System.out.println("Enter your choice: ");
	         ch2=sc.nextInt();
	         switch(ch2)
	         {
	         case 1:
	        	 crud.add_course();
	        	 break;
	         case 2:
	        	 crud.dispaly_course();
	        	 break;
	         case 3:
	        	 crud.update_course();
	        	 break;
	         case 4:
	        	 crud.delete_course();
	        	 break;
	         }
	    	   }while(ch2!=5);
	}
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
        ap.mainMethod();
        session.close();
        factory.close();

   
       
       
     
        
    }
}
