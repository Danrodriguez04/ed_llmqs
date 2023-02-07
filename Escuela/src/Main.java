import model.Alumne;
import model.Escola;
import model.Professor;
import model.Usuari;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Professor p = new Professor();
        p.getDni();
        p.getEspecialitat();
        Alumne a = new Alumne();
        a.getNumeroExpedient();
        //model.Usuari u = new model.Usuari();

        Escola iesManacor = new Escola("IES Manacor ");
        try {
            iesManacor.addUsuari(a);
            iesManacor.addUsuari(p);
        }catch (Exception e){

        }
        Usuari

        Usuari[] tothom = ;

    }

    /*public static Usuari [] llistarUsuari (){
        return null;
    }*/

}