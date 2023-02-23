import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Testsort {

    @Test
    public void inverteixarray() {
        //He agregado dentro del for la variables necesarias para cambiar los elementos
        //CAJA BLANCA

        //FOR entra 0 veces

        int[] vacia = {};
        int[] r0 = Sorts.inverteixarray(vacia);
        assertArrayEquals(r0, new int[]{});


        // CAJA NEGRA

        //1.caso aleatorio

        int[] matriz = {5, 1, 12, -5, 16};
        int[] r1 = Sorts.inverteixarray(matriz);
        assertArrayEquals(r1, new int[]{16, -5, 12, 1, 5});

        //2. Caso limite
        int[] array = {};
        int[] r2 = Sorts.inverteixarray(array);
        assertArrayEquals(r2, new int[]{});

        //3.Caso erroneo
        int[] array1 = {Integer.MAX_VALUE, 8, 4, 7, 9};
        int[] r3 = Sorts.inverteixarray(array1);
        assertNotEquals(r3, new int[]{2, 4, 5, 7, 9});


        //4. caso limite con un solo numero

        int[] array2 = {8};
        int[] r4 = Sorts.inverteixarray(array2);
        assertArrayEquals(r4, new int[]{8});

    }

    @Test
    public void bubbleSort() {
        //Es necesario cambiar la i por una j en la linea 45

        //CAJA NEGRA

        //Caso aleatorio

        int[] array = {5, 1, 12, -5, 16};
        int[] r1 = Sorts.bubbleSort(array);
        assertArrayEquals(r1, new int[]{-5, 1, 5, 12, 16});

        //2. caso limite
        int[] array1 = {};
        int[] r2 = Sorts.bubbleSort(array1);
        assertArrayEquals(r2, new int[]{});

        //3. numeros repetidos
        int[] array2 = {5, 5, 5, 3, 1, 2, 1};
        int[] r3 = Sorts.bubbleSort(array2);
        assertArrayEquals(r3, new int[]{1, 1, 2, 3, 5, 5, 5});

        //4. Caso erroneo
        int[] array3 = {(Integer.MAX_VALUE + 1), 8, 5, 4, 7};
        int[] r4 = Sorts.bubbleSort(array3);
        assertNotEquals(r4, new int[]{4, 5, 7, 8, (Integer.MAX_VALUE + 1)});


        //CAJA BLANCA

        //No entra en ningun for
        int[] array4 = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Sorts.bubbleSort(array4));

        //no entra en los dos primeros for
        int[] array5 = {6};
        int[] r5 = Sorts.bubbleSort(array5);
        assertArrayEquals(r5, new int[]{6});


    }

    @Test
    public void InsertionSort() {
        //No he tenido ningun inconveniente en este problema

        //CAJA NEGRA

        //1. Caso aleatorio
        int [] array = {5,2,4,6,1,3};
        int [] r1 = Sorts.InsertionSort(array);
        assertArrayEquals(r1, new int[] {1,2,3,4,5,6});

        //2. caso limite
        int[] array1 = {};
        int[] r2 = Sorts.InsertionSort(array1);
        assertArrayEquals(r2, new int[]{});

        //3. un solo numero
        int[] array2 = {6};
        int[] r3 = Sorts.InsertionSort(array2);
        assertArrayEquals(r3, new int[]{6});

        //4. Caso erroneo
        int[] array3 = {5,Integer.MAX_VALUE+1,2,4,5};
        int[] r4 = Sorts.InsertionSort(array3);
        assertNotEquals(r4, new int[]{5,2,4,5,Integer.MAX_VALUE+1});

        //5. caso limite
        int[] array4 = {Integer.MAX_VALUE,3,4,5};
        int[] r5 = Sorts.InsertionSort(array4);
        assertArrayEquals(r5, new int[]{3,4,5,Integer.MAX_VALUE});

        //CAJA BLANCA
        //2. no entra en los dos for
        int[] array5 = {};
        int[] r6 = Sorts.InsertionSort(array5);
        assertArrayEquals(r6, new int[]{});

    }

    @Test
    public void SelectionSort () {

        //Este ejercicio no lo he entendido muy bien, pero he hecho algunos cambios

        //2. caso aleatorio
        int[] array = {5, 1, 12, -5, 16, 2, 12, 14};
        int[] r1 = Sorts.SelectionSort(array);
        assertArrayEquals(r1, new int[]{-5,1,2,5,12,12,14,16});

        //2. caso limite
        int[] array1 = {};
        int[] r2 = Sorts.SelectionSort(array1);
        assertArrayEquals(r2, new int[]{});

        //3. numeros repetidos
        int[] array2 = {5, 5, 5, 3, 1, 2, 1};
        int[] r3 = Sorts.SelectionSort(array2);
        assertArrayEquals(r3, new int[]{1, 1, 2, 3, 5, 5, 5});

        //4. Caso erroneo
        int[] array3 = {(Integer.MAX_VALUE + 1), 8, 5, 4, 7};
        int[] r4 = Sorts.SelectionSort(array3);
        assertNotEquals(r4, new int[]{4, 5, 7, 8, (Integer.MAX_VALUE + 1)});


        //CAJA BLANCA

        //No entra en ningun for
        int[] array4 = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Sorts.SelectionSort(array4));

        //no entra en los dos primeros for
        int[] array5 = {6};
        int[] r5 = Sorts.SelectionSort(array5);
        assertArrayEquals(r5, new int[]{6});

}

}
