package com.sumit;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tillWhen = 15;
		fibonacciSeris(tillWhen);

	}
	static void fibonacciSeris(int n) {
		int first = 1;
		int second = 1;
		int array[] = new int[n];
		array[0]=first;
		array[1]=second;
		int i=2;
		while(i<array.length) {
			array[i] = array[i-1] + array[i-2];
			i++;
		}
		for(int x :array) {
			System.out.println(x);
		}
	}
}
