import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortsTest {
    @Test
    public void inverteixarray() {

        //he metido un if para las arrays vacias y en el for he te que cambiar la condicion de vez de 0 a la mitad de la longuitud
        //de la array y creado las variables para poder cambiar los elementos de la array

        //caja negra
        //1 Prueba aleatoria
        int[] array = {5,1,12,-5,16};
        int[] r1 = Sorts.inverteixarray(array);
        assertArrayEquals(r1, new int[]{16,-5,12,1,5});
        //2 Casos limite(0-n)
        //2-1 limite vacio
        int[] array1 = {};
        int[] r2 = Sorts.inverteixarray(array1);
        assertArrayEquals(r2,new int[]{});
        //2-2 limite numeros repetidos
        int[] array2 = {


















        };
        int[] r3 = Sorts.inverteixarray(array2);
        assertArrayEquals(r3,new int[]{4,1,5,6,6,5,15});
        //2-3 limite de numero maximo
        int[] array3 = {Integer.MAX_VALUE,3,5};
        int[] r4 = Sorts.inverteixarray(array3);
        assertArrayEquals(r4,new int[]{5,3,Integer.MAX_VALUE});
        //2-4 limite de 1
        int[] array4 = {2};
        int[] r5 = Sorts.inverteixarray(array4);
        assertArrayEquals(r5,new int[]{2});
        //3 caso erroneo
        int[] array5 = {Integer.MAX_VALUE,3,5};
        int[] r6 = Sorts.inverteixarray(array5);
        assertNotEquals(r6,new int[]{2,5,4});

        //caja blanca
        //1 Condicional entra if y no en for
        int[] array6 = {};
        int[] r7 = Sorts.inverteixarray(array6);
        assertArrayEquals(r7,new int[]{});
        //2 entra en el for y no en el if
        int[] array7 = {15,5,6,6,5,1,4};
        int[] r8 = Sorts.inverteixarray(array7);
        assertArrayEquals(r8,new int[]{4,1,5,6,6,5,15});
    }

    @Test
    public void bubbleSort() {

        //cambiar la i por la j en en la linea 36 en array[i]

        //caja negra
        //1 prueba aleatoria
        int[] array = {5,1,12/2,-5,16};
        int[] r = Sorts.bubbleSort(array);
        assertArrayEquals(r,new int[]{-5,1,5,6,16});
        //2 casos limite (0-n)
        //2-1 limite vacio
        int[] array1 = {};

        int[] r1 = Sorts.bubbleSort(array1);
        assertArrayEquals(r1,new int[]{});
        //2-2 limite numeros repetidos
        int[] array2 = {5,1,1,12,-5,16,12};
        int[] r2 = Sorts.bubbleSort(array2);
        assertArrayEquals(r2,new int[]{-5,1,1,5,12,12,16});
        //2-3 limite de 1
        int[] array3 = {2};
        int[] r3 = Sorts.bubbleSort(array3);
        assertArrayEquals(r3,new int[]{2});
        //2-4 limite de numero maximo
        int[] array4 = {Integer.MAX_VALUE,16,3,5,-5};
        int[] r4 = Sorts.bubbleSort(array4);
        assertArrayEquals(r4,new int[]{-5,3,5,16,Integer.MAX_VALUE});
        //3 caso erroneo
        int[] array5 = {(Integer.MAX_VALUE+1),3,5};
        int[] r5 = Sorts.bubbleSort(array5);
        assertNotEquals(r5,new int[]{3,5,(Integer.MAX_VALUE+1)});

        //caja blanca
        //1 Condicional no entra en el if del for
        int[] array6 = {1,2,3,4,5,6};
        int[] r6 = Sorts.bubbleSort(array6);
        assertArrayEquals(r6,new int[]{1,2,3,4,5,6});
        //2 No entra en el primer for ni en el segundo
        int[] array7 = {};
        int[] r7 = Sorts.bubbleSort(array7);
        assertArrayEquals(r7,new int[]{});
        //3 No entra en el segundo for
        int[] array8 = {1};
        int[] r8 = Sorts.bubbleSort(array8);
        assertArrayEquals(r8,new int[]{1});
    }

    @Test
    public void InsertionSort() {
        //Este metodo no me ha dado ningun problema

        //caja negra
        //1 prueba aleatoria
        int[] array = {5,1,12/2,-5,16};
        int[] r = Sorts.InsertionSort(array);
        assertArrayEquals(r,new int[]{-5,1,5,6,16});
        //2 casos limite (0-n)
        //2-1 limite vacio
        int[] array1 = {};
        int[] r1 = Sorts.InsertionSort(array1);
        assertArrayEquals(r1,new int[]{});
        //2-2 limite numeros repetidos
        int[] array2 = {5,1,1,12,-5,16,12};
        int[] r2 = Sorts.InsertionSort(array2);
        assertArrayEquals(r2,new int[]{-5,1,1,5,12,12,16});
        //2-3 limite de 1
        int[] array3 = {2};
        int[] r3 = Sorts.InsertionSort(array3);
        assertArrayEquals(r3,new int[]{2});
        //2-4 limite de numero maximo
        int[] array4 = {Integer.MAX_VALUE,16,3,5,-5};
        int[] r4 = Sorts.InsertionSort(array4);
        assertArrayEquals(r4,new int[]{-5,3,5,16,Integer.MAX_VALUE});
        //3 caso erroneo
        int[] array5 = {(Integer.MAX_VALUE+1),1,5,6};
        int[] r5 = Sorts.InsertionSort(array5);
        assertNotEquals(r5,new int[]{2,5,4,(Integer.MAX_VALUE+1)});

        //caja blanca
        //1 no entra en el while
        int[] array6 = {1,2,3,4,5,6};
        int[] r6 = Sorts.InsertionSort(array6);
        assertArrayEquals(r6,new int[]{1,2,3,4,5,6});
        //2 no entra en los dos for
        int[] array7 = {};
        int[] r7 = Sorts.InsertionSort(array7);
        assertArrayEquals(r7,new int[]{});
    }

    @Test
    public void SelectionSort() {
        //he cambiado el aux para que este dentro del primer for y que sea el index del mas pequeño,
        //tambien he sacado los cambio de posicion de los elementos para que este en el pirmer for y
        //y no dentro del if, creo otra variable para guardar la posicion

        //caja negra
        //1 prueba aleatoria
        int[] array = {5,1,12/2,-5,16,2};
        int[] r = Sorts.SelectionSort(array);
        assertArrayEquals(r,new int[]{-5,1,2,5,6,16});
        //2 casos limite (0-n)
        //2-1 limite vacio
        int[] array1 = {};
        int[] r1 = Sorts.SelectionSort(array1);
        assertArrayEquals(r1,new int[]{});
        //2-2 limite numeros repetidos
        int[] array2 = {5,1,1,12,-5,16,12};
        int[] r2 = Sorts.SelectionSort(array2);
        assertArrayEquals(r2,new int[]{-5,1,1,5,12,12,16});
        //2-3 limite de 1
        int[] array3 = {2};
        int[] r3 = Sorts.SelectionSort(array3);
        assertArrayEquals(r3,new int[]{2});
        //2-4 limite de numero maximo
        int[] array4 = {Integer.MAX_VALUE,16,3,5,-5};
        int[] r4 = Sorts.SelectionSort(array4);
        assertArrayEquals(r4,new int[]{-5,3,5,16,Integer.MAX_VALUE});
        //3 caso erroneo
        int[] array5 = {(Integer.MAX_VALUE+1),1,5,6};
        int[] r5 = Sorts.SelectionSort(array5);
        assertNotEquals(r5,new int[]{2,5,4,(Integer.MAX_VALUE+1)});

        //caja blanca
        //1 no entra en el if
        int[] array6 = {1,2,3,4,5,6};
        int[] r6 = Sorts.SelectionSort(array6);
        assertArrayEquals(r6,new int[]{1,2,3,4,5,6});
        //2 no entra en los 3 for
        int[] array7 = {};
        int[] r7 = Sorts.SelectionSort(array7);
        assertArrayEquals(r7,new int[]{});
    }

}