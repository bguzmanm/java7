import personas.Persona;

import java.util.Scanner;

public class Main {

  public static int leeE(String mensaje){
    System.out.println(mensaje);
    Scanner entrada = new Scanner(System.in);
    return entrada.nextInt();
  }

  public static String leeS(String mensaje){
    System.out.println(mensaje);
    Scanner entrada = new Scanner(System.in);
    return entrada.nextLine();
  }

  public static float leeF(String mensaje){
    System.out.println(mensaje);
    Scanner entrada = new Scanner(System.in);
    return entrada.nextFloat();
  }

  /**
   * Crea 3 objetos de la clase anterior, el primer objeto obtendrá sus
   * atributos pidiéndolas por teclado,
   * el segundo objeto los obtendrá de igual forma, menos el peso y la altura
   * y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
   * @param args
   */
  public static void main(String[] args) {

    String nombre = leeS("Ingresa el nombre: ");
    int edad = leeE("Ingresa la edad: ");
    String rut = leeS("Ingresa el rut: ");
    char genero = leeS("Ingresa el genero: O - Otro, H - Masculino, M - Femenino").toUpperCase().toCharArray()[0];
    float peso = leeF("Ingresa tu peso (en kilos):");
    float alto = leeF("Ingresa tu estatura (en metros):");

    Persona p1 = new Persona(nombre, edad, rut, genero, peso, alto);

    nombre = leeS("Ingresa el nombre: ");
    edad = leeE("Ingresa la edad: ");
    rut = leeS("Ingresa el rut: ");
    genero = leeS("Ingresa el genero: O - Otro, H - Masculino, M - Femenino").toUpperCase().toCharArray()[0];

    Persona p2 = new Persona(nombre, edad, rut, genero);

    p2.setAltura(leeF("Ingresa la estatura (en metros) de " + nombre));
    p2.setPeso(leeF("Ingresa el peso (en kilos) de " + nombre));

    Persona p3 = new Persona();

    evaluaPeso(p1);
    evaluaPeso(p2);
    evaluaPeso(p3);

    evaluaMayoriaDeEdad(p1);
    evaluaMayoriaDeEdad(p2);
    evaluaMayoriaDeEdad(p3);

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());

  }


  public static void evaluaMayoriaDeEdad(Persona p){
    if (p.esMayorDeEdad()){
      System.out.println(p.getNombre() + " es mayor de edad");
    } else {
      System.out.println(p.getNombre() + " no es mayor de edad");
    }
  }

  public static void evaluaPeso(Persona p){
    int imc = p.calcularIMC();
    if (imc == p.PESO_ALTO){
      System.out.println(p.getNombre() + " está pasado de su peso ideal");
    } else if (imc == p.PESO_IDEAL){
      System.out.println(p.getNombre() + " está en su peso ideal");
    } else if (imc == p.PESO_BAJO){
      System.out.println(p.getNombre() + " está bajo su peso ideal");
    } else {
      System.out.println(p.getNombre() + " no ingresó sus datos de peso y altura");
    }
  }

}