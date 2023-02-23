package model;

public class Escola {
    private String nom;
    private Usuari[] usuaris;
    private final int MAX_USERS = 1000;
    private int darrer;

    public Escola(String nom) {
        this.nom = nom;
        this.usuaris = new  Usuari[MAX_USERS];
        darrer = 0;
    }

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

}
