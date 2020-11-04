package com.sumit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aarmy";
		String s2 ="maary";
		System.out.println(isAnagramStrings(s1, s2) ? "Yes" : "No");
	//	int a = 123451234512345;
		//System.out.println(a);

	}
	static boolean isAnagramStrings(String s1, String s2) {
		boolean isAnagram =false;
		HashMap<Character, Integer> hmForS1 =new HashMap();
		HashMap<Character, Integer> hmForS2 =new HashMap();
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		if(s1Chars.length != s2Chars.length) {
			isAnagram = false;
		}
		else {
			for(int i=0;i<s1Chars.length;i++) {
				if(hmForS1.containsKey(s1Chars[i])) {
					hmForS1.put(s1Chars[i], hmForS1.get(s1Chars[i])+1);
				}
				else {
					hmForS1.put(s1Chars[i], 1);
				}
			}
			for(int i=0;i<s2Chars.length;i++) {
				if(hmForS2.containsKey(s2Chars[i])) {
					hmForS2.put(s2Chars[i], hmForS2.get(s2Chars[i])+1);
				}
				else {
					hmForS2.put(s2Chars[i], 1);
				}
			}
			Iterator<Entry<Character, Integer>> itr = hmForS1.entrySet().iterator();
			while(itr.hasNext()) {
				Map.Entry<Character, Integer> entry = itr.next();
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			Iterator<Entry<Character, Integer>> itr1 = hmForS2.entrySet().iterator();
			while(itr1.hasNext()) {
				Map.Entry<Character, Integer> entry = itr1.next();
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		if(hmForS1.equals(hmForS2)) {
			isAnagram = true;
		}
		else {
			isAnagram = false;
		}
		return isAnagram;
	}
}

