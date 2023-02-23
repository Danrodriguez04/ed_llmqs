package Calculadora2;

public class Calculadora {
    private int[] operadorsGeneral1;
    private int operacioMatematicaGeneral;

    private Operador[] operadorsCalculadora;

    public Calculadora(){
        Operador suma = new Operador("SUMA", "+", 1);
        Operador resta = new Operador("RESTA", "-", 2);

        operadorsCalculadora =new Operador[2];
        operadorsCalculadora[0] = suma;
        operadorsCalculadora[1] = resta;
    }

    public void parse(String input) {

        //llevar espais en blanc

        String operacio = input.replaceAll(" ", "");

        int operacioMatematica = 0;
        int[] operadors = new int[2];

        for (int i=0; i<this.operadorsCalculadora.length; i++){
            if (operacio.contains(this.operadorsCalculadora[i].getSimbol())){
                operacioMatematica = this.operadorsCalculadora[i].getValor();
                String[] operadorsStr = operacio.split("\\" + this.operadorsCalculadora[i].getSimbol(), 0);
                for (int j =0; j<operadorsStr.length;j++){
                    operadors[j] =Integer.parseInt(operadorsStr[j]);
                }
            }
        }


        /*if (operacio.contains("+")) {
            operacioMatematica = 1;
            String[] operadorsStr = operacio.split("\\+", 0);

            for (int i = 0; i < operadorsStr.length; i++) {
                operadors[i] = Integer.parseInt(operadorsStr[i]);
            }

        }*/
        operadorsGeneral1 = operadors;
        operacioMatematicaGeneral = operacioMatematica;

    }

    public int[] getOperadorsGeneral1(){
        return operadorsGeneral1;
    }

    public void setOperadorsGeneral1 (int[] operadorsGeneral1){
        this.operadorsGeneral1 = operadorsGeneral1;
    }

    public int getOperacioMatematicaGeneral (){
        return operacioMatematicaGeneral;
    }

    public void setOperacioMatematicaGeneral(int operacioMatematicaGeneral){
        this.operacioMatematicaGeneral = operacioMatematicaGeneral;
    }


}
