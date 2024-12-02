package M4.Drilling;

import java.util.Scanner;

public class VendedorFactory {

  public static Vendedor nuevoVendedor() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Buen dia...");
    System.out.println("Ingrese su nombre: ");
    String nombre = sc.nextLine();
    System.out.println("Ingrese su rut: ");
    String rut = sc.nextLine();
    return new Vendedor(nombre, rut);
  }
}
