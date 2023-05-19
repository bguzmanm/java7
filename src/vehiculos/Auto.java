package vehiculos;

public class Auto {
  private String marca;
  private String modelo;
  private String color;
  private float velocidad;

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public float getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(float velocidad) {
    this.velocidad = velocidad;
  }

  public Auto(){

  }
  public Auto(String marca, String color, float velocidad){
    this.marca = marca;
    this.color = color;
    this.velocidad = velocidad;
  }

  public void acelerar(){
    this.velocidad++;
  }

  public void frenar(){
    this.velocidad = 0;
  }

  @Override
  public String toString() {
    return "Auto{" +
            "marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", color='" + color + '\'' +
            ", velocidad=" + velocidad +
            '}';
  }
}
