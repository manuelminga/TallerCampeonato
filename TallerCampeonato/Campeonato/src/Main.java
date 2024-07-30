import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creación de campeonatos
        Campeonato campeonato1 = new Campeonato("Campeonato 1", "Futbol", new ArrayList<>());
        Campeonato campeonato2 = new Campeonato("Campeonato 2", "Futbol", new ArrayList<>());

        // Creación de equipos
        Equipo equipoA = new Equipo("Equipo A", new ArrayList<>());
        Equipo equipoB = new Equipo("Equipo B", new ArrayList<>());

        // Agregar jugadores a los equipos
        Jugador jugador1 = new Jugador("Jugador 1", "Apellido 1", "DNI 1", new Date(), 1);
        Jugador jugador2 = new Jugador("Jugador 2", "Apellido 2", "DNI 2", new Date(), 2);
        equipoA.agregarJugador(jugador1);
        equipoB.agregarJugador(jugador2);

        // Añadir equipos a los campeonatos
        campeonato1.getJugadores().add(equipoA);
        campeonato2.getJugadores().add(equipoB);

        // Iniciar campeonatos
        campeonato1.iniciarCampeonato(true);
        campeonato2.iniciarCampeonato(true);

        // Ejemplo de partido y actualización de posiciones
        Partido partido = new Partido(equipoA, equipoB, "2024-07-30", 0);
        partido.jugarPartido(true);

        // Actualizar la tabla de posiciones
        TablaPosicion tablaPosicion = new TablaPosicion(new ArrayList<>());
        Posicion posicion1 = new Posicion(3, "Equipo A", 1, 0, 0, 2);
        Posicion posicion2 = new Posicion(1, "Equipo B", 0, 0, 1, 2);
        tablaPosicion.getPosiciones().add(posicion1);
        tablaPosicion.getPosiciones().add(posicion2);
        tablaPosicion.ordenarPosiciones("equipo");

        // Mosstrar clasificación
        Grupo grupo = new Grupo(new ArrayList<>(), true);
        grupo.mostrarClasificacion("equipo");
    }
}
