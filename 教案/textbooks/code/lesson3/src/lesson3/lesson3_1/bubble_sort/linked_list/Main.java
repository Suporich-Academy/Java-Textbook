package lesson3.lesson3_1.bubble_sort.linked_list;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);

		for(int i = 0; i<list.getSize(); i++) {
			System.out.print(list.get(i));
		}

	}

}
