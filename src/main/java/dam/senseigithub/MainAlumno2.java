package dam.senseigithub;
import java.util.logging.Logger;
public class MainAlumno2{
    static Logger logger = Logger.getLogger(MainAlumno2.class.getName());
    public static void main(String[] args) {
        TransportistaFede transportistaFede = new TransportistaFede();
        Punto origen = new Punto(0, 0);
        Punto destinoCorto = new Punto(3, 4); // Distancia Manhattan: 7
        Punto destinoMedio = new Punto(10, 20); // Distancia Manhattan: 30
        Punto destinoLargo = new Punto(50, 60); // Distancia Manhattan: 110
        double pesoLigero = 3.0; // Peso ligero
        double pesoPesado = 8.0; // Peso pesado
        try {
            double costeCorto = transportistaFede.presupuestar(origen, destinoCorto, pesoLigero);
            logger.info("Coste del envío corto (7 km, 3 kg): " + costeCorto);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        try {
            double costeMedio = transportistaFede.presupuestar(origen, destinoMedio, pesoPesado);
            logger.info("Coste del envío medio (30 km, 8 kg): " + costeMedio);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        try {
            double costeLargo = transportistaFede.presupuestar(origen, destinoLargo, pesoLigero);
            logger.info("Coste del envío largo (110 km, 3 kg): " + costeLargo);
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }
}
