package dam.senseigithub;

public abstract class Transportista {
    String nombre;
    String color;
    Distancia medida;

    /**
     * Lo que hace es devolver el presupuesto que tiene el transportista para realizar el envío
     * @param origen Recibe el origen del envío
     * @param destino Recibe el destino del envío
     * @param peso Recibe el peso del envío
     * @return Devuelve el presupuesto
     */
    public abstract double presupuestar(Punto origen, Punto destino, double peso);
}
