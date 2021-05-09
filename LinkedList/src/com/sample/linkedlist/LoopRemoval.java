package com.sample.linkedlist;

import java.util.HashSet;

public class LoopRemoval {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public void printNodes(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "|");
			current = current.next;
		}

	}

	public boolean detectAndRemoveLoop(Node head) {
		Node prev = null;
		HashSet<Node> hs = new HashSet<>();
		while (head != null) {
			if (hs.contains(head)) {
				prev.next = null;
				return true;
			} else {
				hs.add(head);
				prev = head;
				head = head.next;
			}

		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopRemoval lr = new LoopRemoval();
		lr.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(4);
		Node fourth = new Node(5);
		lr.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = second;

		if (lr.detectAndRemoveLoop(lr.head)) {
			System.out.println("Loop detected and removed");
			lr.printNodes(lr.head);
		} else {
			System.out.println("No loop detected");
		}

	}

}
