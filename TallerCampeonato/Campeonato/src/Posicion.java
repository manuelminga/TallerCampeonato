public class Posicion {
    private int ranking;
    private String nombreEquipo;
    private int partidosJugados;
    private int victorias;
    private int empates;
    private int derrotas;
    private int golesFavor;
    private int golesContra;

    // Constructor
    public Posicion(int ranking, String nombreEquipo, int partidosJugados, int victorias, int empates, int derrotas, int golesFavor, int golesContra) {
        this.ranking = ranking;
        this.nombreEquipo = nombreEquipo;
        this.partidosJugados = partidosJugados;
        this.victorias = victorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
    }

    // Getters y Setters
    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    @Override
    public String toString() {
        return "Posicion{" +
                "ranking=" + ranking +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", partidosJugados=" + partidosJugados +
                ", victorias=" + victorias +
                ", empates=" + empates +
                ", derrotas=" + derrotas +
                ", golesFavor=" + golesFavor +
                ", golesContra=" + golesContra +
                '}';
    }
}
