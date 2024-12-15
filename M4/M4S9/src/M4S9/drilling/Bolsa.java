package M4S9.drilling;

import java.util.ArrayList;
import java.util.List;

class Bolsa<T> {

  private List<T> items;
  private int capacidadMaxima;
  public Bolsa(int capacidadMaxima) {
    this.items = new ArrayList<>();
    this.capacidadMaxima = capacidadMaxima;
  }
  public List<T> getItems() {
    return items;
  }
  public void setItems(List<T> items) {
    this.items = items;
  }
  public int getCapacidadMaxima() {
    return capacidadMaxima;
  }
  public void setCapacidadMaxima(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
  }
public void agregarProducto(T item){
    if(items.size()<capacidadMaxima){
      items.add(item);
    }else{
      System.out.println("La bolsa ya tiene su capacidad maxima");
    }
  }
public void mostrarContenidoBolsa(){
    for (T t : items) {
      System.out.println(t);
      
    }
    
  }
   
}
