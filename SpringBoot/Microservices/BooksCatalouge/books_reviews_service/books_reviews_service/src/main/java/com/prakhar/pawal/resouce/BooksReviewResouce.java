package com.prakhar.pawal.resouce;

import java.util.HashMap;
import java.util.Map;

public class BooksReviewResouce {
	
	public Map<Integer, Map<Integer, Integer>> getBookReviewByPerson() {
		Map<Integer, Map<Integer, Integer>> usersBooksRating = new HashMap<Integer, Map<Integer, Integer>>();
		Map<Integer, Integer> bookAndRating = new HashMap<Integer, Integer>();
		
		bookAndRating.put(1, 5);
		bookAndRating.put(2, 3);
		bookAndRating.put(3, 8);
		
		bookAndRating.put(1, 5);
		bookAndRating.put(2, 4);
		bookAndRating.put(3, 7);

		bookAndRating.put(1, 6);
		bookAndRating.put(2, 5);
		bookAndRating.put(3, 9);
		
		usersBooksRating.put(1, bookAndRating);

		return usersBooksRating;
	}
				
}
