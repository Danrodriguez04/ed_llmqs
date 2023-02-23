package Calculadora2;

public class Aplicacio {

    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        String in = terminal.llegir();

        Calculadora calculadora = new Calculadora();
        calculadora.parse(in);

        terminal.escriure(String.valueOf(calculadora.getOperacioMatematicaGeneral()));
    }
}

