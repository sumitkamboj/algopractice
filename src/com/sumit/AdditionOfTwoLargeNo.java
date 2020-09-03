package com.sumit;

public class AdditionOfTwoLargeNo {

	public static void main(String[] args) {
System.out.println(AdditionOfTwoLargeNoA("134213", "678"));

	}
	static String AdditionOfTwoLargeNoA(String str1, String str2) {
		
		String t;
		if(str1.length()<str2.length()) {
			t = str1;
			str1 = str2;
			str2 = t;
		}
		str1= new StringBuilder(str1).reverse().toString();
		str2= new StringBuilder(str2).reverse().toString();
		int n1=str1.length();
		int n2=str2.length();
		String str = "";
		int carry = 0;
		for(int i = 0; i<n2 ; i++) {
			int sum = ((int)(str1.charAt(i)-'0')+(int)(str2.charAt(i)-'0')+carry);
			str += (char)(sum%10+'0');
			carry = sum/10;
		}
		for(int i=n2; i<n1;i++) {
			int sum =((int)(str1.charAt(i)-'0')+carry);
			str += (char)(sum%10+'0');
			carry = sum/10;
		}
		if(carry>0) {
			str += (char)(carry + '0');
		}
		
		return new StringBuilder(str).reverse().toString();
	}

}
