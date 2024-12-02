package M4.Drilling;

import java.util.List;
import java.util.Scanner;

public class MenuVenta implements IOperacionVenta {

  private CarroCompra carro;
  private List<Productos> productos;
  private Vendedor vendedor;

  public MenuVenta(CarroCompra carro, List<Productos> productos, Vendedor vendedor) {
    this.carro = carro;
    this.productos = productos;
    this.vendedor = vendedor;
  }

  public void mostrarMenu() {
    Scanner sc = new Scanner(System.in);
    int opcion = 0;

    do {
      System.out.println("------------------------------------");
      System.out.println("Menu de compra");
      System.out.println("------------------------------------");
      System.out.println("Seleccione que desea hacer");
      System.out.println("1. Listar productos");
      System.out.println("2. Agregar producto al carrito de compra");
      System.out.println("3. Mostrar Carrito de compra");
      System.out.println("4. Pagar");
      System.out.println("5. Salir");

      // opcion = sc.nextInt();
      // sc.nextLine();
      String input = sc.nextLine();
      try {
        opcion = Integer.parseInt(input); // Convertir la entrada a un número entero
      } catch (NumberFormatException e) {
        System.out.println("Entrada no válida. Por favor ingrese un número.");
        continue; // Volver a mostrar el menú si la entrada no es válida
      }
      switch (opcion) {
        case 1:
          listarProductos();
          break;
        case 2:
          agregarAlCarrito();
          break;
        case 3:
          mostrarCarrito();
          break;
        case 4:
          pagar();
          break;
        case 5:
          System.out.println("Saliendo ....");
          break;
        default:
          System.out.println("La opcion selecionada no es valida!");
          break;

      }
    } while (opcion != 5);
    sc.close();
  }

  @Override
  public void listarProductos() {
    System.out.println("Productos disponibles:");
    for (Productos producto : productos) {
      producto.mostrarDetalles();
    }
    System.out.println();
  }

  @Override
  public void agregarAlCarrito() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa el código del producto a agregar: ");
    String codigo = sc.nextLine();
    for (Productos producto : productos) {
      if (producto.getCodigo().equalsIgnoreCase(codigo)) {
        carro.agregarProducto(producto);
        System.out.println("Producto agregado al carrito.\n");
        System.out.println("---------------------------------------------");
        return;
      }
    }
    sc.close();
    System.out.println("Producto no encontrado.");
  }

  @Override
  public void mostrarCarrito() {
    carro.mostrarCarro();
  }

  @Override
  public void pagar() {
    Venta venta = new Venta(vendedor, carro.getProductos(), 0.15);
    venta.mostrarResumen();
  }
}
