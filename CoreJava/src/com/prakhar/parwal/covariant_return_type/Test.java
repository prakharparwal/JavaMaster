package com.prakhar.parwal.covariant_return_type;

public class Test {
	
}

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