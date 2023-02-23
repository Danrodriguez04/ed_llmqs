package model;

public abstract class Usuari implements Comparable<Usuari>{
    private String dni;
    private String nom;
    private String cognom1;
    private String cognom2;
    private String email;

    public Usuari(String dni, String nom, String cognom1, String cognom2, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public String getEmail() {
        return email;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /*
    cognom1 cognom2 nom

    0 si u y this son igual
    * 1 si this > u
    * -1 si this < u

    Finally, the implementor must ensure that x.compareTo(y)==0 implies that
     signum(x.compareTo(z)) == signum(y.compareTo(z)), for all z
    */
    @Override
    public int compareTo(Usuari u){

        String u1= this.getCognom1()+this.getCognom2()+this.getNom();
        String u2 = u.getCognom1()+u.getCognom2()+u.getNom();
        return u1.compareTo(u2);

       /* if (this.getCognom1().compareTo(u.getCognom1())==0){

        }
        return this.getCognom1().compareTo(u.getCognom1());

        //this.getCognom1().compareTo(u.getCognom1()) == 0;

        this.getCognom1().compareTo(u.getCognom1());
        u.getCognom1().compareTo(this.getCognom1());
        return 0;*/
    }


}
