public class Partido {
    private Equipo equipoA;
    private Equipo equipoB;
    private String fecha;
    private int golesEquipoA;
    private int golesEquipoB;

    public Partido(Equipo equipoA, Equipo equipoB, String fecha, int golesEquipoA, int golesEquipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.fecha = fecha;
        this.golesEquipoA = golesEquipoA;
        this.golesEquipoB = golesEquipoB;
    }

    public void jugarPartido() {
        equipoA.agregarGoles(golesEquipoA, golesEquipoB);
        equipoB.agregarGoles(golesEquipoB, golesEquipoA);
    }
}
