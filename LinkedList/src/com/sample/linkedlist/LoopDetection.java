package com.sample.linkedlist;

import java.util.HashSet;

public class LoopDetection {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public boolean detectLoops(Node head) {
		HashSet<Node> hs = new HashSet<>();
		while (head != null) {
			if (hs.contains(head)) {
				return true;
			}
			System.out.print(head.data+"|");
			hs.add(head);
			head = head.next;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoopDetection ld = new LoopDetection();
		ld.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		ld.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second;
		
		
		
		if(ld.detectLoops(ld.head)) {
			System.out.println();
			System.out.println("Loop detected");
		}else {
			System.out.println("No loop");
		}

	}

	
		
		
	

}
