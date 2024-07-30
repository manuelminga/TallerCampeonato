import java.util.ArrayList;

public class TablaPosicion {
    private ArrayList<Posicion> posiciones;

    // Constructor
    public TablaPosicion(ArrayList<Posicion> posiciones) {
        this.posiciones = posiciones;
    }

    // Métodos
    public ArrayList<Posicion> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(ArrayList<Posicion> posiciones) {
        this.posiciones = posiciones;
    }

    public void ordenarPosiciones(String criterio) {
        // Implementar el método de ordenamiento según el criterio
    }
}
