package com.stackqueue.linkedlist;

public class StackQueue {
	static LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addFirst(data);
	}

	public void showElements() {
		list.display();
	}
}
