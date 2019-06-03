package com.prakhar.parwal.lamda.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class First 
{
	public static void main(String...strings)
	{
		ArrayList<Integer> ids = new ArrayList(Arrays.asList(1, 2, 3));
		
		//ids.forEach((i)-> System.out.println(i););
		
		/*ids.forEach((i)->System.out.println(i));
		
		
		new Iterable<Integer>() {

			@Override
			public Iterator<Integer> iterator() {
				
				return null;
			}
		};*/
		
		
		ids.forEach
		(
				new Consumer<Integer>() 
				{
					@Override
					public void accept(Integer t) {
						System.out.println(t);
					}
				}	
		);
		
		
		
	}
}
