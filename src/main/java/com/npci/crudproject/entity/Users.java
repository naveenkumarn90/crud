package com.npci.crudproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// Entity annotation defines that a class can be mapped to table
@Data
@Entity
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int useId;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private int age;

	@Column(name = "salary")
	private float salary;

	@Column(name = "department_id")
	private int departmentId;

//	public int getUseId() {
//		return useId;
//	}
//
//	public void setUseId(int useId) {
//		this.useId = useId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public float getSalary() {
//		return salary;
//	}
//
//	public void setSalary(float salary) {
//		this.salary = salary;
//	}
//
//	public int getDepartmentId() {
//		return departmentId;
//	}
//
//	public void setDepartmentId(int departmentId) {
//		this.departmentId = departmentId;
//	}
//
//	public Users(int useId, String name, int age, float salary, int departmentId) {
//		super();
//		this.useId = useId;
//		this.name = name;
//		this.age = age;
//		this.salary = salary;
//		this.departmentId = departmentId;
//	}
//
//	public Users() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String toString() {
//		return "Users [useId=" + useId + ", name=" + name + ", age=" + age + ", salary=" + salary + ", departmentId="
//				+ departmentId + "]";
//	}

}