package com.sumit;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int count = 0;
		for(int i=1;i<n;i++) {
			if(n%i == 0) {
				count = count +1;
			}
		}
		if(count == 1) {
			System.out.println("prime");
		}
		else {
			System.out.println("notprime");
		}
	}

}
