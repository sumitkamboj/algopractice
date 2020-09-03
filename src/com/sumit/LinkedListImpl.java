package com.sumit;

public class LinkedListImpl {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
		 data = d;
		 next = null;
		}
	}
	public static LinkedListImpl insert(LinkedListImpl list, int data) {
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
	public static void printLinkedList(LinkedListImpl list) {
		
			Node current = list.head;
			while(current != null) {
				System.out.println(current.data);
				current = current.next;
			}
	}
	public static LinkedListImpl delete(LinkedListImpl list, int data) {
		Node current = list.head, prev =null;
		 // 
        // CASE 1: 
        // If head node itself holds the key to be deleted 
		if(current.data == data && current != null) {
			list.head = current.next;
			System.out.println("found and deleted");
			return list;
		}
		else {
        // 
        // CASE 2: 
        // If the key is somewhere other than at head 
        // 
  
        // Search for the key to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
		while(current != null && current.data != data) {
			prev =current;
			current = current.next;
		}
		// If the key was present, it should be at currNode 
        // Therefore the currNode shall not be null
			if(current != null) {
				prev.next = current.next;
				System.out.println("found and deleted");
			}
			 // 
	        // CASE 3: The key is not present 
	        // 
	  
	        // If key was not present in linked list 
	        // currNode should be null 
			if(current == null) {
					System.out.println("not found");				
			
		}
		}
		return list;
	}
  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl ll =  new LinkedListImpl();
		ll = insert(ll,1);
		ll = insert(ll,2);
		ll = insert(ll,3);
		ll = insert(ll,4);
		ll = insert(ll,5);
		printLinkedList(ll);
		System.out.println("after deletion");
		delete(ll,1); 
		printLinkedList(ll);
		delete(ll,3); 
		printLinkedList(ll);
		delete(ll,5);
		printLinkedList(ll);
	}

}
