package lesson3.lesson3_1.bubble_sort.linked_list;

public class LinkedList {

	//先頭の要素
	private Node head;
	private int size;
	public LinkedList() {
		this.head = null;
	}


	//要素の追加のメソッド
	public void add(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
		}else {
		  Node current = head;
		  while(current.getNext() != null) {
			  current = current.getNext();
		  }
		  current.setNext(newNode);
		}
		size++;
	}

	public Node get(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException();
		}
		Node current = head;
		for(int i = 0; i<index; i++) {
			 current = current.getNext();
		}
		return current;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public String toString() {
		Node current = head;
		String result = current.toString();
		while (current.getNext() != null) {
//			if(current.getNext() == null) {
//				break;
//			}
			 current = current.getNext();
			 result += current.toString();
		}

		return result;
	}



}
