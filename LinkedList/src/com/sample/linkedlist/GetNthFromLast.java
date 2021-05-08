package com.sample.linkedlist;

public class GetNthFromLast {
	
	Node head;
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public int getNthElementFromEnd(int n) {
		int len = 0;
		Node temp = head;
		
		// find the length of a linked list
		while(temp !=null) {
			temp = temp.next;
			len++;
		}
		
		
		if(len < n) {
			return -1;
		}
		
		Node current = head;
		System.out.println("The length of the linked list is :"+len);
		for(int i =1 ; i < len - n +1; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetNthFromLast gnl = new GetNthFromLast();
		 gnl.head = new Node(10);
		Node first = new Node(5);
		Node second = new Node(3);
		Node third = new Node(8);
		Node fourth = new Node(9);
		Node fifth = new Node(12);
		Node sixth = new Node(15); // 10-5-3-7-9-12-15
		
		gnl.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		printNodes(gnl.head);
		System.out.println();
		System.out.println("Getting 4th element from the end :"+gnl.getNthElementFromEnd(4));
	}

	private static void printNodes(Node head) {
		Node last = head;
		while(last !=null) {
			System.out.print(last.data+"|");
			last = last.next;
		}
		
	}

}
