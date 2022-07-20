package com.StreamExample;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		/*
		 * //Create a List of the square of all distinct numbers
		 * 
		 * List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); List<Integer>
		 * distinct = numbers.stream().map(i -> i *
		 * i).distinct().collect(Collectors.toList());
		 * 
		 * for (Integer integer : distinct) { System.out.println(integer); }
		 */
		// Get count, min, max, sum, and the average for numbers
/*		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats);*/
		

	}

}
