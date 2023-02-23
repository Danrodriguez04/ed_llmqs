package com.company;


public class Sorts {

    public static int[] inverteixarray() {
        int[] array = {5, 1, 12, -5, 16};
        System.out.println("5 1 12 -5 16");
        System.out.println("Array invertida");
        //Imprimeix l'array amb els numeros invertits
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        return array;
    }

    public static int[] bubbleSort() {
        int[] array = {5, 1, 12, -5, 16};


        System.out.println("Bubble Sort");
        System.out.print("5 1 12 -5 16");

        for (int i = array.length - 1; i > 0; i--) {
            int aux;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[i] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        System.out.println("\n After Sorting...");
        for (int i : array) {
            System.out.print(i + " ");
        }
        return array;
    }

    public static int[] InsertionSort () {
        int[] array = {5, 2, 4, 6, 1, 3};


        System.out.println("Insertion Sort");
        System.out.print("5 2 4 6 1 3");

        for (int i = 0; i < array.length; i++) {
            int valueToInsert = array[i];
            int position = i;

            while ( position > 0 && array[position - 1] > valueToInsert ) {
                array[position] = array[position - 1];
                position = position - 1;
            }
            array[position] = valueToInsert;
        }
        System.out.println("\n After Sorting...");
        for (int i : array) {
            System.out.print(i + " ");
        }
        return array;
    }

    public static int[] SelectionSort () {
        int[] array = {5, 1, 12, -5, 16, 2, 12, 14};


        System.out.println("Selection Sort");
        System.out.print("5 1 12 -5 16 2 12 14");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int aux;

                if (array[i] > array[i]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;

                }
            }
        }
        System.out.println("\n After Sorting...");
        for (int i : array) {
            System.out.print(i + " ");
        }
        return array;
    }

}