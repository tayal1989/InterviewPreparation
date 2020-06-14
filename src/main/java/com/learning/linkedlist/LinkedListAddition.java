package com.learning.linkedlist;

public class LinkedListAddition {
	
	Node head ;
	
	static class Node {
		int data ;
		Node next ;
		
		Node(int d) {
			data = d ;
			next = null ;
		}
	}
	
	public void printList() {
		Node h = head ;
		
		while(h != null) {
			System.out.print(h.data + " ");
			h = h.next ;
		}
	}
	
	public void addAtBeginning(int d) {
		Node newNode = new Node(d);
		
		newNode.next = head ;
		head = newNode;
	}
	
	public void addAtEnd(int d) {
		Node newNode = new Node(d);
		newNode.next = null;
		Node n = head ;
		
		while(n.next != null) {
			n = n.next;
		}
		
		n.next = newNode ;
		return;
	}
	
	public void addAnywhere(Node prevNode, int data) {
		Node newNode = new Node(data);
		
		newNode.next = prevNode.next;
		prevNode.next = newNode ;
	}
	
	public void deleteByKey(int data) {
		Node n = head ;
		Node prev = null ;
		
		if(n.data == data) {
			head = n.next;
			return ;
		}
		
		while(n != null && n.data != data) {
			prev = n ;
			n = n.next;
		}
		
		prev.next = n.next ;
	}
	
	public void deleteByPosition(int position) {
		Node n = head ;
		Node prev = null ;
		int count = 0 ;
		
		if(position == 0) {
			head = n.next;
			return ;
		}
		
		while(n != null && position != count) {
			prev = n ;				
			count++;
			n = n.next;
		}
		
		prev.next = n.next;		
	}
	
	public void deleteCompleteList() {
		head = null ;
	}
	
	public int lengthOfLinkedList() {
		Node n = head ;
		int count = 0 ;
		
		while(n != null) {
			count++ ;
			n = n.next;
		}
		return count;
	}
	
	public boolean searchDataInLinkedList(int data) {
		Node n = head ;
		boolean flag = false ;
		while(n != null) {
			if(n.data == data) {
				flag = true ;
			}
			n = n.next ;
		}
		
		return flag ;
	}
	
	public int getDataFromNode(int position) {
		Node n = head ;
		int element = 0;
		int count = 0;
		
		while(n != null) {
			if(position == count) {
				return n.data;
			}
			count++;
			n = n.next;
		}
		
		return element ;
	}
	
	public void getMiddleNode() {
		Node slow = head ;
		Node fast = head ;
		
		if(head != null) {
			while(fast != null && fast.next != null) {
				slow = slow.next ;
				fast = fast.next.next ;
			}
			
			System.out.println("Middle Node Data --> " + slow.data);
		}		
	}
	
	public static void main(String[] args) {
		LinkedListAddition lla = new LinkedListAddition();
		lla.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		lla.head.next = second ;
		second.next = third ;		
		lla.printList();
		System.out.println();
		
		lla.getMiddleNode();
		
		lla.addAtBeginning(0);		
		lla.printList();
		System.out.println();
		
		lla.getMiddleNode();
		
		lla.addAtEnd(4);
		lla.printList();
		System.out.println();
		
		lla.addAnywhere(second, 10);
		lla.printList();
		System.out.println();
		
		System.out.println("Length of Linked List --> " + lla.lengthOfLinkedList());
		System.out.println("Element 3 --> " + lla.searchDataInLinkedList(3));
		System.out.println("Element 5 --> " + lla.searchDataInLinkedList(5));
		System.out.println("Element --> " + lla.getDataFromNode(3));
		
		lla.deleteByKey(0);
		lla.printList();
		System.out.println();
		
		lla.deleteByKey(10);
		lla.printList();
		System.out.println();
		
		lla.deleteByPosition(0);
		lla.printList();
		System.out.println();
		
		lla.deleteByPosition(1);
		lla.printList();
		System.out.println();
		
		System.out.print("Deleted completed list --> ");
		lla.deleteCompleteList();
		lla.printList();
		System.out.println();
	}

}
