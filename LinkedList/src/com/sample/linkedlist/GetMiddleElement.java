package com.sample.linkedlist;

public class GetMiddleElement {
	
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public int getMiddleElement() {
		Node temp = head;
		int count = 0;
		int mid = 0;
		while(temp != null) {
			count ++;
			temp = temp.next;
		}
		if(count %2==1) {
			mid = (count / 2) +1;
		}else {
			mid = count / 2;
		}
		
		Node current = head;
		for(int i =0; i < mid-1; i ++) {
			current = current.next;
		}
		return current.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMiddleElement gme = new GetMiddleElement();
		gme.head = new Node(10);
		Node first = new Node(3);
		Node second = new Node(5);
		Node third = new Node(8);
		Node fourth = new Node(12);
		Node fifth = new Node(15);
		Node sixth = new Node(7);
		gme.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		printNodes(gme.head);
		System.out.println();
		System.out.println("The middle element is "+gme.getMiddleElement());
		
		
	}

	private static void printNodes(Node head) {
		// TODO Auto-generated method stub
		Node last = head;
		while(last !=null) {
			System.out.print(last.data +"|");
			last = last.next;
		}
		
	}

}
