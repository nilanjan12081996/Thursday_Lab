/*
 * Author Nilanjan Dasgupta
 */
package com.ems.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ems.entity.Address;
import com.ems.entity.Employee;
import com.ems.exception.GlobalException;

public class EmployeeService {
	private  List<Employee>emp=new ArrayList<Employee>();
	Scanner sc=new Scanner(System.in);
	//method to add employee details in arraylist
	public void addEmployee(long empId,String name,double sal,
			String city,String country)
	{
		Address add=new Address(city,country);
		emp.add(new Employee(empId,name,sal,add));
	}
	//method to display employee details in arraylist
	public void displayEmployee()
	{
	for(Employee e: emp)
	{
		System.out.println("Employee id: "+e.getEmpId());
		System.out.println("Employee Name: "+e.getEmpName());
		System.out.println("Employee salary: "+e.getEmpSal());
		System.out.println("Employee Address: "+e.getAddress().getCity()+"\n"+e.getAddress().getCountry());
		
	}
	}
	//method to display employee details by ID
	public Employee displayEmpById(long id) throws GlobalException
	{
		int i;
		for( i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
//				System.out.println("Employee id: "+emp.get(i).getEmpId());
//				System.out.println("Employee Name: "+emp.get(i).getEmpName());
//				System.out.println("Employee salary: "+emp.get(i).getEmpSal());
//				System.out.println("Employee Address: "+emp.get(i).getAddress().getCity()+"\n"+emp.get(i).getAddress().getCountry());
			return emp.get(i);
			}
			
		}
		if(i==emp.size())
			throw new GlobalException("Employee not found");
		return null;
			
		
	}
	public Employee findId(int id)
	{
		Employee e=null;
		for(int i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
				e=emp.get(i);
			}
		}
		return e;
		
	}
	//method to  update by id
	public Employee updateById(/*long id*/int index,Employee e) throws GlobalException
	{
		//int i;
		//for(i=0;i<emp.size();i++)
		//{
			//if(emp.get(i).getEmpId()==id)
//			{
//				System.out.println("Enter employee id: ");
//				int eId=sc.nextInt();
//				System.out.println("Enter employee name: ");
//				String eName=sc.nextLine();
//				System.out.println("Entr employee salary: ");
//				double eSal=sc.nextDouble();
//				System.out.println("enter the city: ");
//				String eCity=sc.nextLine();
//				System.out.println("enter the country: ");
//				String eCountry=sc.nextLine();
//				Address add1=new Address(eCity,eCountry);
//				//emp.add(new Employee(eId,eName,eSal,add1));
//				emp.set(i,new Employee(eId,eName,eSal,add1));
//				
//			}
		return emp.set(index, e);
		}
//		if(i==emp.size())
//			throw new GlobalException("Employee not found");
//			
//	}
	//method to  delete by id
	public void  deleteEmpById(int id) throws GlobalException
	{
		int i;
		for( i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
				emp.remove(i);
			}
			
		}
		
		if(i==emp.size())
		{
			throw new GlobalException("Employee not found");
		}
	}
	//Method for delete all
	public String deleteAllEmp()
	{
		emp.removeAll(emp);
		return "All record delete successfully";
	}
	//calculate yearly salary of employee
	public double calculateYearlySalary(long id)
	{
		int i;
		double y_salary=0.0;
		for( i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
				 y_salary=emp.get(i).getEmpSal()*12;
			}
		}
		return y_salary;
	}
	//calculate the appraisal
	public double calculateAppraisalById(long id)
	{
		double appraisal=0.0;
		int i;
		double y_salary=0.0;
		for( i=0;i<emp.size();i++)
		{
			if(emp.get(i).getEmpId()==id)
			{
				 if(emp.get(i).getEmpSal()<10000)
					 appraisal=1000;
				 else
					 appraisal=2000;
			}
		}
		return appraisal;
	}
	public int lengthOfList()
	{
		return emp.size();
	}
}
