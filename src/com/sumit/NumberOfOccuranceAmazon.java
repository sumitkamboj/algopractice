package com.sumit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfOccuranceAmazon {

	public void countNumberOfOccurance(List<Integer> list) {
		HashMap<Integer, Integer> hm = new HashMap();
		for (Integer i : list) {
			if(hm.containsKey(i)) {
				hm.put(i, (hm.get(i)+1));
			}
			else {
				hm.put(i, 1);
			}
		}
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry mapElement = (Map.Entry)it.next();
			System.out.println("Number : "+mapElement.getKey()+", occurance : "+mapElement.getValue());
		}
		for(Map.Entry mapElement : hm.entrySet()) {
			System.out.println(mapElement.getKey());
			System.out.println(mapElement.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		List<String> exculdewords = new ArrayList();
		String[] s = {"a","an","the", "is","of","help","am","and","he","are","to","too"};
		exculdewords.addAll(Arrays.asList(s));
		String s1 = "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.";
		System.out.println(mostFrequent(s1,exculdewords));
		String delimiter1 = "'";
		String delimiter2 = " ";
		s1 = s1.replaceAll(delimiter1, delimiter2);
		String s2[] = s1.split(" ");
		List<String> helptext = null; 
		helptext = Arrays.asList(s2);
		 helptext = helptext.stream().map(t->t.toLowerCase()).collect(Collectors.toList());
		 helptext = helptext.stream().map(t->t.replaceAll("[-+.^:,]","")).collect(Collectors.toList());
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (String i : helptext) {
			if(hm.containsKey(i)) {
				hm.put(i, (hm.get(i)+1));
			}
			else {
				hm.put(i, 1);
			}
		}
		
		for(String i : exculdewords) {
			if(hm.containsKey(i)) {
				hm.remove(i);
			}
		}
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry mapElement = (Map.Entry)it.next();
			//System.out.println("String : "+mapElement.getKey()+", occurance : "+mapElement.getValue());
		}
		
		
		/*
		 * list.add(1); list.add(2); list.add(1); list.add(2); list.add(3); list.add(4);
		 * list.add(5); NumberOfOccurance noc = new NumberOfOccurance();
		 * noc.countNumberOfOccurance(list);
		 */

	}

    public static List<String> mostFrequent(String helpText, List<String> wordsToExclude) { 
           String[] wordsToEx = {"a","an","the", "is","of","help","am","and","he","are","to","too"};
    wordsToExclude.addAll(Arrays.asList(wordsToEx));
    String deliiter1 = "'";
    String deliiter2 = " ";
    helpText = helpText.replaceAll(deliiter1, deliiter2);
    String words[] = helpText.split(" ");
    List<String> wordsList = Arrays.asList(words);
     wordsList = wordsList.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
     wordsList = wordsList.stream().map(s1->s1.replaceAll("[-+.'^:,]", "")).collect(Collectors.toList());
    Map<String, Integer> hm = new HashMap<String, Integer>();
    for(String s : wordsList){
        if(hm.containsKey(s)){
            hm.put(s, hm.get(s)+1);
        }
        else{
            hm.put(s,1);
        }
    }
    for(String s1 : wordsToExclude){
        if(hm.containsKey(s1)){
            hm.remove(s1);
        }
    }

    List<String> frequentWord = new ArrayList();
    int max = 0;
    Map.Entry<String,Integer> maxEntry = null;
    for(Map.Entry<String,Integer> entry : hm.entrySet()){
        if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue())>0){
            maxEntry = entry;
        }
        max = maxEntry.getValue();
    }
       
    for(Map.Entry<String,Integer> entry : hm.entrySet()){
        if(entry.getValue() == max){
            if(!frequentWord.contains(entry.getKey()))
                frequentWord.add(entry.getKey());
        }
       
    }  
    
    Collections.sort(frequentWord);
    return frequentWord;
}
}