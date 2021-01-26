package edu.kis.vh.nursery.data_structures;

public class IntLinkedList {

	private Node last;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return StackInterface.EMPTY_RHYMER_INDICATOR;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return StackInterface.EMPTY_RHYMER_INDICATOR;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
