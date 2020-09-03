package com.sumit;

public class LinkedListImpl2 {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	public static LinkedListImpl2 insert(LinkedListImpl2 list, int data) {
		Node nn = new Node(data);
		nn.next = null;
		if(list.head == null) {
			list.head = nn;
		}
		else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = nn;
		}
		return list;
	}
	
    public static void print(LinkedListImpl2 list) {
    	if(list.head ==null) {
    		System.out.println("empty");
    	}
    	else {
    		Node current = list.head;
    		while(current !=null) {
    			System.out.println(current.data);
    			current = current.next;
    		}
    	}
		
	}
    
    public static LinkedListImpl2 delete(LinkedListImpl2 list, int data) {
    	Node current = list.head, prev = null;
    	if(current.data == data && current.next != null) {
    		list.head = current.next;
    		System.out.println("found and deleted");
    	}
    	else{
    		while(current.data != data && current.next != null) {
    			prev = current;
        		current = current.next;
    		}
    		if(current.data ==data && current != null) {
    		    prev.next = current.next;
    			System.out.println("found and deleted");
    		}
    		
    	if(current.next == null) {
    		System.out.println("not found");
    	}
    	}
	return list;
   }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl2 ll = new LinkedListImpl2();
		ll.print(ll);
		ll.insert(ll, 1);
		ll.insert(ll, 2);
		ll.insert(ll, 3);
		ll.insert(ll, 4);
		ll.print(ll);
		ll.delete(ll, 5);
		ll.print(ll);
	}

}
