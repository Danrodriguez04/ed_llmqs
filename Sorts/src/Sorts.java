//package com.company;


public class Sorts {

    public static int[] inverteixarray (int [] arr) {

        int[] array = arr;
        int tmp= 0;
        int index = 0;

        System.out.println("5 1 12 -5 16");
        System.out.println("Array invertida");




        //Imprimeix l'array amb els numeros invertits
        for (int i = array.length - 1; i >= array.length/2; i--){
            tmp = array[i];
            array[i] = array[index] ;
            array[index] = tmp;
            index++;

        }
            //System.out.print(array[i] + " ");
        return array;
    }

    public static int[] bubbleSort(int [] arr) {
        int[] array = arr;


        //System.out.println("Bubble Sort");
        //System.out.print("5 1 12 -5 16");

        for (int i = array.length - 1; i > 0; i--) {
            int aux;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = aux;
                }
            }
        }
        //System.out.println("\n After Sorting...");
        for (int i : array) {
            System.out.print(i + " ");
        }
        return array;
    }

    public static int[] InsertionSort (int [] arr) {
        int[] array = arr;


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

    public static int[] SelectionSort (int [] arr) {
        int[] array = arr;

        System.out.println("Selection Sort");
        System.out.print("5 1 12 -5 16 2 12 14");

        for (int i = array.length - 1; i > 0; i--) {
            int aux=0;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = aux;
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