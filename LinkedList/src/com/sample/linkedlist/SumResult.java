package com.sample.linkedlist;

public class SumResult {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public Node sumOfLinkedList(Node first, Node second) {

		Node temp = null;
		Node res = null;
		Node prev = null;
		int sum = 0;
		int carry = 0;
		int i = 1;
		int j = 1;

		while (first != null || second != null) {

			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			temp = new Node(sum);
			if (res == null) {
				res = temp;
			} else {
				prev.next = temp;
			}
			prev = temp;

			if (first != null) {
				first = first.next;
			}

			if (second != null) {
				second = second.next;
			}

		}
		if (carry > 0) {
			temp.next = new Node(carry);
		}

		return res;
	}

	public void printNodes(Node head) {
		Node last = head;
		while (last != null) {
			System.out.print(last.data + "|");
			last = last.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumResult sr = new SumResult();
		Node first = new Node(7);
		Node second = new Node(5);
		Node third = new Node(9);
		Node fourth = new Node(4);
		Node fifth = new Node(6);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = null;
		System.out.println("Linked list 1");
		sr.printNodes(first);

		Node sixth = new Node(8);
		Node seventh = new Node(4);

		sixth.next = seventh;
		seventh.next = null;
		System.out.println();
		System.out.println("Linked list 2");
		sr.printNodes(sixth);

		System.out.println();
		Node sum = sr.sumOfLinkedList(first, sixth);
		System.out.println("Resultant linked list");
		sr.printNodes(sum);

	}

}
