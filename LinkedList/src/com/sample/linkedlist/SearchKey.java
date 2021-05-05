package com.sample.linkedlist;

public class SearchKey {
	
	Node head;
	static class Node {
		int data;
		Node next;
		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchKey sk = new SearchKey();
		sk.head = new Node(10);
		Node first = new Node(15);
		Node second = new Node(12);
		Node third = new Node(8);
		Node fourth = new Node(20);
		Node fifth = new Node(23);
		Node sixth = new Node(25);
		
		sk.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		sk.printNodes(sk.head);
		System.out.println();
		System.out.println("Searching for key 23 ? :"+sk.search(sk.head, 23));
		System.out.println("Searching for key 8 using recursion ? : "+sk.searchUsingRecursion(sk.head, 8));
	}
 
	private void printNodes(Node head) {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	public boolean search(Node head, int x) {
		Node temp = head;
		while(temp !=null) {
			if(temp.data == x) {
				return true;
			}
			temp = temp.next;
		}
		return false;
		
	}
	
	
	public boolean searchUsingRecursion(Node head, int x) {
		// base case
		if(head == null) {
			return false;
		}
		if(head.data == x){
			return true;
		}
		return searchUsingRecursion(head.next, x);
	}

}
