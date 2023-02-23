public class Operacio {

    private int operacion;
    private int operador1;
    private int operador2;

    public Operacio(int operacion, int operador1, int operador2) {
        this.operacion = operacion;
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public int getOperacion() {
        return operacion;
    }

    public int getOperador1() {
        return operador1;
    }

    public int getOperador2() {
        return operador2;
    }
}
