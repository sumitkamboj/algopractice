package com.sumit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,30,30,40,40,55,55};
		removeDucplicateFromArray(a);
	}
	static void removeDucplicateFromArray(int[] a) {
		int n = a.length;
		Arrays.sort(a);
		int[] temp = new int[n];
		int j = 0;
		for(int i=0;i<n-1;i++) {
			if(a[i] != a[i+1]) {
				temp[j] = a[i];
						j++;
			}
		}
		temp[j++] = a[n-1];
		for (int i : temp) {
			System.out.println(i);
		}
		
	}
	static void removeDucplicateFromArrayUsingSet(int[] a) {
		//Arrays.sort(a);
		HashSet s = new HashSet();
        for (int i : a) {
			s.add(i);
		}
        System.out.println("before removal");
		for (int k : a) {
			System.out.println(k);
		}
		System.out.println("after removal");
		Iterator itr = s.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
}
