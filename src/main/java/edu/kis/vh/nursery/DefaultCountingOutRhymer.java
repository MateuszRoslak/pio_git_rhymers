package edu.kis.vh.nursery;

/*
*	Default Rhymer class
* */

import edu.kis.vh.nursery.data_structures.IntArrayStack;

public class DefaultCountingOutRhymer {

	IntArrayStack stack;

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		this.stack = new IntArrayStack();
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}
}
