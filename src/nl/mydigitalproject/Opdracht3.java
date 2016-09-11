package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht3 {

    public void opdracht3(int[] invoer) {
        long startTime = System.currentTimeMillis();
        int start = 0;
        int end = invoer.length - 1;
        RecursiveThreadStarter recursiveThreadStarter1 = new RecursiveThreadStarter(invoer, start, ((end / 2) + (start / 2)));
        RecursiveThreadStarter recursiveThreadStarter2 = new RecursiveThreadStarter(invoer, ((end / 2) + (start / 2)) + 1, end);
        Thread thread1 = new Thread(recursiveThreadStarter1);
        Thread thread2 = new Thread(recursiveThreadStarter2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
            invoer = SortUtils.merge(invoer);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        assert SortUtils.isSorted(invoer) : "Array is niet gesorteerd";
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
    }
}
