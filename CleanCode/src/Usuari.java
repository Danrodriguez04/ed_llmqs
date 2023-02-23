public class Usuari {
//probar de poner el nombre estatico
         String nom;
        String cognoms;
        int edat;

        public Usuari(String nom, String cognoms, int edat ){
            this.nom = nom;
            this.cognoms = cognoms;
            this.edat = edat;
            this.saludar();
        }

        public String saludar (){
            return "El meu nom es "+ this.nom + this.cognoms + this.edat;

        }

}
