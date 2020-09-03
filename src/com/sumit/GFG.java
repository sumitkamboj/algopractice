package com.sumit;

// Java program to find sum of two large numbers.  
import java.util.*; 
  
class GFG{ 
      
 // Function for finding sum of larger numbers  
static String findSum(String str1, String str2)  
{  
    // Before proceeding further, make sure length  
    // of str2 is larger.  
    if (str1.length() > str2.length()){ 
    	System.out.println(str1);
        System.out.println(str2);
    	String t = str1; 
        str1 = str2; 
        str2 = t; 
      //  System.out.println(str1);
     //   System.out.println(str2);
    } 
  
    // Take an empty String for storing result  
    String str = "";  
  
    // Calculate length of both String  
    int n1 = str1.length(), n2 = str2.length();  
    int diff = n2 - n1;  
  //  System.out.println(n1);
  //  System.out.println(n2);
 //   System.out.println(diff);
  
    // Initially take carry zero  
    int carry = 0;  
  
    // Traverse from end of both Strings  
    for (int i = n1 - 1; i>=0; i--)  
    {  
        // Do school mathematics, compute sum of  
        // current digits and carry
    	//System.out.println(carry);
    	int x= (str1.charAt(i));
    	System.out.println(str1.charAt(i)-'0');
    	
        int sum = ((int)(str1.charAt(i)-'0') +  
            (int)(str2.charAt(i+diff)-'0') + carry);  
     //   System.out.println(sum);
        int y= sum%10;
        int z = '0';
        str += (char)(sum % 10 + '0');
       // System.out.println(str);
        carry = sum / 10;  
     //   System.out.println(carry);
    }  
  
    // Add remaining digits of str2[]  
    for (int i = n2 - n1 - 1; i >= 0; i--)  
    {  
        int sum = ((int)(str2.charAt(i) - '0') + carry);  
       // System.out.println(sum);
        str += (char)(sum % 10 + '0');
       // System.out.println(str);
        carry = sum / 10;  
       // System.out.println(carry);
    }  
  
    // Add remaining carry  
    if (carry > 0)  
        str += (char)(carry + '0'); 
    System.out.println(str);
  
    // reverse resultant String 
    return new StringBuilder(str).reverse().toString(); 
}  
  
// Driver code  
public static void main(String[] args)  
{  
    String str1 = "12";  
    String str2 = "198111";  
   // System.out.println(findSum(str1, str2));  
   System.out.println(isPalindromeString("ababa"));
    char check = 55;
   // System.out.println(check);
  //  reverseString("I Am Not String");
    
}  

private static boolean isPalindromeString(String str) {
    if (str == null)
        return false;
    int length = str.length();
    System.out.println(length / 2);
    for (int i = 0; i < length / 2; i++) {

        if (str.charAt(i) != str.charAt(length - i - 1))
            return false;
    }
    return true;
}

static void reverseString(String inputString)
{
    //Converting inputString to char array 'inputStringArray'
     
    char[] inputStringArray = inputString.toCharArray();
     
    //Defining a new char array 'resultArray' with same size as inputStringArray
     
    char[] resultArray = new char[inputStringArray.length];
     
    //First for loop : 
    //For every space in the 'inputStringArray', 
    //we insert spaces in the 'resultArray' at the corresponding positions 
     
    for (int i = 0; i < inputStringArray.length; i++) 
    {
        if (inputStringArray[i] == ' ') 
        {
            resultArray[i] = ' ';
        }
    }
     
    //Initializing 'j' with length of resultArray
     
    int j = resultArray.length-1;
             
    //Second for loop :
    //we copy every non-space character of inputStringArray 
    //from first to last at 'j' position of resultArray
     
    for (int i = 0; i < inputStringArray.length; i++)
    {
        if (inputStringArray[i] != ' ') 
        {
            //If resultArray already has space at index j then decrementing 'j'
             
            if(resultArray[j] == ' ')
            {
                j--;
            }
             
            resultArray[j] = inputStringArray[i];
             
            j--;
        }
    }
     
    System.out.println(inputString+" ---> "+String.valueOf(resultArray));
}
 
} 
  
// This code is contributed by mits 

