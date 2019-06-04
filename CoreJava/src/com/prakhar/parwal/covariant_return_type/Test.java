package com.prakhar.parwal.covariant_return_type;

public class Test {
	
}


/*
 * 
 * When a method overrides method of base case and the return type of overridden method 
 * is sub class of return type class of method from parent class then the return type 
 * of sub class method is class "Covariant return type". It came in picture from JDK5
 * 
 * */


class Parent 
{
	public ParentReturnType myMethod()
	{
		return new ParentReturnType();
	}
}

class Child extends Parent
{
	@Override
	public ChildReturnType myMethod()
	{
		return new ChildReturnType();
	}
}

class ParentReturnType
{
	
}

class ChildReturnType extends ParentReturnType
{
	
}