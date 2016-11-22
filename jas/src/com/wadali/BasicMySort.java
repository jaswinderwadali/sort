package com.wadali;

import java.util.Arrays;

public class BasicMySort {

	int[] hh = { 7, 8, 6, 4, 6, 3, 6, 7, 8, 2, 13, 45, 56, 23, 65, 1, 43 };
	int i = 0;
	int small;

	void sort(int index) {
		i = index;
		small = hh[index];
		while (index < hh.length) {
			if (small > hh[index]) {
				int temp = small;
				small = hh[index];
				hh[index] = temp;
			}
			index++;
		}
		hh[i] = small;
	}

	public static void main(String[] args) {
		BasicMySort sort = new BasicMySort();
		String unSortedArray = Arrays.toString(sort.hh);
		System.out.println(unSortedArray);
		for (int i = 0; i < sort.hh.length; i++) {
			sort.sort(i);
			String unSortedArrays = Arrays.toString(sort.hh);
			System.out.println(unSortedArrays);

		}
		String sortedArray = Arrays.toString(sort.hh);
		System.out.println(sortedArray);
	}

}
