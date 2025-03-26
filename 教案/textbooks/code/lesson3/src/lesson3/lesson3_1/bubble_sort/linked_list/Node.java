package lesson3.lesson3_1.bubble_sort.linked_list;

public class Node {

	//保持する値
	private int data;
	//次の参照先のアドレス（ポインター）
	private Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		if(this.next != null) {
			return "val"+"("+this.data+")" +"⇒"+"pointer"+"("+next.getData()+")";
		}else {
			return "val"+Integer.valueOf(this.data).toString();
		}

	}

}

