package day18_array_methods_multi_dimensional_arrays;

import java.util.Arrays;

public class BinarySearchQuestion01 {

	public static void main(String[] args) {
		/*
		 * {3, 5, 6, 9, 5, 10, 6}
		 * Use binarSearch() for 1, 5, 11, 14
		 */
		
		int arr[] = {3, 5, 6, 9, 5, 10, 6};
		
		//Do not forget to use sort() before binarySearch()
		Arrays.sort(arr);
		
		//If you have duplicate elements, you will get the index of first occurence
		System.out.println(Arrays.binarySearch(arr, 1));
		System.out.println(Arrays.binarySearch(arr, 5));
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 11));
		System.out.println(Arrays.binarySearch(arr, 14));

	}

}
