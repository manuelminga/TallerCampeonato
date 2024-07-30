import java.util.ArrayList;

public class Grupo {
    private ArrayList<Equipo> equipos;
    private boolean clasificacion;


    public Grupo(ArrayList<Equipo> equipos, boolean clasificacion) {
        this.equipos = equipos;
        this.clasificacion = clasificacion;
    }


    public void mostrarClasificacion(String criterio) {
        System.out.println("Clasificación según el criterio: " + criterio);
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombreEquipo());
        }
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public boolean isClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(boolean clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "equipos=" + equipos +
                ", clasificacion=" + clasificacion +
                '}';
    }
}
