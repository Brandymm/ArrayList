// SelectionSort.java
import java.util.ArrayList;
import java.util.Comparator;


public class SelectionSort {
	public static <T> void selectionSort(ArrayList<T> list, Comparator<? super T> comparator) {
		int n = list.size();

		// Outer Loop to move the boundary of the unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i; // Assume the current element is the smallest

			// Inner Loop to find the smallest element in the unsorted subarray
			for (int j = i + 1; j < n; j++) {
				if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
					minIndex = j; // Update the index of the smallest element
				}
			}
			// Swap the found minimum element with the firsy element of the unsorted subarray
			T temp = list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i,  temp);
		}
		
	}

}
