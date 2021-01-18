package edu.kis.vh.nursery;

/*
*	Default Rhymer class
* */

public class DefaultCountingOutRhymer {

	private static final int MAX_SIZE = 12;
	private static final int EMPTY_RHYMER_INDICATOR = -1;
	private final int[] numbers = new int[MAX_SIZE];
	private int total = EMPTY_RHYMER_INDICATOR;

	/*
	* 	Total variable getter
	* */

	public int getTotal() {
		return total;
	}

	/*
	* 	Count numbers method
	* */

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/*
	* 	Check if rhymer is empty
	* */

	public boolean callCheck() {
		return total == EMPTY_RHYMER_INDICATOR;
	}

	/*
	* 	Check if rhymer is full
	* */

	public boolean isFull() {
		return total == 11;
	}

	/*
	* 	If rhymer is empty return empty indicator, else return array of numbers
	* */

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_RHYMER_INDICATOR;
		return numbers[total];
	}

	/*
	* 	If rhymer is empty return empty indicator, else return array of numbers
	* */

	public int countOut() {
		if (callCheck())
			return EMPTY_RHYMER_INDICATOR;
		return numbers[total--];
	}
}
