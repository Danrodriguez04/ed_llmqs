package interficie;

import model.Alumne;
import model.Escola;
import model.Usuari;

import java.util.Scanner;
import java.util.SortedMap;

public class TerminalInterface implements UserInterface {

    private Escola escola;

    public TerminalInterface (Escola escola){
        this.escola=escola;
    }

    @Override
    public void pintaMenu() throws Exception {

        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("bienvenidos a la escuela " + this.escola);
            System.out.println("elija una opcion");
            System.out.println("1-Añadir Usuaris");
            System.out.println("2-Llistar Usuaris");
            System.out.println("3-exit");


            int opcio = scanner.nextInt();


            switch (opcio) {
                case 1: {
                    this.afegirUsuari();
                }
                case 2: {
                    this.llistarUsuaris();
                }
                case 3: {
                    exit = true;
                }
                default: {
                    System.out.println("opcion no valida");
                }
            }
        }
    }
    @Override
    public void afegirUsuari() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Afegir un alumne");
        System.out.println("nom:");
        String nom = scanner.nextLine();
        System.out.println("Cognom 1");
        String cognom1 = scanner.nextLine();
        System.out.println("Cognom 2");
        String cognom2 = scanner.nextLine();

        Alumne alumne = new Alumne("",nom,cognom1,cognom2,"","");
        this.escola.addUsuari(alumne);

    }

    @Override
    public void llistarUsuaris() {

        Usuari[] usuaris = this.escola.llistaUsuari();
    }
}
