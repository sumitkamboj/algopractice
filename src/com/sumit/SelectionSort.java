package com.sumit;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,5,3,1,8,7,2};//new int[7];

		System.out.println("before sort:");
		for(int x :array)
			System.out.println(x);
		selectionSort(array);
		System.out.println("after sort:");
		for(int x :array)
			System.out.println(x);
	}

	public static void selectionSort(int[] array) {
		int n = array.length;
		int i,j,temp;
		for( i=0;i<n-1;i++) {
			int loc = i;
		for( j=i+1;j<n;j++) {
			if(array[loc] > array[j]) {
				loc=j;
			}
		}
		temp = array[i];
		array[i] =array[loc];
		array[loc]= temp;
		}
		
	}
}
