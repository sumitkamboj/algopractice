package com.sumit.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<20; i++) {
			list.add(i);
		}
	//	list.forEach(p->System.out.println(p));
		Stream<Integer> sequentialStream = list.stream();
		//Stream<Integer> highNums = sequentialStream.filter(p->p>10);
//		Stream<Integer> highNums = sequentialStream.filter(new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				if(t > 10) {
//					return true;
//				}
//				return false;
//			}
//			
//		});
		
		  Stream<Integer> highNums = sequentialStream.filter((t) -> {
		  
		  if(t > 10) { return true; } return false;
		  
		  });
		 
		System.out.print("High Nums greater than 10=");
		highNums.forEach((Integer p) -> System.out.print(p+" "));
		Stream<Integer> parrellStream = list.parallelStream();
		Stream<Integer> highNumparrellStream = parrellStream.filter(p->p>10);
		System.out.println("parellel Stream");
		highNumparrellStream.forEach(p->System.out.print(p+" "));
	}

}
