package list.runner;

import list.doublyLinkedList.DoublyLinkedList;

public class DoublyLinkedListRunner {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addFirst(50).addFirst(68).addFirst(29).addFirst(23).addLast(99);
		dll.print();
		dll.reversePrint();
	}
}