package edu.kis.vh.nursery.data_structures;

public class IntArrayStack implements StackInterface {
    private static final int MAX_SIZE = 12;
    private final int[] numbers = new int[MAX_SIZE];
    private int total = EMPTY_RHYMER_INDICATOR;

    /*
     * 	Total variable getter
     * */

    @Override
    public int getTotal() {
        return total;
    }

    /*
     * 	Count numbers method
     * */

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /*
     * 	Check if rhymer is empty
     * */

    @Override
    public boolean isEmpty() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /*
     * 	Check if rhymer is full
     * */

    @Override
    public boolean isFull() {
        return total == 11;
    }

    /*
     * 	If rhymer is empty return empty indicator, else return array of numbers
     * */

    public int top() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    /*
     * 	If rhymer is empty return empty indicator, else return array of numbers
     * */

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }
}
