package nl.mydigitalproject;

/**
 * Created by Ruben on 9/8/2016.
 */
public class Opdracht1 {

    public void sort(int[] array1, int[] array2, int[] array3, int[] array4, int[] array5, int[] array6) {
        System.out.println("Array 1 wordt gesorteerd");
        long start = System.currentTimeMillis();
        SortUtils.bubbleSort(array1);
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        SortUtils.isSorted(array1);

        System.out.println("Array 2 wordt gesorteerd");
        start = System.currentTimeMillis();
        SortUtils.bubbleSort(array2);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        SortUtils.isSorted(array2);

        System.out.println("Array 3 wordt gesorteerd");
        start = System.currentTimeMillis();
        SortUtils.bubbleSort(array3);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        SortUtils.isSorted(array3);

        System.out.println("Array 4 wordt gesorteerd");
        start = System.currentTimeMillis();
        SortUtils.bubbleSort(array4);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        SortUtils.isSorted(array4);

        System.out.println("Array 5 wordt gesorteerd");
        start = System.currentTimeMillis();
        SortUtils.bubbleSort(array5);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        SortUtils.isSorted(array5);

        System.out.println("Array 6 wordt gesorteerd");
        start = System.currentTimeMillis();
        SortUtils.bubbleSort(array6);
        elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        SortUtils.isSorted(array6);
    }

    public void sort(int[] array1){
        System.out.println("Array 1 wordt gesorteerd");
        long start = System.currentTimeMillis();
        SortUtils.bubbleSort(array1);
        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Het sorteren duurde " + elapsedTime + "ms");
        SortUtils.isSorted(array1);
    }
}
