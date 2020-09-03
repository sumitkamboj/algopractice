package com.sumit.test;

/* package whatever; // don't place package name! */

 
/* Name of the class has to be "Main" only if the class is public. */
class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Test ideone = new Test(); 
		System.out.println( ideone.isPalindrome("Montreal") );
	}
 
	//Given a string, implement a function that would tell us if it's a palindrome "Montreal"
	public Boolean isPalindrome(String word) {
		char[] array = word.toCharArray();
		int length = array.length;
		char[] reverse = new char[length];
		int i = length-1;
		int j = 0;
		while(i>=0) {
			reverse[j] = array[i];
			if(array[j] != array[i]) {
				return false;
			}
			j++;
			i--;
		}
		StringBuilder reversedString =new StringBuilder();
		reversedString.append(reverse);
		String reversedString1 = reversedString.toString();
		if(word.equals(reversedString1)) {
			return true;
		}
			return false;
		
	}
}