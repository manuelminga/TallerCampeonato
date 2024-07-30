public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private String fecha;
    private int golesLocal;
    private int golesVisitante;

    // Constructor
    public Partido(Equipo equipoLocal, Equipo equipoVisitante, String fecha, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    // Método para jugar el partido
    public void jugarPartido(boolean informar) {
        if (informar) {
            System.out.println("Partido jugado entre " + equipoLocal.getNombreEquipo() +
                    " y " + equipoVisitante.getNombreEquipo() +
                    " con un resultado de " + golesLocal + "-" + golesVisitante);
        }
        // Más lógica aquí
    }

    // Getters y Setters
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal=" + equipoLocal +
                ", equipoVisitante=" + equipoVisitante +
                ", fecha='" + fecha + '\'' +
                ", golesLocal=" + golesLocal +
                ", golesVisitante=" + golesVisitante +
                '}';
    }
}
