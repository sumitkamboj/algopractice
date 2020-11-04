package com.sumit;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {6,5,3,1,8,7,2,5};//new int[7];

		System.out.println("before sort:");
		for(int x :array)
			System.out.println(x);
		bubbeSort(array);
		System.out.println("after sort:");
		for(int x :array)
			System.out.println(x);
		
	}
	public static void bubbeSort(int[] array) {
		int n = array.length;
		int i,j,temp;
		for( i=0;i<n;i++) {
		for( j=1;j<n-i;j++) {
			if(array[j-1] > array[j]) {
				temp= array[j-1];
				array[j-1]=array[j];
				array[j] = temp;
			}
		}
		}
		
	}
	
}
