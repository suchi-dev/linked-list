package com.sample.linkedlist;

public class CountingNodes {

	Node head;
	static 	class Node {
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	
	public static void main(String [] args) {
		CountingNodes cn = new CountingNodes();
		cn.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		cn.head.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;
		fifth.next = sixth;
		cn.printNodes(cn.head);
		System.out.println();
		System.out.println("Counting nodes : "+cn.count());
		System.out.println("Counting using recursion :" +cn.countRecursively(cn.head));
		
		
		
	}
	
	private void printNodes(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		
	}

	public int count() {
		int counter = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			counter++;
		}
		return counter;
		
		
	}
	
	public int countRecursively(Node temp) {
		if(temp == null) {
			return 0;
		}
		return 1 + countRecursively(temp.next);
		
		
		
	}

}
