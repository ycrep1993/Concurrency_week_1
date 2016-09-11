package nl.mydigitalproject;

/**
 * Created by Ruben on 9/10/2016.
 */
public class RecursiveThreadStarter implements Runnable {

    private int[] invoer;
    private int start;
    private int end;

    public RecursiveThreadStarter(int[] invoer, int start, int end) {
        this.invoer = invoer;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        if (end - start > 5000) {
            RecursiveThreadStarter recursiveThreadStarter1 = new RecursiveThreadStarter(invoer, start, ((end / 2) + (start / 2)));
            RecursiveThreadStarter recursiveThreadStarter2 = new RecursiveThreadStarter(invoer, ((end / 2) + (start / 2)) + 1, end);
            Thread thread1 = new Thread(recursiveThreadStarter1);
            Thread thread2 = new Thread(recursiveThreadStarter2);
            thread1.start();
            thread2.start();
            try {
                thread1.join();
                thread2.join();
                SortUtils.merge(invoer, start, end);
                assert SortUtils.isSorted(invoer, start, end) : "Invoer is niet gesorteerd";
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        } else {
            SortUtils.bubbleSort(invoer, start, end);
            assert SortUtils.isSorted(invoer, start, end) : "Bubblesort Failed";
        }
    }
}
