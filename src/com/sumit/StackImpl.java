package com.sumit;

public class StackImpl {
	static final int max =1000;
	int top;
	int a[] = new int[max];
	StackImpl() 
	    { 
	        top = -1; 
	    } 
	
	boolean isEmpty() 
    {  System.out.println(top<0);
        return (top < 0); 
    } 
	boolean push(int x) {
		if(top == (max-1)) {
			System.out.println("stack is overflown");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println("pushed into stack");
			return true;
		}
		
	}
	int pop() {
		
		if(top < 0) {
			System.out.println("stack is underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
			
		}
	}
	int peek() {
		if(top < 0) {
			System.out.println("underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
	public void display() {
		
		int i=0;
		while(i<top+1) {
			System.out.println(a[i]);
			i++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl stk = new StackImpl();
		stk.isEmpty();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.display();
		stk.pop();
		stk.pop();
		stk.display();
	}

}
