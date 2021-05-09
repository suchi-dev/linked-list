package com.sample.linkedlist;

public class CountFrequency {
	Node head;
	static class Node {
		int data;
		Node next;
		
		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	
	public int countFreq(int searchElt) {
		int count = 0;
		Node temp = head;
		
		while(temp != null) {
			if(temp.data == searchElt) {
				count ++;
			}
			temp = temp.next;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountFrequency cf = new CountFrequency();
		cf.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		Node third = new Node(1);
		Node fourth = new Node(4);
		Node fifth = new Node(1);
		cf.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		cf.printNodes(cf.head);
		System.out.println();
		System.out.println("The frequency of 1 in linked list is : "+cf.countFreq(1));
	
		
		
		
	}
	private void printNodes(Node head) {
		// TODO Auto-generated method stub
		Node last = head;
		while(last != null) {
			System.out.print(last.data+"|");
			last = last.next;
		}
		
	}

}
