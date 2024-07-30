import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> miembros;

    public void agregarJugador(Jugador jugador) {
        miembros.add(jugador);
    }

    public void quitarJugador(Jugador jugador) {
        miembros.remove(jugador);
    }

    // Constructor, getters y setters
}
