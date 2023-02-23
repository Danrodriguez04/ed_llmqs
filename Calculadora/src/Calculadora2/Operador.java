package Calculadora2;

public class Operador {
    private String nom="SUMAR";
    private String simbol= "+";
    private int valor;

    public String getNom() {
        return nom;
    }

    public String getSimbol() {
        return simbol;
    }

    public int getValor() {
        return valor;
    }

    public Operador(String nom, String simbol, int valor){
        this.nom = nom;
        this.simbol = simbol;
        this.valor = valor;


    }

}
