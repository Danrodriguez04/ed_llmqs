package model;

public class Professor extends Usuari { //solo se puede utilizar la herencia cuando las clases que heredan tienen que ver entre ellas
    private Usuari usuari;
    private String especialitat;
    private String departament;


    //model.Professor.getUsuari().getNom();
    //model.Professor.getNom();


    public Professor(String dni, String nom, String cognom1, String cognom2, String email, String especialitat, String departament) {
        super(dni, nom, cognom1, cognom2, email);
        this.especialitat = especialitat;
        this.departament = departament;
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
}
