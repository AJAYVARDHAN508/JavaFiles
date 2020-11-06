package com.UserDefinedObject;

public class Student {
	private Integer id;
	private String name;
	private Integer marks;
	private String qual;
	private Integer age;
	private String status;
	
	public Student(Integer id, String name, Integer marks, String qual, Integer age) {
		super();
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.qual=qual;
		this.age=age;
		
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
