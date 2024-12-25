package M4S10.model;

import M4S10.interfaces.IAccionesComunes;
import M4S10.interfaces.IAmonestable;
import M4S10.util.Tarjeta;

public class DirectorTecnico extends Persona implements IAccionesComunes, IAmonestable {
  private int anosExperiencia;
  private double tarjetasAcumuladas = 0;
  private boolean expulsado;

  public DirectorTecnico(String nombre, String apellido, int edad, int anosExperiencia) {
    super(nombre, apellido, edad);
    this.anosExperiencia = anosExperiencia;
  }

  public int getAnosExperiencia() {
    return anosExperiencia;
  }

  public void setAnosExperiencia(int anosExperiencia) {
    this.anosExperiencia = anosExperiencia;
  }

  public double getTarjetasAcumuladas() {
    return tarjetasAcumuladas;
  }

  public void setTarjetasAcumuladas(double tarjetasAcumuladas) {
    this.tarjetasAcumuladas = tarjetasAcumuladas;
  }

  public boolean isExpulsado() {
    return expulsado;
  }

  public void setExpulsado(boolean expulsado) {
    this.expulsado = expulsado;
  }


  @Override
  public void celebrar() {
    System.out.println("El entrenador "+getNombre()+" esta celebrando con su equipo...");
  }

  @Override
  public void hablar(String mensaje) {
    System.out.println("El entrenador " + getNombre() + " dice "+ mensaje);

  }

  @Override
  public void amonestar(Tarjeta tarjeta) {
    System.out.println(getNombre() +" "+getApellido()+ " esta siendo amonestado con una tarjeta " + tarjeta);
    if (tarjeta == Tarjeta.AMARILLA) {
      tarjetasAcumuladas += 0.5;
      expulsado();
    } else if (tarjeta == Tarjeta.ROJA) {
      tarjetasAcumuladas += 1.0;
      expulsado();
    }
  }
@Override
  public boolean expulsado() {
    if (tarjetasAcumuladas < 1.0) {
      return !expulsado;
    }
    System.out.println("El entrenador " +getNombre() +" a sido expulsado.");
    return expulsado;
  }
  @Override
  public String toString() {
    return "DirectorTecnico -> "+ super.toString() + " años experiencia: " + anosExperiencia ;
  }
}
