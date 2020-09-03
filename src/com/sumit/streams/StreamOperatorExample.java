package com.sumit.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			list.add(i);
		}
		Stream<Integer> st = list.stream().map(s -> s);//intermediate operation
		st.forEach(s->System.out.println(s));//terminal operator, no more action can be done on this stream
		
		List<Integer> listFromStream = list.stream().map(s -> s*s).collect(Collectors.toList());//collect element to a list, collect is terminal operator
		listFromStream.forEach(s->System.out.println(s));
		System.out.println("reduce example");
		Optional<Integer> sum = listFromStream.stream().reduce((s1 ,s2)-> s1+s2);//terminal operation
		sum.ifPresent(System.out::println);
	
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i=5; i<10; i++) {
			list2.add(i);
		}
	List<List<Integer>> listUnderList = new ArrayList<>();
	listUnderList.add(list);
	listUnderList.add(list2);
	System.out.println(listUnderList);
	List<Integer> listUnderListStream = listUnderList.stream().flatMap(Collection::stream).collect(Collectors.toList());//flatmap is intermediate operation
	System.out.println(listUnderListStream);
	//listUnderListStream.forEach(s->System.out.println(s));
	
	}

}
