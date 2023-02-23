import interficie.InterficieGrafica;
import interficie.TerminalInterface;
import interficie.UserInterface;
import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //MENU
        //SELECCIONAR OPCION
        //AGREGAR DEBE PEDIR SI ALUMNE O PROFE
        /*



         public void addUsuari (Usuari usuari) throws Exception {
        if (darrer < MAX_USERS){
            this.usuaris[darrer] = usuari;
            darrer++;
        } else {
            throw new Exception("Nombre maxim d'usuaris");
        }

    }

    public Usuari [] llistaUsuari (){
        Usuari [] usuaris = new Usuari[darrer];
        //emplenar array amb els usuaris
        for (int i= 0 ; i < usuaris.length; i++){
            usuaris[i] = this.usuaris[i];
        }
        return usuaris;
    }
         */





        Professor p = new Professor("av", "nora", "johana", "angel", "@hotmi", "profesor", "ciencia");
        p.getDni();
        p.getEspecialitat();
        Alumne a = new Alumne("y79886", "daniel", "rodriguez", "sierra", "@gmail", "854967");
        a.getNumeroExpedient();
        //model.Usuari u = new model.Usuari();

        Escola iesManacor = new Escola("IES Manacor ");
        try {
            iesManacor.addUsuari(a);
            iesManacor.addUsuari(p);
        } catch (Exception e) {

        }


        Usuari[] usuaris = iesManacor.llistaUsuari();


        /*for (Usuari u:usuaris){
            System.out.println("usuari" + u.getNom());
        }*/

        //Collections.sort(Arrays.stream(usuaris).);

        /*for (int i = 0; i < usuaris.length; i++) {
            System.out.println("usuari" + usuaris[i].getNom());


            if (usuaris[i] instanceof Alumne) {//tener en cuenta de hacer el instanceof para que reconozca solo el alumno
                System.out.println("numeroEx" + ((Alumne) usuaris[i]).getNumeroExpedient());
            } else if (usuaris[i] instanceof Professor) {
                System.out.println("departament:" + ((Professor) usuaris[i]).getDepartament());


            }

        }*/

        /*UserInterface userInterface = new InterficieGrafica();
        userInterface.pintaMenu();


        UserInterface userInterface = new TerminalInterface();*/


        UserInterface userInterface;

        Scanner scanner = new Scanner(System.in);

        int opcio = scanner.nextInt();
        if (opcio==1){
            userInterface = new TerminalInterface(iesManacor);

        }else {
            userInterface = new InterficieGrafica();
        }

        userInterface.pintaMenu();



        /*//Añadir
        for (int j = 0; j < usuaris.length; j++) {
            if (usuaris[j] instanceof Alumne){

            }
            if (usuaris[j] instanceof Professor){

            }

        }*/

    /*public static Usuari [] llistarUsuari (){
        return null;
    }*/

    }
}