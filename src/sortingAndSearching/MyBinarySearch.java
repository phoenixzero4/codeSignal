/**
 *   phoenix
 *   Mar 31, 2025
 *   
 *   Iterative implementation of Binary Search
 */

package sortingAndSearching;

import java.util.Arrays;

public class MyBinarySearch {

	public static int BinarySearch(int[] array, int target) {

		int start = 0, end = array.length - 1;

		while (start <= end) {
			int middle = start + (end - start) / 2;

			if (array[middle] == target) {
				return middle;
			}

			else if (array[middle] < target) {
				start = middle + 1;
			}

			else {
				end = middle - 1;
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int[] array = { 3, 2, 0, 8, 7, 10, 99, 85, 63 };
		int target = 10;

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.printf("array[%d] = %d\n", i, array[i]);

		}

		int index = BinarySearch(array, target);
		System.out.printf("\n%d was found in array at index %d", target, index);
	}

}
