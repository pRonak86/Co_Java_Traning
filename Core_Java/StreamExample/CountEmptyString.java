package com.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEmptyString {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		/*
		 * //Count Empty String Using Stream Filter List<String> strList =
		 * Arrays.asList("abc", "", "bcd", "", "defg", "jk"); long count =
		 * strList.stream() .filter(x -> x.isEmpty()) .count();
		 * System.out.println(count);
		 */
		/*
		 * // count String whose Length is more then 3 long num = strList.stream()
		 * .filter(x -> x.length()> 3) .count(); System.out.println(num);
		 */

		/*
		 * //Count String whose Letter Start with "a" long count = strList.stream()
		 * .filter(x -> x.startsWith("a")) .count();
		 */
		/*
		 * //Remove all empty Strings from List List<String> filtered = strList.stream()
		 * .filter(x -> !x.isEmpty()) .collect(Collectors.toList());
		 * 
		 * for (String string : filtered) {
		 * 
		 * System.out.println(string); }
		 */
		/*
		 * //Create a List with String more than 2 characters
		 * 
		 * List<String> filtered = strList.stream().filter(x -> x.length() >
		 * 2).collect(Collectors.toList()); for (String string : filtered) {
		 * 
		 * System.out.println(string); }
		 */
		/*
		//Convert String to uppercase and Join them with coma

		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));

		System.out.println(G7Countries);
		*/

	}

}
