package com.wadali;

import java.util.Arrays;

public class QuickSortTest {

	int array[]={6,9,2,3,5,6,7};
	void quickSort(int low,int high) {
		int pivot=array[low+(high-low)/2];
		int i=low;
		int j =high; 
		while(i<=j){
			
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			
			if(i<=j){
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
			}
			
			if(low<j){
				quickSort(low,j);
			}
			if (i < high) {
				quickSort(i, high);
			}

			
		}
		
	}
	
	
	public static void main(String[] args) {
		QuickSortTest quickSortTest= new QuickSortTest();
		quickSortTest.quickSort(0,quickSortTest.array.length-1);
		System.out.println(Arrays.toString(quickSortTest.array));
	}

}
