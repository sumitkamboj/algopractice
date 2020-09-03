package com.sumit.innerclasses;

public class AnnonymousInner {
	public int i=5;
 public void myMethod() {
	 System.out.println("Inside AnnonymousInner::MyMethod:"+i);
 }
 public void myMethod1() {
	 System.out.println("Inside AnnonymousInner::MyMethod1 :"+i);
 }
 public void myMethod2(AnnonymousInner arguInner) {
	 System.out.println("Inside AnnonymousInner::MyMethod2 :"+i);
 }
 public static void main(String args[]) {
 AnnonymousInner inner = new AnnonymousInner(){
	 		public void myMethod1() {
			System.out.println("inside main method:");
			
		}
	 };
	 inner.myMethod1();
 } 
}
