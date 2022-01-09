package com.learning.singlylinkedlist;

public class SinglyLinkedList {
	
	private ListNode head;
	
	public void printList() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public void lengthOfNode() {
		ListNode current = head;
		int count = 0;
		if(head == null) {
			System.out.println("\nLength of singly linked list : " + count);
		}
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		if(count > 0) {
			System.out.println("\nLength of singly linked list : " + count);
		}
	}
	
	public void insertNodeAtBeginning(int data) {
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			head = newNode;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertNodeAtEnd(int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		if(head == null) {
			head = newNode;
			return;
		}
		
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void insertNodeAtPosition(int position, int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		if(head == null) {
			head = newNode;
		} else if(position == 1) {
			newNode.next = current;
			head = newNode;
		} else {
			int count = 1;
			while(count < position - 1) {
				current = current.next;
				count++;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		
		sll.head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.printList();
		sll.lengthOfNode();
		
		sll.insertNodeAtBeginning(0);
		sll.printList();
		sll.lengthOfNode();
		
		sll.insertNodeAtEnd(50);
		sll.printList();
		sll.lengthOfNode();
		
		sll.insertNodeAtPosition(7, 25);
		sll.printList();
		sll.lengthOfNode();
	}

}
