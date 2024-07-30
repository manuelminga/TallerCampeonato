public class Posicion {
    private String nombreEquipo;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;
    private int diferenciaGoles;

    public Posicion(String nombreEquipo, int puntos, int golesAFavor, int golesEnContra, int diferenciaGoles) {
        this.nombreEquipo = nombreEquipo;
        this.puntos = puntos;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
        this.diferenciaGoles = diferenciaGoles;
    }


    public String getNombreEquipo() { return nombreEquipo; }
    public int getPuntos() { return puntos; }
    public int getGolesAFavor() { return golesAFavor; }
    public int getGolesEnContra() { return golesEnContra; }
    public int getDiferenciaGoles() { return diferenciaGoles; }
    public void setPuntos(int puntos) { this.puntos = puntos; }
    public void setGolesAFavor(int golesAFavor) { this.golesAFavor = golesAFavor; }
    public void setGolesEnContra(int golesEnContra) { this.golesEnContra = golesEnContra; }
    public void setDiferenciaGoles(int diferenciaGoles) { this.diferenciaGoles = diferenciaGoles; }
}
