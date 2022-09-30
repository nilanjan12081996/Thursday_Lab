/*
 * Author Nilanjan Dasgupta
 */
package com.hibernateassign;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Instructor {
	@Id
	@Column(name="ins_id",length=5)
	private int instructor_id;
	@Column(name="ins_name",length=25)
	private String instructor_name;
	@OneToMany(mappedBy ="instructor",cascade = CascadeType.ALL)
	List<Course> course;
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}
	public String getInstructor_name() {
		return instructor_name;
	}
	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	public Instructor(int instructor_id, String instructor_name, List<Course> course) {
		super();
		this.instructor_id = instructor_id;
		this.instructor_name = instructor_name;
		this.course = course;
	}
	
	public Instructor() {
		super();
	}
	@Override
	public String toString() {
		return "Instructor [instructor_id=" + instructor_id + ", instructor_name=" + instructor_name + "]";
	}

	

}
