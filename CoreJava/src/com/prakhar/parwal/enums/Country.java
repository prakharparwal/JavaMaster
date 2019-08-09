package com.prakhar.parwal.enums;

public class Country {

	private int id;
	private String name;
	private Direction direction;
	
	public Country(int id, String name, Direction direction) {
		super();
		this.id = id;
		this.name = name;
		this.direction = direction;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", direction=" + direction + "]";
	}

	
}
