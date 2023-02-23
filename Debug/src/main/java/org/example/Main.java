package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        int[] lista = {2,3,4,6,2,4,200,40,5};

        for (int i = 0; i < lista.length; i++) {
            if (i % 2 == 0) {
                i++;
            }
            for (int j = i; j < lista.length; j++) {
                System.out.println("i: " + i + "j: " + j + "nota" + lista[lista[i]] * lista[j]);
            }
        }
    }
}

      /*  for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}*/