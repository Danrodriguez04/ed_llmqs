import java.util.Scanner;

/*public class CalculadoraOld {

    public static void mainOld(String[] args) {
        System.out.println("Hello world!");

        demanarOperacio();
        int resultat = operar(operadorsGeneral1[0], operadorsGeneral1[1], operacioMatematicaGeneral);
        System.out.println("El resultat de " +
                operadorsGeneral1[0]+ " " +
                operacioMatematicaGeneral+ " " +
                operadorsGeneral1[1]+ " "+
                "es igual a "+
                resultat);
    }


    public static void demanarOperacio (){
        //3+2 --> 3 + 2
        Scanner read = new Scanner(System.in);
        String operacio = read.nextLine();

        //llevar espais en blanc
        operacio= operacio.replaceAll(" ", "");

        int operacioMatematica= 0;
        int [] operadors= new int[2];
        if (operacio.contains("+")){
            operacioMatematica =1;
            String[] operadorsStr = operacio.split( "\\+", 0);

            for (int i=0; i<operadorsStr.length;i++){
                operadors[i] = Integer.parseInt(operadorsStr[i]);
            }
        }

        //operadorsGeneral1 = operadors;
        //operacioMatematicaGeneral = operacioMatematica;



    }*/

    /*public int operar () {
        if (this.operacioMatematicaGeneral==1){
            return sumar(this.operadorsGeneral1[0], this.operadorsGeneral1[1]));
        }
        return 0;
    }*/

   /* public static int operar (int op1, int op2, int operacion){
        if (operacion==1){
            return sumar(op1,op2);
        }

        return 0;
    }*/

    public static int sumar (int op1, int op2 ){
        return op1 + op2;
    }
}