package com.sumit.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEachExample {

	public static void main(String[] args) {
		
	List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<4; i++) {
			myList.add(i);
		}
     Iterator<Integer> it =  myList.iterator();
     while(it.hasNext()) {
    	 Integer i = it.next();
    	 System.out.println("while loop Iterator Value::"+i);
     }
     myList.forEach(new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			System.out.println("foreach anonymous class :"+t);
		}
    	 
     });
     MyConsumer action = new MyConsumer();
    	myList.forEach(action);	
	}
}
 class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		//t = t+10;
		System.out.println("consumer impl value : "+t);
		
	}
	 
 }