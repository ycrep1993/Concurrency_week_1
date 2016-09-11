package nl.mydigitalproject;

/**
 * Created by Ruben on 9/10/2016.
 */
public class RecursiveThreadStarter implements Runnable {

    private int[] invoer;
    private int start;
    private int end;

    public RecursiveThreadStarter(int[] invoer, int start, int end) {
        this.invoer = invoer; // reference to the original array
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        // if the numbers that this thread has to take care of is more than 5000, start new threads, else bubblesort
        if (end - start > 500) {
            // split arrays in half and start new threads with those splitted arrays
            RecursiveThreadStarter recursiveThreadStarter1 = new RecursiveThreadStarter(invoer, start, ((end / 2) + (start / 2)));
            RecursiveThreadStarter recursiveThreadStarter2 = new RecursiveThreadStarter(invoer, ((end / 2) + (start / 2)) + 1, end);
            Thread thread1 = new Thread(recursiveThreadStarter1);
            Thread thread2 = new Thread(recursiveThreadStarter2);

            thread1.start();
            thread2.start();

            try {
                // wait for both threads to finish their tasks
                thread1.join();
                thread2.join();
                // after the 2 halves have been merged OR bubblesorted, merge the 2 halves together
                SortUtils.merge(invoer, start, end);
                // check if the numbers are really sorted
                assert SortUtils.isSorted(invoer, start, end) : "Invoer is niet gesorteerd";
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        } else {
            // bubblesort a part of the array (from 'start' to 'end')
            SortUtils.bubbleSort(invoer, start, end);
            // check if the bubblesort worked
            assert SortUtils.isSorted(invoer, start, end) : "Bubblesort Failed";
        }
    }
}
