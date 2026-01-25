package faq;

import java.util.Arrays;
import java.util.Collections;

public class Builtin_Array_Methods_For_Sorting {

	public static void main(String[] args) {
		
		// Array Methods for sorting.
		
		// int a[] = {23,111,222,43,54,223,67,78,89,90};
		/*
		// Approach-1
		System.out.println("Array without sorting : "+ Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after sorting : "+ Arrays.toString(a));
		*/
		/*
		// Approach-2
		System.out.println("Array without sorting : "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting : "+ Arrays.toString(a));
		*/
		
		// Approach-3: in descending order.
		Integer a[] = {23,111,222,43,54,223,67,78,89,90};
		System.out.println("Array without sorting : "+ Arrays.toString(a));
		Arrays.sort((a), Collections.reverseOrder()); 
		// not with int but support with Integer because it supports only non-primitivedata types.
		System.out.println("Array after sorting : "+ Arrays.toString(a));

	}

}
