package vehiculos;

import java.util.ArrayList;

public class Propietario {

  private String nombre;
  private String apellido;
  private String direccion;

  private ArrayList<Auto> miAuto = new ArrayList<Auto>();

  public ArrayList<Auto> getMiAuto() {
    return miAuto;
  }

  public void setMiAuto(Auto miAuto) {
    this.miAuto.add(miAuto);
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Propietario(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    return "Propietario{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", direccion='" + direccion + '\'' +
            ", miAuto=" + miAuto.toString() +
            '}';
  }
}
