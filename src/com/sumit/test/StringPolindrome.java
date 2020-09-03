package com.sumit.test;

/* package whatever; // don't place package name! */

 
/* Name of the class has to be "Main" only if the class is public. */
class StringPolindrome
{
	public static void main (String[] args) 
	{
		Test ideone = new Test(); 
		System.out.println( ideone.isPalindrome("abccbaa") );
	}
 
	//Given a string, implement a function that would tell us if it's a palindrome "Montreal"
	public Boolean isPalindrome(String word) {
		char[] array = word.toCharArray();
		int length = array.length;
		int i = length-1;
		int j = 0;
		while(i>=0) {
			if(array[j] != array[i]) {
				return false;
			}
			j++;
			i--;
		}
		
		return true;
		
	}
}