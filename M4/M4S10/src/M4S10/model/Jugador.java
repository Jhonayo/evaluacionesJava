package M4S10.model;

import M4S10.interfaces.IAmonestable;
import M4S10.interfaces.IMovimientoJugador;
import M4S10.util.Tarjeta;

public class Jugador extends Persona implements IMovimientoJugador, IAmonestable {
  private int numeroCamiseta;
  private String posicion;
  private double tarjetasAcumuladas = 0;
  private boolean expulsado;

  public Jugador(String nombre, String apellido, int edad, int numeroCamisate, String posicion) {
    super(nombre, apellido, edad);
    this.numeroCamiseta = numeroCamisate;
    this.posicion = posicion;
  }

  public int getNumeroCamiseta() {
    return numeroCamiseta;
  }

  public void setNumeroCamiseta(int numeroCamisate) {
    this.numeroCamiseta = numeroCamisate;
  }

  public String getPosicion() {
    return posicion;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

  @Override
  public void correr() {
    System.out.println(getNombre() + " está corriendo.");

  }

  @Override
  public void quitarBalon() {
    System.out.println(getNombre() + " ha quitado el balón.");

  }

  @Override
  public void saltar() {
    System.out.println(getNombre() + " está saltando.");

  }

  @Override
  public void celebrar() {
    System.out.println(getNombre() + " está celebrando.");

  }

  @Override
  public void hablar(String mensaje) {
    System.out.println(getNombre() + " dice: " + mensaje);

  }

  @Override
  public void anotarGol() {
    System.out.println("El jugador "+ getNumeroCamiseta() + " ha anotado un gol."); 
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
    System.out.println("El Jugador "+getNumeroCamiseta()+" a sido expulsado.");
    return expulsado;
  }

  @Override
  public String toString() {
    return "Jugador -> " + super.toString() + " numero Camiseta: " + numeroCamiseta + ", posicion: " + posicion;
  }

}
