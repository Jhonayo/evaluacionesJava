package M4.Drilling;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Productos> producto = new ArrayList<>();
    producto.add(new Vegetales("Aji", "V003", 950.0, "28/11/2024", "15/12/2024"));
    producto.add(new Vegetales("Lechuga", "V001", 1500.00, "20/11/2024", "05/12/2024"));
    producto.add(new Vegetales("Tomate", "V002", 2000.00, "22/11/2024", "10/12/2024"));
    producto.add(new Vestuario("Camisa", "C001", 19990.00, "M", "Rojo"));
    producto.add(new Vestuario("Pantalón", "C002", 35490.00, "L", "Azul"));

    CarroCompra carro = new CarroCompra();

    Vendedor vendedor = VendedorFactory.nuevoVendedor();

    MenuVenta menuVenta = new MenuVenta(carro, producto, vendedor);

    menuVenta.mostrarMenu();
  }
}
