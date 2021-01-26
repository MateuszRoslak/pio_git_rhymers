package edu.kis.vh.nursery;

import edu.kis.vh.nursery.data_structures.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer(IntArrayStack stack, int totalRejected) {
		super(stack);
		this.totalRejected = totalRejected;
	}

	public HanoiRhymer(int totalRejected) {
		this.totalRejected = totalRejected;
	}

	public HanoiRhymer() {

	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
