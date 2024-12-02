package M4.rebound;

public class Alumnos extends Persona {
  private Profesor profesor;
  private String hobby;

  public Alumnos(String nombre, String identificador, Profesor profesor, String hobby) {
    super(nombre, identificador);
    this.profesor = profesor;
    this.hobby = hobby;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public String getHobby() {
    return hobby;
  }

  @Override
  public void leer() {
    System.out.println(getNombre() + " esta leyendo los ejercicios realizados por el profesor " + profesor.getNombre());
  }

  @Override
  public void realizarEjercicios() {
    System.out.println(getNombre() + " esta haciendo los ejercicios enviados por el profesor " + profesor.getNombre());
  }

  @Override
  public String toString() {
    return "Alumno[ nombre= " + getNombre() + ", identificador=" + getIdentificador() + ", profesor=  " + profesor
        + ", hobbie= " + getHobby() + "]";
  }

}
