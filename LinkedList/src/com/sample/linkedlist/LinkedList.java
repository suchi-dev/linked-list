
package com.sample.linkedlist;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	/*
	 * We print the data value and call next Until it reaches null which is the last
	 * node in the linked list
	 */
	public void printNodes(Node head) {
		Node last = head;
		if(head == null) {
			System.out.println("Empty linked list");
		}
		while (last != null) {
			System.out.print(last.data + "|");
			last = last.next;

		}
	}

	/*
	 * We create a linked list with data values as 1, 2,3 1->2->3->null. Calling the
	 * print method passing the head node
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.head = new Node(1);
		Node first = ll.head;
		Node second = new Node(2);
		Node third = new Node(3);
		ll.head.next = second;
		second.next = third;
		third.next = null;
		ll.printNodes(first);
		ll.insertAtBeginning(5);
		System.out.println();
		System.out.println("After inserting 5 at the beginning");
		ll.printNodes(ll.head); // 5->1->2->3
		System.out.println();
		ll.insertAfterNode(second, 4); // 5->1->2->4->3
		System.out.println();
		System.out.println("Inserting 4 after 2");
		ll.printNodes(ll.head);
		ll.addAtEnd(6); // 5->1->2->4->3->6
		System.out.println();
		System.out.println("Adding  6 at the end");
		ll.printNodes(ll.head);
		ll.deleteNode(2); //5->1->4->3->6
		System.out.println();
		System.out.println("Deletion of node 2");
		ll.printNodes(ll.head);
		ll.deleteAtSpecificPosn(1); //5->4->3->6
		System.out.println();
		System.out.println("Deleting node at position 1:");
		ll.printNodes(ll.head);
		System.out.println();
		System.out.println("Deleting the linked list");
		ll.deleteLinkedList();
		ll.printNodes(ll.head);
	}
	

	/*
	 * Inserting a new node at the beginning. new node -> next will be the original
	 * head new node becomes the head
	 */
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	/*
	 * Inserting new node after a given node new node-> next will be given node's
	 * next given node's next will now point to new node.
	 */
	public void insertAfterNode(Node node, int data) {
		if (node == null) {
			System.out.println("Prev node is null, so cannot insert");

		} else {

			Node newNode = new Node(data);
			newNode.next = node.next;
			node.next = newNode;
		}
	}

	/*
	 * Inserting a new node at the end We traverse till we find the last node. The
	 * last node is the node whose next is null. We store it in temp temp node's
	 * next will be the new node and new node will now point to null
	 */
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
		}
		Node last = head;
		Node temp = null;
		while (last != null) {
			temp = last;
			last = last.next;
		}
		newNode.next = null;
		temp.next = newNode;
	}

	/*
	 * Deletion of a node with a specific key if the key value matches the head data
	 * then head is set to head's next else we traverse till we find the node whose
	 * data matches the key or it is null. if it is null, there is no node with the
	 * given key in the linked list else we set the prev node's next to matched
	 * node's next
	 * 
	 * 
	 */

	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		if (head != null && head.data == key) {
			head = temp.next;
		}

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Node with the given key : " + key + " not found");
			return;
		}

		prev.next = temp.next;

	}
	
	/*Deletion of a node at a given position
	 * 
	 */
	
	public void deleteAtSpecificPosn(int posn) {
		if(head == null) {
			return;
		}
		
		Node temp = head;
		Node prev = head;
		
		if(posn == 0) {
			head = temp.next;
		}
		// to find the prev node
		for(int i =0; prev!= null && i < posn-1;i++ ) {
			prev = prev.next;
			
		}
		// posn is greater than the number of nodes present
		if(prev == null || prev.next == null) {
			return;
		}
		
		Node next = prev.next.next;
		prev.next = next;
		
	}
	
	/*
	 * Delete the entire linked list
	 * we need to set the head as null
	 * 
	 */
	public void deleteLinkedList() {
		head = null;
	}

}
