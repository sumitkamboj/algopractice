package com.sumit.next;

public class InsertionSort {

	public static void main(String[] arg) {
		int a[] = {1,5,7,2,7,4,6};
		insertionSortTheArray(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void insertionSortTheArray(int a[]) {
		int length = a.length;
		for(int i=1;i<length;i++) {
			int key = a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
	
	
	
	
}
