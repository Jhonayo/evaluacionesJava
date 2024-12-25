package M4S10;

import java.util.ArrayList;
import java.util.List;

import M4S10.model.DirectorTecnico;
import M4S10.model.Jugador;
import M4S10.model.Persona;
import M4S10.util.Tarjeta;

public class Main {
  public static void main(String[] args) {

    List<Persona> equipo = new ArrayList<>();

    DirectorTecnico dt = new DirectorTecnico("José", "Hernández", 45, 20);
    equipo.add(dt);

    equipo.add(new Jugador("Juan", "Pérez", 27, 1, "Portero"));
    equipo.add(new Jugador("Luis", "Martínez", 24, 2, "Defensa"));
    equipo.add(new Jugador("Pedro", "Gómez", 26, 3, "Defensa"));
    equipo.add(new Jugador("Carlos", "López", 22, 4, "Defensa"));
    equipo.add(new Jugador("Miguel", "Rodríguez", 25, 5, "Defensa"));
    equipo.add(new Jugador("Jorge", "Fernández", 23, 6, "Centrocampista"));
    equipo.add(new Jugador("Andrés", "García", 28, 7, "Centrocampista"));
    equipo.add(new Jugador("David", "Sánchez", 24, 8, "Centrocampista"));
    equipo.add(new Jugador("Sergio", "Ramírez", 26, 9, "Delantero"));
    equipo.add(new Jugador("Fernando", "Torres", 27, 10, "Delantero"));
    equipo.add(new Jugador("Raúl", "Hernández", 25, 11, "Delantero"));

    // Mostrar equipo
    System.out.println("////////////////////////////////////////");
    System.out.println("Equipo Titular:");
    for (Persona persona : equipo) {
      System.out.println(persona);
    }

    dt.hablar("¡Vamos a ganar este partido!");
    Jugador jugador10 = (Jugador) equipo.get(10);
    jugador10.correr();
    jugador10.amonestar(Tarjeta.AMARILLA);
    Jugador jugador11 = (Jugador) equipo.get(11);
    jugador11.amonestar(Tarjeta.AMARILLA);
    jugador10.quitarBalon();
    jugador10.amonestar(Tarjeta.AMARILLA);
    jugador11.correr();
    jugador11.anotarGol();
    jugador11.celebrar();

  }
}
