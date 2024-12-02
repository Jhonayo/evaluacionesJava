package M4.Drilling;

import java.util.ArrayList;
import java.util.List;

public class CarroCompra {
  private List<Productos> productos;
  private final int maximoProductos = 10;

  public CarroCompra() {
    this.productos = new ArrayList<>();
  }

  public void agregarProducto(Productos producto) {
    if (productos.size() < maximoProductos) {
      productos.add(producto);

    } else {
      System.out.println("El carro de compra esta lleno");
    }
  }

  public void mostrarCarro() {
    if (productos.isEmpty()) {
      System.out.println("El carrito esta vacio");
    } else {
      System.out.println("/////////////////////////////////");
      System.out.println("Productos en el carro de compra: ");
      for (Productos productos : productos) {
        productos.mostrarDetalles();
      }
       System.out.println("/////////////////////////////////");  
    }

  }
  public List<Productos> getProductos(){
    return productos;
  }
}
