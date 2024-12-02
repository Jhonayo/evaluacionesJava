package M4.Drilling;

abstract class Productos {
  String nombre;
  String codigo;
  Double precio;


  public Productos(String nombre, String codigo, Double precio) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.precio = precio;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public abstract void mostrarDetalles();

}
