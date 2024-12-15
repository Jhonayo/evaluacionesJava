package M4S9.drilling;

public class Zapato {

   private String marca;

  public Zapato(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    return "Zapato -> marca= " + marca;
  }

}

