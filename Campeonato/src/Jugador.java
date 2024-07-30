public class Jugador {
    private String nombreApellido;
    private int numeroCamiseta;

    public Jugador(String nombreApellido, int numeroCamiseta) {
        this.nombreApellido = nombreApellido;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombreApellido() { return nombreApellido; }
    public int getNumeroCamiseta() { return numeroCamiseta; }
}
