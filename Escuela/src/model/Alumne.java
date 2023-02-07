package model;

public class Alumne extends Usuari {

    private String numeroExpedient;

    public Alumne(String dni, String nom, String cognom1, String cognom2, String email, String numeroExpedient) {
        super(dni, nom, cognom1, cognom2, email);
        this.numeroExpedient = numeroExpedient;
    }

    public String getNumeroExpedient() {
        return numeroExpedient;
    }


    public void setNumeroExpedient(String numeroExpedient) {
        this.numeroExpedient = numeroExpedient;
    }
}
