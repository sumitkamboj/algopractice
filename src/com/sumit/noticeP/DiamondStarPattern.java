package com.sumit.noticeP;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String args[]) {
		System.out.println("please enter number of rows");
		int n = 0;
		try {
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
		}catch(Exception e) {
			System.out.println("wrong input"+e);
			
		}
		
		
		for(int i = 0; i<n; i++) {
			for(int j =n-i; j>1 ; j--) {
				
				System.out.print(" ");
			}
			for(int k = 0 ; k<=i; k++) {
				System.out.print("* ");	
				
			}
			System.out.println();
		}
		
		
		for(int i = n; i>0; i--) {
			for(int j = 1; j<=n-i ; j++) {
				
				System.out.print(" ");
			}
			for(int k = i ; k>0; k--) {
				System.out.print("* ");	
				
			}
			System.out.println();
		}
	}

}
