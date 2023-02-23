package model;

public class Professor extends Usuari { //solo se puede utilizar la herencia cuando las clases que heredan tienen que ver entre ellas
    private Usuari usuari;
    private String especialitat;
    private String departament;
    private Treballador treballador;


    //model.Professor.getUsuari().getNom();
    //model.Professor.getNom();


    public Professor(/*Treballador t*/String dni, String nom, String cognom1, String cognom2, String email, String especialitat, String departament) {
        super(dni, nom, cognom1, cognom2, email);
        this.especialitat = especialitat;
        this.departament = departament;
        //this.treballador = t;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public String getDepartament() {
        return departament;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    /*public void horesSuport (){
        float nomina= this.treballador.calcularNomina();
        if (nomina<2000){
            return 2;
        }

    }*/

}
