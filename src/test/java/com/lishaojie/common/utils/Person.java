package com.lishaojie.common.utils;

public class Person {

	String name;
	Integer age;
	String about;
	String created;
	public Person() {
		super();
	}
	
	public Person(String name, Integer age, String about, String created) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = created;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about
				+ ", created=" + created + "]";
	}
	
}
