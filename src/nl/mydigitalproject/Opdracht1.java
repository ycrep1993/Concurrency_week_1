package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht1 {

    public void sort(int[] array1, int[] array2, int[] array3, int[] array4, int[] array5, int[] array6) {
        System.out.println("Array 1 wordt gesorteerd");
        long start = System.currentTimeMillis();
        bubbleSort(array1);
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        isSorted(array1);

        System.out.println("Array 2 wordt gesorteerd");
        start = System.currentTimeMillis();
        bubbleSort(array2);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

        System.out.println("Array 3 wordt gesorteerd");
        start = System.currentTimeMillis();
        bubbleSort(array3);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

        System.out.println("Array 4 wordt gesorteerd");
        start = System.currentTimeMillis();
        bubbleSort(array4);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

        System.out.println("Array 5 wordt gesorteerd");
        start = System.currentTimeMillis();
        bubbleSort(array5);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

        System.out.println("Array 6 wordt gesorteerd");
        start = System.currentTimeMillis();
        bubbleSort(array6);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");

    }

    public void isSorted(int[] arr) {
        int last = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < last) {
                System.out.println("Something went wrong with the sorting!");
            }
        }
        System.out.println("Sorting successful!!");
    }

    private int[] bubbleSort(int[] invoer) {
        int i, j, tijdelijk;
        for (j = 0; j < invoer.length; j++) {
            for (i = 1; i < invoer.length - j; i++) {
                if (invoer[i-1] > invoer[i]) {
                    tijdelijk = invoer[i];
                    invoer[i] = invoer[i-1];
                    invoer[i-1] = tijdelijk;
                }
            }
        }
        return invoer;
    }
}
