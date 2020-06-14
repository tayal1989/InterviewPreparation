package com.learning.linkedlist;

public class DetectLoop {
	
	Node head ;
	
	static class Node {
		int data;
		Node next;
		
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
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public boolean detectLoopInLL() {
		Node slow = head ;
		Node fast = head ;
		
		while(fast != null && fast.next != null && slow != null) {
			slow = slow.next ;
			fast = fast.next.next ;
			
			if(slow == fast) {
				System.out.println(countNodes(slow));
				return true ;
			}
		}
		
		return false;
	}
	
	public int countNodes(Node slow) {
		Node n = slow ;
		int count = 1 ;
		
		while(n.next != slow) {
			count++ ;
			n = n.next ;
		}
		return count ;
	}

	public static void main(String[] args) {
		DetectLoop dl = new DetectLoop();
		dl.push(1);
		dl.push(2);
		dl.push(3);
		dl.push(4);
		
		dl.printList();
		System.out.println();
		
		dl.head.next.next.next.next = dl.head ;
		
		if(dl.detectLoopInLL()) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}

}
