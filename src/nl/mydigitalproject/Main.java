package nl.mydigitalproject;

import java.util.Random;

public class Main {

    //Arrays to be sorted
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private int[] array4;
    private int[] array5;
    private int[] array6;


    public static void main(String[] args) {
	    new Main().run();
    }

    private void run(){
        //init arrays
        array1 = new int[25000];
        array2 = new int[50000];
        array3 = new int[100000];
        array4 = new int[200000];
        array5 = new int[400000];
        array6 = new int[800000];

        //fill arrays

        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }

        System.out.println("filled array 1");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt();
        }

        System.out.println("filled array 2");

        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt();
        }

        System.out.println("filled array 3");

        for (int i = 0; i < array4.length; i++) {
            array4[i] = random.nextInt();
        }

        System.out.println("filled array 4");

        for (int i = 0; i < array5.length; i++) {
            array5[i] = random.nextInt();
        }

        System.out.println("filled array 5");

        for (int i = 0; i < array6.length; i++) {
            array6[i] = random.nextInt();
        }

        System.out.println("filled array 6");


        Opdracht1 opdracht1 = new Opdracht1();
        opdracht1.sort(array1, array2, array3, array4, array5, array6);
    }

}
