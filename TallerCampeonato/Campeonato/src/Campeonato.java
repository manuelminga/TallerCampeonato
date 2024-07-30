import java.util.ArrayList;

public class Campeonato {
    private String nombre;
    private String tipo;
    private ArrayList<Equipo> equipos; // Asumiendo que `Equipo` es una clase definida en tu proyecto

    // Constructor
    public Campeonato(String nombre, String tipo, ArrayList<Equipo> equipos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.equipos = equipos != null ? equipos : new ArrayList<>();
    }

    // Métodos para iniciar y finalizar el campeonato
    public void iniciarCampeonato(boolean informar) {
        // Implementación para iniciar el campeonato
        if (informar) {
            System.out.println("El campeonato " + nombre + " de tipo " + tipo + " ha comenzado.");
        }
        // Más lógica aquí
    }

    public void finalizarCampeonato() {
        // Implementación para finalizar el campeonato
        System.out.println("El campeonato " + nombre + " ha terminado.");
        // Más lógica aquí
    }

    // Getters y Setters
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
        this.equipos = equipos != null ? equipos : new ArrayList<>();
    }

    // Método opcional para añadir un equipo
    public void agregarEquipo(Equipo equipo) {
        if (equipo != null) {
            equipos.add(equipo);
        }
    }

    // Método opcional para eliminar un equipo
    public void eliminarEquipo(Equipo equipo) {
        equipos.remove(equipo);
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
