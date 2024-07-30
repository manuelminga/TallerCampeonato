import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> miembros;
    private int golesAFavor;
    private int golesEnContra;
    private int puntos;

    public Equipo(String nombreEquipo, ArrayList<Jugador> miembros) {
        this.nombreEquipo = nombreEquipo;
        this.miembros = miembros;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
        this.puntos = 0;
    }

    public String getNombreEquipo() { return nombreEquipo; }
    public ArrayList<Jugador> getMiembros() { return miembros; }
    public int getGolesAFavor() { return golesAFavor; }
    public int getGolesEnContra() { return golesEnContra; }
    public int getPuntos() { return puntos; }

    public void agregarGoles(int aFavor, int enContra) {
        this.golesAFavor += aFavor;
        this.golesEnContra += enContra;
        if (aFavor > enContra) {
            this.puntos += 3; // Ganar el partido
        } else if (aFavor == enContra) {
            this.puntos += 1; // Empate
        }
    }

    public void agregarJugador(Jugador jugador) {
        miembros.add(jugador);
    }

    public void quitarJugador(Jugador jugador) {
        miembros.remove(jugador);
    }
}
