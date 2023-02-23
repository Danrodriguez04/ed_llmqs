package model;

public class TreballadorPublic implements Treballador{


    @Override //significa sobreescribir, asegura que se escriba en la misma clase
    public float calcularNomina() {

        //conexion HTTP conselleria
        return 1500;
    }

    @Override
    public float calcularIRPF() {
        //conexion HTTP conselleria
        return 17;
    }
}
