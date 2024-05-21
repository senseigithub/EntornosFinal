package dam.senseigithub;

public abstract class Distancia {

    /**
     * Mide desde un punto a otro.
     * @param origen Recibe el origen.
     * @param destino Recibe el destino.
     * @return la medición.
     */
    public abstract double medir(Punto origen, Punto destino);
}
