package com.learning.linkedlist;

/**
 * @author Vishal Agarwal
 * @version Creation time: 08-Aug-2021 7:27:58 pm
 * @classDescription
*/

public class InsertingNodeInSortedLL {
	
	private Node head ;
	
	private static class Node {
		private int data ;
		private Node next ;
		
		Node(int data) {
			this.data = data ;
			this.next = null ;
		}
	}
	
	private void printList() {
		Node current = head ;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next ;
		}
		System.out.print("null");
		System.out.println();
	}
	
	private void insertAtBeginning(int data) {
		Node newNode = new Node(data) ;
		newNode.next = head ;
		head = newNode ;
	}
	
	private void insertNodeInSortedLL(int newData) {
		Node newNode = new Node(newData);
		Node current = head ;
		
		if(head == null) {
			head = newNode ;
			return ;
		}
		
		while(current != null) {
			if(current.data < newData && current.next != null && current.next.data > newData) {
				newNode.next = current.next ;
				current.next = newNode ;
				break ;
			} else if(current.data < newData && current.next == null){
				newNode.next = current.next ;
				current.next = newNode ;
			}
			current = current.next ;
		}
	}

	public static void main(String[] args) {
		InsertingNodeInSortedLL ini = new InsertingNodeInSortedLL();
		
		ini.insertAtBeginning(7);
		ini.insertAtBeginning(5);
		ini.insertAtBeginning(3);
		ini.insertAtBeginning(1);
		
		ini.printList();
		
		ini.insertNodeInSortedLL(4);
		ini.printList();
		
		ini.insertNodeInSortedLL(6);
		ini.printList();
		
		ini.insertNodeInSortedLL(8);
		ini.printList();
	}

}
