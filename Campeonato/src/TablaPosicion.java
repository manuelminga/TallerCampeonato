import java.util.ArrayList;
import java.util.Comparator;

public class TablaPosicion {
    private ArrayList<Posicion> posiciones;

    public TablaPosicion() {
        this.posiciones = new ArrayList<>();
    }

    public void actualizarPosiciones(Equipo equipo) {
        boolean encontrado = false;
        for (Posicion posicion : posiciones) {
            if (posicion.getNombreEquipo().equals(equipo.getNombreEquipo())) {

                posicion.setPuntos(equipo.getPuntos());
                posicion.setGolesAFavor(equipo.getGolesAFavor());
                posicion.setGolesEnContra(equipo.getGolesEnContra());
                posicion.setDiferenciaGoles(equipo.getGolesAFavor() - equipo.getGolesEnContra());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {

            Posicion nuevaPosicion = new Posicion(equipo.getNombreEquipo(), equipo.getPuntos(), equipo.getGolesAFavor(), equipo.getGolesEnContra(), equipo.getGolesAFavor() - equipo.getGolesEnContra());
            posiciones.add(nuevaPosicion);
        }
    }

    public void ordenarPosiciones() {
        posiciones.sort(Comparator.comparingInt(Posicion::getPuntos).reversed()
                .thenComparingInt(Posicion::getDiferenciaGoles).reversed()
                .thenComparingInt(Posicion::getGolesAFavor).reversed());
    }

    public void mostrarTabla() {
        System.out.printf("%-20s %-7s %-15s %-17s %-20s%n",
                "Equipo", "Puntos", "Goles a Favor", "Goles en Contra", "Diferencia de Goles");
        for (Posicion posicion : posiciones) {
            System.out.printf("%-20s %-7d %-15d %-17d %-20d%n",
                    posicion.getNombreEquipo(), posicion.getPuntos(), posicion.getGolesAFavor(),
                    posicion.getGolesEnContra(), posicion.getDiferenciaGoles());
        }
    }
}
