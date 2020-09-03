package com.sumit;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = {6,5,3,1,8,7,2};//new int[7];

		System.out.println("before sort:");
		for(int x :array)
			System.out.print(x);
		insertionSort(array);
		System.out.println("after sort:");
		for(int x :array)
			System.out.print(x);

	}
	public static void insertionSort(int[] array) {
		int n = array.length;
		int i,temp;
		for( i=1;i<n;i++) {
		int key = array[i];
		int j=i-1;
		while(j>=0 && array[j]>key) {
			array[j+1] = array[j];
			j=j-1;
			
		}
		
		array[j+1] = key;
		for(int x :array)
			System.out.print(x);
		System.out.println();
		}
		
	}

}
