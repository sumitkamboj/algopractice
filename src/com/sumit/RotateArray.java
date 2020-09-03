package com.sumit;

public class RotateArray {

	public static void main(String[] args) {
		int[] list = {1,15,25,80,2,88,89,111};
		RotateArray ra = new RotateArray();
		int numberOfRotatation =6;
		ra.rotateArray(list, numberOfRotatation);

	}
	private void rotateArray(int[] a, int rotatations) {
		int length = a.length;
		for(int i=0;i<rotatations;i++) {
			int j,last;
			last = a[length-1];
			for(j=length-1;j>0;j--) {
				a[j] = a[j-1];
				
			}
			a[0] = last;
			
		}
		
	
		
		for(int x : a) {
			System.out.println(x);
		}
		
	}
}
