package com.sumit;

public class IsPalindrome {
	
	
	public void isNumberPolindromeUsingString(int number) {
	   String convertedNumber = Integer.toString(number);
       StringBuilder str = new StringBuilder();
       StringBuilder str2 = new StringBuilder();
       str2.append(convertedNumber);
       str.append(convertedNumber);
       System.out.println(str);
       StringBuilder str1 = new StringBuilder();
       str1 = str1.append(str.reverse());
       if(str2.toString().equals(str1.toString())) {
    	   System.out.println("polindrome");
       }
       else
       {
    	   System.out.println("not");
       }
		
	}

	public void isNumberPolindromeUsingMath(int number) {
		int temp = number;
		int sum =0;
		while (number>0) {
			int r = number%10;
			sum = (sum*10)+r;
			number = number/10;
		}
		if(temp == sum) {
			System.out.println("polindrome");
		}
		else {
			System.out.println("not polindrome");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 151;
		IsPalindrome ip = new IsPalindrome();
		//ip.isNumberPolindromeUsingString(number);
		ip.isNumberPolindromeUsingMath(number);
	}

}
