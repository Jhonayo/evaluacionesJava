package M4.rebound;

public class Profesor extends Persona{

  private String especialidad;
  public Profesor(String nombre, String identificador, String especialidad) {
    super(nombre, identificador);
    this.especialidad = especialidad;
  }
  public String getEspecialidad() {
    return especialidad;
  }
  @Override
  public void leer() {
   System.out.println(getNombre() + " esta leyendo");
    // TODO Auto-generated method stub
    
  }
  @Override
  public void realizarEjercicios() {
    System.out.println(getNombre() + " esta diseñando trabajos");
    // TODO Auto-generated method stub
  }
  @Override
  public String toString() {
    return "Profesor[especialidad=" + especialidad + ", nombre=" + getNombre() + ", identificador="
        + getIdentificador() + "]";

  };

  
}
 
      
   



