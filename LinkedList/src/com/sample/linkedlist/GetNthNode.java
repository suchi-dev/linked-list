package com.sample.linkedlist;

public class GetNthNode {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;

		}
	}

	public void printNodes(Node current) {
		Node last = current;
		while (last != null) {
			System.out.print(last.data + "|");
			last = last.next;
		}

	}

	public int getNthElement(int index) {
		Node current = head;
		int count = 0;
		while (current != null) {
			if (count == index) {
				return current.data;
			}
			count++;
			current = current.next;
		}
		return -1;
	}

	public static void main(String[] args) {
		GetNthNode gn = new GetNthNode();
		gn.head = new Node(20);
		Node second = new Node(25);
		Node third = new Node(45);
		Node fourth = new Node(40);
		Node fifth = new Node(15);
		gn.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth; // 20--> 25-->45-->40-->15
		gn.printNodes(gn.head);
		int result = gn.getNthElement(3);
		System.out.println();
		System.out.println("The element at 3rd posn:  " + result);
		System.out.println("The element at 6th posn:  " + gn.getNthElement(6));
	}

}
