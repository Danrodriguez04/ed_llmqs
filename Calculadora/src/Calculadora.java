import java.util.Scanner;

public class Calculadora { 
    private Terminal terminal;

    private final int SUMA = 1;  //Magic numbers!!!!
    //private int [] operadorsGeneral1;
    //private  int operacioMatematicaGeneral;

    public Calculadora (Terminal terminal){
        this.terminal = terminal;
    }

    public Operacio demanarOperacio (){
        Terminal terminal = new Terminal();
        System.out.println("Hash" + terminal.hashCode());
        //3+2 --> 3 + 2

        String operacio = terminal.input();

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

        Operacio operacio1 = new Operacio(operacioMatematica,operadors[0],operadors[1]);
        return operacio1;

    }

   /* public int operar () {
        if (this.operacioMatematicaGeneral==1){
            return sumar(this.operadorsGeneral1[0], this.operadorsGeneral1[1]));
        }
        return 0;
    }*/


    public void escriureResultat (){
        terminal.output("Resultat");
    }
    public  int operar (int op1, int op2, int operacion){
        //if (operacion==1){
        if (operacion==SUMA){
            return sumar(op1,op2);
        }

        return 0;
    }

    public  int sumar (int op1, int op2 ){
        return op1 + op2;
    }

}
