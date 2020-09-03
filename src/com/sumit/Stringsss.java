package com.sumit;

public class Stringsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sumit";
		int i=6;
		char[] ch =s.toCharArray();
		for(char x:ch) {
		//	System.out.println(x);
		}
		byte[] intch =s.getBytes();
		//System.out.println(s.indexOf('m'));
		//System.out.println(s.indexOf("um"));
		String s1 = "sumit";
		String s2 = new String("sumit");
		if(s1.equals(s2)) {
			System.out.println("s1.equals(s2)");
		}
		if(s1 == s2) {
			System.out.println("s == s2");
		}
		StringBuilder sb = new StringBuilder("sumit");
	
	}

}
