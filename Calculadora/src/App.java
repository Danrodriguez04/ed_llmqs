public class App {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        terminal.output("Benvingut a la calculadora 2.0");



        Calculadora calculadora = new Calculadora(terminal);
        Operacio operacio = calculadora.demanarOperacio();
        int resultat = calculadora.operar (
                operacio.getOperador1(),
                operacio.getOperador2(),
                operacio.getOperacion()
        );

        terminal.output("El resultat es " + resultat);



    }

}
