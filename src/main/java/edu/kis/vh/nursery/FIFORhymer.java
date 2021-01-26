package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structures.IntArrayStack;
import edu.kis.vh.nursery.data_structures.StackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

	final private StackInterface temp = new IntArrayStack();

	public FIFORhymer(IntArrayStack stack) {
		super(stack);
	}

	public FIFORhymer() {

	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}
