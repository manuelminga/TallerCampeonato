import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\u001B[4m¿Cuántos campeonatos desea inscribir en nuestro sistema?\u001B[0m =>");
        int numeroDeCampeonatos = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Campeonato> campeonatos = new ArrayList<>();
        for (int i = 1; i <= numeroDeCampeonatos; i++) {
            System.out.print("Nombre del Campeonato " + i + ": ");
            String nombreCampeonato = scanner.nextLine();
            Campeonato campeonato = new Campeonato(nombreCampeonato, "Futbol", new ArrayList<>());
            campeonatos.add(campeonato);
        }

        System.out.println("\u001B[4mInscripción de equipos y jugadores\u001B[0m");
        for (Campeonato campeonato : campeonatos) {
            inscribirEquipos(scanner, campeonato, campeonato.getNombre());
        }

        for (Campeonato campeonato : campeonatos) {
            campeonato.iniciarCampeonato(true);
        }

        Campeonato campeonatoSeleccionado = seleccionarCampeonato(scanner, campeonatos);

        System.out.println("Seleccione equipos para el partido en el " + campeonatoSeleccionado.getNombre() + ":");
        Equipo equipoA = seleccionarEquipo(scanner, campeonatoSeleccionado, campeonatoSeleccionado.getNombre());
        Equipo equipoB = seleccionarEquipo(scanner, campeonatoSeleccionado, campeonatoSeleccionado.getNombre());

        System.out.println("\u001B[4mIngrese el resultado del partido\u001B[0m");
        System.out.print("Goles del Equipo A: ");
        int golesEquipoA = scanner.nextInt();
        System.out.print("Goles del Equipo B: ");
        int golesEquipoB = scanner.nextInt();

        Partido partido = new Partido(equipoA, equipoB, "2024-07-30", golesEquipoA, golesEquipoB);
        partido.jugarPartido();

        TablaPosicion tablaPosicion = new TablaPosicion();
        tablaPosicion.actualizarPosiciones(equipoA);
        tablaPosicion.actualizarPosiciones(equipoB);
        tablaPosicion.ordenarPosiciones();

        System.out.println("Tabla de posiciones de " + campeonatoSeleccionado.getNombre() + ":");
        tablaPosicion.mostrarTabla();

        for (Campeonato campeonato : campeonatos) {
            campeonato.finalizarCampeonato();
        }

        scanner.close();
    }

    private static void inscribirEquipos(Scanner scanner, Campeonato campeonato, String nombreCampeonato) {
        System.out.println("Inscribiendo equipos en el " + nombreCampeonato + ":");

        System.out.print("¿Cuántos equipos desea inscribir en el " + nombreCampeonato + "?: ");
        int numeroDeEquipos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numeroDeEquipos; i++) {
            System.out.println("Inscribiendo equipo " + (i + 1) + ":");
            inscribirEquipoYJugadores(scanner, campeonato, nombreCampeonato);
        }
    }

    private static void inscribirEquipoYJugadores(Scanner scanner, Campeonato campeonato, String nombreCampeonato) {
        System.out.print("Nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        Equipo equipo = new Equipo(nombreEquipo, new ArrayList<>());

        System.out.print("¿Cuántos jugadores desea inscribir en el " + equipo.getNombreEquipo() + "?: ");
        int numeroDeJugadores = -1;
        boolean numeroValido = false;

        while (!numeroValido) {
            try {
                numeroDeJugadores = scanner.nextInt();
                scanner.nextLine();
                if (numeroDeJugadores <= 0) {
                    System.out.println("El número de jugadores debe ser mayor que 0. Intente nuevamente.");
                } else {
                    numeroValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.nextLine();
            }
        }

        Set<Integer> numerosCamiseta = new HashSet<>();

        for (int i = 0; i < numeroDeJugadores; i++) {
            System.out.println("Inscribiendo jugador " + (i + 1) + ":");
            System.out.print("Nombre y Apellido: ");
            String nombreApellido = scanner.nextLine();

            int numeroCamiseta = -1;
            boolean camisetaValida = false;

            while (!camisetaValida) {
                System.out.print("Número de camiseta: ");
                try {
                    numeroCamiseta = scanner.nextInt();
                    scanner.nextLine();
                    if (numerosCamiseta.contains(numeroCamiseta)) {
                        System.out.println("El número de camiseta ya está en uso. Por favor, ingrese un número diferente.");
                    } else {
                        numerosCamiseta.add(numeroCamiseta);
                        camisetaValida = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                    scanner.nextLine();
                }
            }

            Jugador jugador = new Jugador(nombreApellido, numeroCamiseta);
            equipo.agregarJugador(jugador);
        }

        campeonato.getEquipos().add(equipo);
    }

    private static Campeonato seleccionarCampeonato(Scanner scanner, ArrayList<Campeonato> campeonatos) {
        System.out.println("Seleccione el campeonato para el partido:");
        for (int i = 0; i < campeonatos.size(); i++) {
            System.out.println((i + 1) + ". " + campeonatos.get(i).getNombre());
        }
        System.out.print("Seleccione un campeonato (número): ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();
        return campeonatos.get(seleccion - 1);
    }

    private static Equipo seleccionarEquipo(Scanner scanner, Campeonato campeonato, String nombreCampeonato) {
        System.out.println("Equipos en " + nombreCampeonato + ":");
        ArrayList<Equipo> equipos = campeonato.getEquipos();
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println((i + 1) + ". " + equipos.get(i).getNombreEquipo());
        }
        System.out.print("Seleccione un equipo (número): ");
        int seleccion = scanner.nextInt();
        scanner.nextLine();
        return equipos.get(seleccion - 1);
    }
}
