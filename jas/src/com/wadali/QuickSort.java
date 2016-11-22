package com.wadali;

public class QuickSort {

	static int[] jas = { 2, 6, 3, 4, 5, 9, 7, 8 };

	int first, last;

	void sort(int low, int high) {
		int i = low, j = high;
		int pivot = findMid(low, high, jas);
		while (i <= j) {
			while (jas[i] < pivot) {
				i++;
			}
			while (jas[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int lower = jas[i];
				jas[i] = jas[j];
				jas[j] = lower;
				i++;
				j--;
			}

			if (low < j) {
				sort(low, j);
			}
			if (i < high) {
				sort(i, high);
			}

		}

	}

	int findMid(int lowerIndex, int higherIndex, int... array) {
		int midIndex = ((higherIndex - lowerIndex) / 2) + lowerIndex;
		return array[midIndex];

	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		// quickSort.sort(0, jas.length - 1);

		quickSort.quickSort(0, quickSort.array.length - 1);
		for (int string : quickSort.array) {
			System.out.println(">>" + string);

		}
	}

	int[] array = { 2, 6, 3, 4, 5, 9, 7, 8 };

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[ lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);

	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	
	
}
