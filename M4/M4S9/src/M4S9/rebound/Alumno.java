package M4S9.rebound;

import java.util.Date;

public class Alumno extends Persona {
  private String tareasPendientes;

  public Alumno(String nombre, Date fechaNacimiento, String tareasPendientes) {
    super(nombre, fechaNacimiento);
    this.tareasPendientes = tareasPendientes;
  }

  public String getTareasPendientes() {
    return tareasPendientes;
  }

  public void setTareasPendientes(String tareasPendientes) {
    this.tareasPendientes = tareasPendientes;
  }

  @Override
  public String toString() {
    return "Alumno - " + super.toString() + ", tareas pendientes= " + tareasPendientes;
  }

}
