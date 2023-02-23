package Calculadora2;

import java.util.Scanner;

public class Terminal {

    public String llegir(){
        Scanner read = new Scanner(System.in);
        String operacio = read.nextLine();
        return operacio;
    }


    public void escriure (String out) {
        System.out.println(out);
    }
}
