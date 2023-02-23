public class Main {
    public static void main(String[] args) {


    }
   /*ublic static int [] erastotenes (int numero){
        if (numero<1){
            return new int[]{};
        }
        return;
    }*/

    public static int [] descomposicionFactorial (int numero) {
        int [] x= {2,2,3,5};
        return x;
    }
    public static int [][] matrizMultiplicable (int [] [] A, int [][] B){
        int [] [] R;

        int columnes_A = A[0].length;
        int files_A = A.length;
        int columnes_B = B[0].length;
        int files_B = B.length;

        if (columnes_A != files_B){
            System.out.println("Les matrius NO son multipicables");
            return null;
        }
        R =  new int[files_A][columnes_B];

        for (int fila=0 ; fila < files_A ; fila++){
            for (int col = 0 ; col < columnes_B; col ++){

                for (int k = 0 ; k < columnes_A; k++){
                    R[fila] [col] += A[fila][k] * B [k][col];
                }
            }
        }
        return R;
    }



}