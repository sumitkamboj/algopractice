package com.sumit.next;

public class SelectionSortAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,1,2,7,4,6};
		selectionSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}
	static void selectionSort(int[] a) {
		int length = a.length;
		for(int i=0;i<length;i++) {
			int smallestElement = i; 
			for(int j = i+1;j<length;j++) {
				if(a[smallestElement]>a[j]) {
					smallestElement = j;
				}
			}
			int temp = a[i];
			a[i] = a[smallestElement];
			a[smallestElement] = temp;
		}
	}

}
