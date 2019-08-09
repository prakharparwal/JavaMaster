package com.prakhar.parwal.enums;

import java.util.ArrayList;
import java.util.List;

public class Performer_Country {

	public static void main(String... q) {
		
		Country india = new Country(1, "India", Direction.EAST);
		Country canada = new Country(2, "Canada", Direction.WEST);
		Country southAfrica = new Country(3, "South Africa", Direction.SOUTH);
		
		List<Country> countries = new ArrayList<Country>();
		countries.add(india);
		countries.add(canada);
		countries.add(southAfrica);

		for(Country country: countries) {

			if(country.getDirection() == Direction.EAST) {
				System.out.println("Eastern country: "+country);
			}
		}
		
	}
}
