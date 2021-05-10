package com.sample.linkedlist;

public class ReverseLinkedList {
	
	Node head;
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	public void printList(Node head) {
		Node last = head;
		while(last != null) {
			System.out.print(last.data+ " ");
			last = last.next;
		}
		System.out.println();
	}

	
	public void reverse(Node head) {
		Node current = head;
		Node next = null;
		Node prev = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		System.out.println("The reversed list is: ");
		printList(prev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList rll = new ReverseLinkedList();
		rll.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		
		rll.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		
		System.out.println("Printing the original list");
		rll.printList(rll.head);
		System.out.println("Reversing the linked list");
		rll.reverse(rll.head);
		
		
	}

}
