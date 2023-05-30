package linkedList;

public class LinkedList {
	private Node head;
	private Node tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void addLast(int data) {
		Node newNode = new Node(data);

		if (tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void remove(int data) {
		if (head == null) {
			return;
		}

		if (head.getData() == data) {
			head = head.getNext();
			if (head == null) {
				tail = null;
			}
			return;
		}

		Node prev = null;
		Node current = head;

		while (current != null && current.getData() != data) {
			prev = current;
			current = current.getNext();
		}

		if (current == null) {
			return;
		}

		prev.setNext(current.getNext());
		if (current == tail) {
			tail = prev;
		}
	}

	public void print() {
		Node current = head;

		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
		System.out.println();
	}
}
