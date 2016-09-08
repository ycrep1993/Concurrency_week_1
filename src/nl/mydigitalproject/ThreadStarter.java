package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class ThreadStarter implements Runnable {

    private int[] invoer;

    public ThreadStarter(int[] invoer, int start, int end) {
        this.invoer = invoer;
    }

    @Override
    public void run() {
        SortUtils.bubbleSort(invoer);
    }
}
