/*
 * Author Nilanjan Dasgupta
 */
package com.ems;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.ems.entity.Employee;
import com.ems.exception.GlobalException;
import com.ems.service.EmployeeService;

@TestMethodOrder(value=org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class EmployeeServiceTest {
	EmployeeService employeeService; //referance variable of EmployeeService class
// beforEach run before each testing method and create instance of the class EmployeeService
	@BeforeEach
	void setUp() throws Exception {
		employeeService= new EmployeeService();
	}
//after execution of each method object will be garbage collected
	@AfterEach
	void tearDown() throws Exception {
		employeeService=null;
		System.out.println("object is garbage collected");
	}
	//test for add employee
	@Test
	@DisplayName("Test Add Employee method")
	@Order(1)
	public void testaddEmployee()
	{
		employeeService.addEmployee(101,"Nil",20000, "Kolkata", "India");
		employeeService.addEmployee(102,"Shawin",30000, "Darjeeling", "India");
		//assertEquals(2,employeeService.lengthOfList());
		int length=employeeService.lengthOfList();
		assertThat(length>0).isTrue();
	}
	//test for display details
	@Test
	@DisplayName("test case for display method")
	@Order(value=2)
	public void testdisplayEmpById() throws GlobalException
	{
		employeeService.addEmployee(101,"Nil",20000, "Kolkata", "India");
		Employee e=employeeService.displayEmpById(101);
		//assertEquals("Nil", e.getEmpName());
		assertThat(e.getEmpSal()).isEqualTo(20000.00);
	}
	//test for delete all employee details
	@Test
	@DisplayName("test case for delete all employee details")
	@Order(6)
	public void testdeleteAllEmp()
	{
		
		assertEquals("All record delete successfully",employeeService.deleteAllEmp());
	}
	//test for calculate Appraisal By Id
	@Test
	@DisplayName("Test case for calculate apprisal of employee by id")
	@Order(3)
	public void testcalculateAppraisalById()
	{
		employeeService.addEmployee(101, "nil", 20000, "kolkata", "India");
		double app= employeeService.calculateAppraisalById(101);
		//assertEquals(2000, app);
		assertThat(app).isEqualTo(2000.00);
	}
	//test for calculate Yearly Salary by id
	@Test
	@DisplayName("Test case for calculate Yearly Salary of employee by id")
	@Order(4)
	public void testcalculateYearlySalary()
	{
		employeeService.addEmployee(101, "nil", 20000, "kolkata", "India");
		double y_sal=employeeService.calculateYearlySalary(101);
		//assertEquals(240000.00, y_sal);
		assertThat(y_sal).isEqualTo(240000.00);
	}
//	@Test
//	@DisplayName("Test case for delete employee of employee by id")
//	@Order(5)
//	public void testdeleteEmpById() throws GlobalException
//	{
//		employeeService.addEmployee(101,"Nil",20000, "Kolkata", "India");
//		employeeService.addEmployee(102,"Shawin",30000, "Darjeeling", "India");
//		employeeService.addEmployee(103,"Chandan",35000, "Kolkata", "India");
//		employeeService.deleteEmpById(103);
//		int length=employeeService.lengthOfList();
//		assertThat(length<3).isTrue();
//		
//	}
	// test for update employee by id
	@Test
	@DisplayName("Test case for update employee of employee by id")
	@Order(5)
	public void testupdateById() throws GlobalException
	{
		employeeService.addEmployee(101,"Nil",20000, "Kolkata", "India");
		Employee emp=employeeService.findId(101);
		emp.setEmpName("Nilanjan");
		Employee updateEmp=employeeService.updateById(0, emp);
		assertThat(updateEmp.getEmpName()).isEqualTo("Nilanjan");
		
	}
}
