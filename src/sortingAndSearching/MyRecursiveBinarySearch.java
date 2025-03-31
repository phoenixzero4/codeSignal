/**
 *   Author: phoenix written on Mar 31, 2025
 *   
 */

package sortingAndSearching;

import java.util.Arrays;

public class MyRecursiveBinarySearch {

	public static int RecursiveBinarySearch(int[] array, int start, int end, int target) {

		int index = -1;

		// If element is not found after searching each element, return -1 O(N)
		if (start > end)
			return index;

		int mid = start + (end - start) / 2;

		// Check middle element to see if it matches our target. Return index if it does
		if (array[mid] == target)
			return mid;

		// If element at index > than target, search the lower half of our array
		if (array[mid] > target) {
			return RecursiveBinarySearch(array, start, mid - 1, target);
		}
		// If element at index < than target, search the higher half of our array
		return RecursiveBinarySearch(array, mid + 1, array.length, target);
	}

	public static void main(String[] args) {

		int[] array = { 3, 2, 0, 8, 7, 10, 99, 85, 63 };
		int target = 10;
		Arrays.sort(array);
		int index = RecursiveBinarySearch(array, 0, array.length, target);

		System.out.printf("\n%d was found in array at index %d", target, index);
	}

}
