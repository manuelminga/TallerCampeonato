import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> miembros;

    // Constructor
    public Equipo(String nombreEquipo, ArrayList<Jugador> miembros) {
        this.nombreEquipo = nombreEquipo;
        this.miembros = miembros != null ? miembros : new ArrayList<>();
    }

    // Métodos para gestionar jugadores
    public void agregarJugador(Jugador jugador) {
        if (jugador != null) {
            miembros.add(jugador);
        }
    }

    public void quitarJugador(Jugador jugador) {
        miembros.remove(jugador);
    }

    public void sumarPuntos(int sumar) {
        // Implementación para sumar puntos (a definir según la lógica del juego)
    }

    // Getters y Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Jugador> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Jugador> miembros) {
        this.miembros = miembros != null ? miembros : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", miembros=" + miembros +
                '}';
    }
}
