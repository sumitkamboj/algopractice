package com.sumit.hackerranktest;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(doStuff(args));
			
		}catch(Exception e) {
			System.out.println("exc");
		}
		doStuff(args);
	}
		static int doStuff(String args[]) {
			return Integer.parseInt(args[0]);
		}


}
