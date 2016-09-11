package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class ThreadStarter implements Runnable {

    private int[] invoer;
    private int start;
    private int end;

    public ThreadStarter(int[] invoer, int start, int end) {
        this.invoer = invoer; // reference to original array
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        // start the bubblesort
        SortUtils.bubbleSort(invoer, start, end);
    }
}
