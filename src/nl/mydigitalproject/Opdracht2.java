package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht2 {

    public void sort(int[] invoer) {

        long start = System.currentTimeMillis();
        ThreadStarter bubble1 = new ThreadStarter(invoer, 0, invoer.length/2);
        ThreadStarter bubble2 = new ThreadStarter(invoer, invoer.length/2, invoer.length);
        Thread thread1 = new Thread(bubble1);
        Thread thread2 = new Thread(bubble2);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();

            long elapsedTime = System.currentTimeMillis() - start;
            System.out.println("Voor het mergen " + elapsedTime + "ms");

            SortUtils.merge(invoer);
        }catch (InterruptedException ie){
            System.out.println("It stopped");
        }

        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

        //return finalResult;
    }
}
