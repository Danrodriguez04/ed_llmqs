public class Sorts {


    public static int[] inverteix(int[] nombres) {
        int [] nombresInvertits = nombres;
        System.out.println("5 1 12 -5 16");
        System.out.println("Array invertida");
        //Imprimeix l'array amb els numeros invertits
        for (int i = nombresInvertits.length - 1; i >= 0; i--)
            System.out.print(nombresInvertits[i] + " ");
        return nombresInvertits;
    }

    public static int[] bubbleSort(int[] nombres) {
        int[] numOrdenats = nombres;

        System.out.println("Bubble Sort");
        
        System.out.print("5 1 12 -5 16");

        for (int i = numOrdenats.length - 1; i > 0; i--) {
            int aux;

            for (int j = 0; j < i; j++) {
                if (numOrdenats[j] > numOrdenats[j + 1]) {
                    aux = numOrdenats[j];
                    numOrdenats[i] = numOrdenats[j + 1];
                    numOrdenats[j + 1] = aux;
                }
            }
        }
        System.out.println("\n After Sorting...");
        for (int i : numOrdenats) {
            System.out.print(i + " ");
        }
        return numOrdenats;
    }

    public static int[] insertionSort(int[] nombres) {
        int[] resultat = nombres;

        System.out.println("Insertion Sort");
        System.out.print("5 2 4 6 1 3");

        for (int i = 0; i < resultat.length; i++) {
            int valueToInsert = resultat[i];
            int position = i;

            while (position > 0 && resultat[position - 1] > valueToInsert) {
                resultat[position] = resultat[position - 1];
                position = position - 1;
            }
            resultat[position] = valueToInsert;
        }
        System.out.println("\n After Sorting...");
        for (int i : resultat) {
            System.out.print(i + " ");
        }
        return resultat;
    }

    public static int[] selectionSort(int[] arr) {
        int[] array = arr;

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
