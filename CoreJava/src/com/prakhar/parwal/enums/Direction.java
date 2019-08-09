package com.prakhar.parwal.enums;

public enum Direction {

	EAST(1), 
	WEST(2),
	NORTH(3),
	SOUTH(4);
	
	private int value;
	
	Direction(int direction) {
		
		this.value = value;
	}
	
	public int getValue() {
		
		return this.value;
	}
	
	@Override
	public String toString() {
		return this.name();
	}
}
