package M4.Drilling;

import java.util.List;

public class Venta {

  private Vendedor vendedor;
  private List<Productos> producto;
  private double ganacia;

  public Venta(Vendedor vendedor, List<Productos> producto, double ganacia) {
    this.vendedor = vendedor;
    this.producto = producto;
    this.ganacia = ganacia;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public double getGanacia() {
    return ganacia;
  }

  public double calcularTotal() {
    double total = 0;
    for (Productos productos : producto) {
      total += productos.getPrecio();
    }
    return total;
  }

  public void mostrarResumen() {
    System.out.println("/////////////////////////////////");
    System.out.println("-. Vendedor: " + vendedor);
    System.out.println("Productos en la venta");
    for (Productos productos : producto) {
      productos.mostrarDetalles();
    }
    System.out.println("Total de la compra: $:" + calcularTotal());
    System.out.println("/////////////////////////////////");
  }
}
