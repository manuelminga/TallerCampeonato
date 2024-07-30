import java.util.ArrayList;

public class Campeonato {
    private String nombre;
    private String tipo;
    private ArrayList<Equipo> equipos;

    public Campeonato(String nombre, String tipo, ArrayList<Equipo> equipos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.equipos = equipos;
    }

    public void iniciarCampeonato(boolean informar) {
        if (informar) {
            System.out.println("Campeonato " + nombre + " iniciado.");
        }
    }

    public void finalizarCampeonato() {
        System.out.println("Campeonato " + nombre + " finalizado.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", equipos=" + equipos +
                '}';
    }
}
