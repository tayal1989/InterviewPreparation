package com.learning.linkedlist;

public class ReverseLinkedList {
	Node head ;
	
	static class Node {
		int data ;
		Node next ;
		
		Node(int d) {
			data = d ;
			next = null ;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data) ;
		newNode.next = head ;
		head = newNode ;
	}
	
	public void printList() {
		Node n = head ;
		
		while(n != null) {
			System.out.print(n.data + " --> ");
			n = n.next ;
		}
	}
	
	public Node reverseLinkedList() {
		Node current = head ;
		Node next = null ;
		Node previous = null ;
		
		while(current != null) {
			next = current.next ;
			current.next = previous ;
			previous = current ;
			current = next ;
		}
		
		head = previous ;
		return previous ;
	}

	public static void main(String[] args) {
		ReverseLinkedList ll = new ReverseLinkedList();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.printList();
		System.out.println();
		
		ll.reverseLinkedList();
		ll.printList();
	}

}
