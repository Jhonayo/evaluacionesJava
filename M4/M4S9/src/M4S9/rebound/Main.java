package M4S9.rebound;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
public static void main(String[] args) {

    Persona profesor1 = new Profesor("Miguel",new Date());
    Persona profesor2 = new Profesor("Claudio", new Date());
    Persona alumno1 = new Alumno("Esteban", new Date(), "Matematicas");
    Persona alumno2 = new Alumno("Claudia", new Date(), "Historia");

    List<Persona> personas = new ArrayList<>();
    personas.add(profesor1);
    personas.add(profesor2);
    personas.add(alumno1);
    personas.add(alumno2);

    System.out.println("Se imprime ca categoria(clase) de la persona y su nombre: ");
    for (Persona persona : personas) {
      System.out.println(persona.getClass().getSimpleName()+" - "+ persona.getNombre());
    }
    System.out.println("Se imprime la super clase de cada persona: ");
    for (Persona persona : personas) {
      System.out.println(persona.getNombre() +" -> su super clase es -> "+ persona.getClass().getSuperclass().getSimpleName());
    }
    System.out.println("Se imprime la lista completa de las personas: ");
  for (Persona persona : personas) {
    System.out.println(persona);
  }
  }
  
}
