package com.prakhar.parwal.data;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Person implements Serializable {

	
	private Integer id;
	
	@NotEmpty(message = "Name required")
	private String name;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	@Min(value = 0, message = "Must not be less than 0")
	@Max(value = 100, message = "Must not be greater than 100")
	private Integer age;
	
	
	public Person(Integer id, String name, String username, String password, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.age = age;
	}

	public Person() {
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", age="
				+ age + "]";
	}
	
	
	
}
