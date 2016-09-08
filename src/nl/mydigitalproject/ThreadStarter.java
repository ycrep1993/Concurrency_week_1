package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class ThreadStarter implements Runnable {

    private int[] invoer;
    private int start;
    private int end;

    public ThreadStarter(int[] invoer, int start, int end) {
        this.invoer = invoer;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        SortUtils.bubbleSort(invoer, start, end);
    }
}
