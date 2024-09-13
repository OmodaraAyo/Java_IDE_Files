package practice;

public class EAOCounter {
    private int even = 0;
    private int odd = 0;
    int [] newArray = new int[2];

    public void getAndOddCounter(int[] userInput) {
        for (int i = 0; i < userInput.length; i++) {
            if (userInput [i] % 2 == 0) newArray[0] = ++even;
            else newArray[1] = ++odd;
        }
    }
    public int [] getCount() {
        return newArray;
    }
}
