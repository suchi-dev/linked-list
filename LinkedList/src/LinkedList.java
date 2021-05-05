
public class LinkedList {
	;

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
		ll.insertAfterNode(second, 4); //5->1->2->4->3
		System.out.println();
		System.out.println("Inserting 4 after 2");
		ll.printNodes(ll.head);
		ll.addAtEnd(6); // 5->1->2->4->3->6
		System.out.println();
		System.out.println("Adding  6 at the end");
		ll.printNodes(ll.head);
		
		

	}

	/*
	 * Inserting a new node at the beginning.
	 * new node -> next will be the original head
	 *  new node becomes the head
	 */
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	/*
	 * Inserting new node after a given node
	 * new node-> next will be given node's next
	 * given node's next will now point to new node.
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
	 * Inserting a new node at the end
	 * We traverse till we find the last node. The last node is the
	 * node whose next is null. We store it in temp
	 * temp node's next will be the new node
	 * and new node will now point to null
	 */
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head =  newNode;
		}
		Node last = head;
		Node temp = null;
		while(last != null) {
			temp = last;
			last = last.next;
		}
		newNode.next = null;
		temp.next = newNode;
	}

}
