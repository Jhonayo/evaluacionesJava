package M4.rebound;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    Profesor profesor = new Profesor("Prof. Diaz", "P76548", "Fisica");
    Alumnos alumno1 = new Alumnos("Carlos", "A8976", profesor, "Leer");
    Alumnos alumno2 = new Alumnos("Jose", "A9095", profesor, "Pintar");
    Alumnos alumno3 = new Alumnos("Claudia", "A6785", profesor, "Robotica");

    List<Persona> curso = new ArrayList<>();

    curso.add(profesor);
    curso.add(alumno1);
    curso.add(alumno2);
    curso.add(alumno3);

    System.out.println("El cuso esta compuesto por: \n");
    for (Persona persona : curso) {
      System.out.println(persona);
    }

  }
}
