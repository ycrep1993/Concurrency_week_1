package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class ThreadStarter implements Runnable {

    public ThreadStarter(int[] invoer, int start, int end) {
        SortUtils.bubbleSort(invoer);
    }

    @Override
    public void run() {

    }
}
