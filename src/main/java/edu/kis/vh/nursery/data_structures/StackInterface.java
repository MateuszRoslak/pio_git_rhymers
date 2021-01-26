package edu.kis.vh.nursery.data_structures;

public interface StackInterface {
    int EMPTY_RHYMER_INDICATOR = 0;

    int getTotal();

    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int pop();
}
