package M4S9.drilling;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("¿Qué tipo de bolsa deseas crear? (1: Zapatos, 2: Poleras): ");
    int tipo = scanner.nextInt();

    System.out.println("¿Cuál es la capacidad de la bolsa? ");
    int capacidad = scanner.nextInt();

    if (tipo == 1) {
      Bolsa<Zapato> bolsaZapatos = new Bolsa<>(capacidad);
      for (int i = 0; i < capacidad; i++) {
        System.out.println("Ingresa la marca del zapato " + (i + 1) + ": ");
        String marca = scanner.next();
        bolsaZapatos.agregarProducto(new Zapato(marca));
      }
      System.out.println("//////////////////////////////////////////////////////");
      System.out.println("Contenido de la bolsa de zapatos:");
      bolsaZapatos.mostrarContenidoBolsa();

    } else if (tipo == 2) {
      Bolsa<Polera> bolsaPoleras = new Bolsa<>(capacidad);
      for (int i = 0; i < capacidad; i++) {
        System.out.println("Ingresa el color de la polera " + (i + 1) + ": ");
        String color = scanner.next();
        bolsaPoleras.agregarProducto(new Polera(color));
      }
      System.out.println("//////////////////////////////////////////////////////");
      System.out.println("Contenido de la bolsa de poleras:");
      bolsaPoleras.mostrarContenidoBolsa();

    } else {
      System.out.println("Opción no válida.");
    }

    scanner.close();

  }
}
