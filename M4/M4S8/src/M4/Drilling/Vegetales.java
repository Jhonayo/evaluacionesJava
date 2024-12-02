package M4.Drilling;

public class Vegetales extends Productos {
  private String fechaEnvasado;
  private String fechaCaducidad;



  public Vegetales(String nombre, String codigo, Double precio, String fechaEnvasado, String fechaCaducidad) {
    super(nombre, codigo, precio);
    this.fechaEnvasado = fechaEnvasado;
    this.fechaCaducidad = fechaCaducidad;
  }

  public String getFechaEnvasado() {
    return fechaEnvasado;
  }

  public void setFechaEnvasado(String fechaEnvasado) {
    this.fechaEnvasado = fechaEnvasado;
  }

  public String getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(String fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

  @Override
  public void mostrarDetalles() {
    System.out.println("-. Vegetal: " + nombre + "\ncodigo: "+ codigo +" precio: " + precio);
    System.out.println("Fecha de envasado: " + fechaEnvasado + " / Fecha de caducidad: " + fechaCaducidad);
    
  }

 

}
