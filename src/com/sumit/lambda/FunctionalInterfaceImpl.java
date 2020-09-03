package com.sumit.lambda;

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FunnctionalInterface fi = (int i)->System.out.println("Hey, I am working!!"+i);
		//fi.method();
		
		  FunnctionalInterface fi = new FunnctionalInterface() {
		  
		  @Override public void method() { // TODO Auto-generated method stub
		  System.out.println("method"); }

		@Override
		public void method1(int i) {
			// TODO Auto-generated method stub
			System.out.println("hello"+i);
			
		} };
		 
		fi.method1(5);
		fi.method();
	}

}
