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

public class Crud {
	
	 Scanner sc=new Scanner(System.in);
	 
	//Session se= GetSession.getSession();
	 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
     Session session=factory.openSession();
     Instructor ins=new Instructor();
     //Transaction tx=session.beginTransaction();
     
     // Method for add Instructor
	public void add_instructor()
	{
		try {
		session.beginTransaction();
		
        System.out.println("enter the instructor id: ");
        int i=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the instructor name: ");
        String name=sc.nextLine();
          ins.setInstructor_id(i);
          ins.setInstructor_name(name);
          session.save(ins);
          session.getTransaction().commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	// method for display instructor by id
	public void dispaly_instructor()
	{
		try {
		session.beginTransaction();
		String query2="from Instructor where instructor_id=:i";
    	System.out.println("enter the id");
    	int ids=sc.nextInt();
		Query q2=session.createQuery(query2);
		q2.setParameter("i",ids);
		Instructor instructor=(Instructor)q2.uniqueResult();
		System.out.println(instructor.getInstructor_id());
		System.out.println(instructor.getInstructor_name());
		session.getTransaction().commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	// method for update instructor details
	public void update()
	{
		try {
		session.beginTransaction();
	  	Query q=session.createQuery("update  Instructor set instructor_name=:n where instructor_id=:i");
   	 System.out.println("enter the instructor id: ");
        int new_i=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the instructor name: ");
        String new_name=sc.nextLine();
   	q.setParameter("n", new_name);
		q.setParameter("i", new_i);
		int row=q.executeUpdate();
		System.out.println(row+" record updated successfully");
		session.getTransaction().commit();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	// method for delete instructor by  id
	public void delete_instructor()
	{
		try {
		session.beginTransaction();
		Query q1=session.createQuery("delete from Instructor where instructor_id=:i");
    	System.out.println("enter the instructor id: ");
        int id=sc.nextInt();
    	q1.setParameter("i",id);
    	int row1=q1.executeUpdate();	
    	System.out.println(row1+" record deleted successfully");
    	session.getTransaction().commit();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	//method for add course
	public void add_course()
    {
    	try {
    		session.beginTransaction();
    		
    		Course course=new Course();
            System.out.println("Enter the Course name: ");
            String name=sc.nextLine();
            
            System.out.println("Enter the course fee: ");
            int fee=sc.nextInt();
              course.setCourse_name(name);
              course.setCourse_fee(fee);
              course.setInstructor(ins);
              session.save(course);
              session.getTransaction().commit();
    		}catch(Exception e)
    		{
    			System.out.println(e);
    		}
    	}
	//method for  display courses
	public void dispaly_course()
	{
		try {
		session.beginTransaction();
		String query2="from Course where course_id=:i";
    	System.out.println("enter the id");
    	int ids=sc.nextInt();
		Query q2=session.createQuery(query2);
		q2.setParameter("i",ids);
		List<Course> course=q2.getResultList();
		for(Course c:course)
		{
			System.out.println(c);
		}
		session.getTransaction().commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	// method for update course details
	public void update_course()
	{
		try {
		session.beginTransaction();
	  	Query q=session.createQuery("update  Course set course_name=:n,course_fee=:f,instructor_id=:id where course_id=:i");
   	 System.out.println("enter the course id: ");
        int new_i=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the course name: ");
        String new_name=sc.nextLine();
        System.out.println("enter the fees: ");
        int fee=sc.nextInt();
        System.out.println("Enter instructor id");
        int ins_id=sc.nextInt();
   	    q.setParameter("n", new_name);
		q.setParameter("i", new_i);
		q.setParameter("f", fee);
		q.setParameter("id", ins_id);
		int row=q.executeUpdate();
		System.out.println(row+" record updated successfully");
		session.getTransaction().commit();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	//method for delete course details
	public void delete_course()
	{
		try {
		session.beginTransaction();
		Query q1=session.createQuery("delete from Course where course_id=:i");
    	System.out.println("enter the course id: ");
        int id=sc.nextInt();
    	q1.setParameter("i",id);
    	int row1=q1.executeUpdate();	
    	System.out.println(row1+" record deleted successfully");
    	session.getTransaction().commit();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	//method for assign course to the instructor
	public void assignCourseToInstructor(int instructor_id,int course_id) 
	{
	
	Instructor ins=session.get(Instructor.class,instructor_id);

	Course course=session.get(Course.class,course_id);
	List<Course> courses=new ArrayList<>();
	courses.add(course);

	ins.setCourse(courses);
	course.setInstructor(ins);
	session.beginTransaction();
	session.save(ins);
	session.getTransaction().commit();

}
}
