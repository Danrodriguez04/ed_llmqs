import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DescomposicionFactorial {
    //@Test
    /*public void erastotenes () {
        //1- prova aleatoria
        int [] r1= Main.erastotenes(20);
        assertArrayEquals(r1, new int[] {2,2,3,5});

        int [] r2= Main.erastotenes(21);
        assertArrayEquals(r2, new int[] {2,3,3,5});
        //2- casos limit (1- 1000)

        int [] r3 = Main.erastotenes (1);
        assertArrayEquals(r3,new int[]{});

        int [] r4 = Main.erastotenes (1000);
        assertArrayEquals(r4,new int[]{1,2,3,5,7,11,13,15,17,19,21,23});

        //3 - casos erronis

        int [] r5 = Main.erastotenes (0);
        assertArrayEquals(r5,new int[]{});

        int [] r6 = Main.erastotenes (-3);
        assertArrayEquals(r6, null);

        int [] r7 = Main.erastotenes (1001);
        assertArrayEquals(r7, null);

        int [] r8 = Main.erastotenes (2387);
        assertArrayEquals(r8, null);
    }

    @Test
    public  void descomposicionfactorial () {
        int[] r1 = Main.descomposicionFactorial(2);
        assertArrayEquals(r1, new int[]{2});

        //int[] r2= Main.descomposicionFactorial(Integer.MAX_VALUE);
        //assertArrayEquals(r2, null);   "no se puede hacer"

        int[] r3 = Main.erastotenes(1);
        assertArrayEquals(r3, new int[]{});

        int[] r4 = Main.erastotenes(0);
        assertArrayEquals(r4, null);

        int[] r5 = Main.erastotenes(-3);
        assertArrayEquals(r5, null);
    }*/


        @Test
        public void matrizMultiplicable (){
            int [] [] A= {
                    {0,1},
                    {2,1},
                    {0,2}
            };
            int [] [] B = {
                    {0,1,0,1},
                    {1,1,2,2}
            };
            int [] [] R = {
                    {1,1,2,2},
                    {1,3,2,4},
                    {2,2,4,4}
            };

            int [] [] C= {};

            //Condicional no entra
            //assertArrayEquals(Main.matrizMultiplicable(A,B),R);
            //Condicional si entra
           // assertArrayEquals(Main.matrizMultiplicable(B,A),null);
            //FOR entra 0 veces
            assertThrows(ArrayIndexOutOfBoundsException.class,()->Main.matrizMultiplicable(C,C));

        }






    }

    //Hacer ejericio 3
    //Rango "" (nadaa)


