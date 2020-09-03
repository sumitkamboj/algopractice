package com.sumit;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(findFactorial(n));

	}
	static int findFactorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n*findFactorial(n-1));
						
		}
	}

}
