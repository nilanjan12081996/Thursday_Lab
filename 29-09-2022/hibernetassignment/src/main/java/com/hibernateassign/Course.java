/*
 * Author Nilanjan Dasgupta
 */
package com.hibernateassign;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_id; //primary key aut generated
	@Column(name="c_name",length = 25,nullable = false)
	private String course_name;// should be not null field
	@Column(name="fees",length=6)
	private int course_fee;
	//many to one mapping with instructor
	@ManyToOne
	@JoinColumn(name="instructor_id")
	private Instructor instructor;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getCourse_fee() {
		return course_fee;
	}
	public void setCourse_fee(int course_fee) {
		this.course_fee = course_fee;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Course(int course_id, String course_name, int course_fee, Instructor instructor) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_fee = course_fee;
		this.instructor = instructor;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_fee=" + course_fee + "]";
	}
	
	
	
	

}
