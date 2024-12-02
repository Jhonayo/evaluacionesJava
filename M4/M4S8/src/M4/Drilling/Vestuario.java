package M4.Drilling;

public class Vestuario extends Productos {

  private String talla;
  private String color;


  public Vestuario(String nombre, String codigo, Double precio, String talla, String color) {
    super(nombre, codigo, precio);
    this.talla = talla;
    this.color = color;
  }

  public String getTalla() {
    return talla;
  }

  public void setTalla(String talla) {
    this.talla = talla;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("-. Prenda: " + nombre + "\ncodigo: " + codigo+ " precio: "+ precio);
    System.out.println("Talla: " + talla + " color: " + color);
    
  }


}
