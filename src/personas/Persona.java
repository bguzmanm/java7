package personas;

public class Persona {

  public final char GENERO_OTRO = 'O';
  public final char GENERO_MASCULINO = 'H';
  public final char GENERO_FEMENINO = 'M';
  public final int PESO_BAJO = -1;
  public final int PESO_IDEAL = 0;
  public final int PESO_ALTO = 1;
  public final int SIN_DATOS_IMC = -2;


  private int id;
  private String nombre = "";
  private int edad = 0;
  private String rut = "";
  private char genero = GENERO_OTRO;
  private float peso = 0;
  private float altura = 0;

  public Persona() {
    this.id = generaId();
  }

  public Persona(String nombre, int edad, String rut, char genero) {
    this();
    this.nombre = nombre;
    this.edad = edad;
    this.rut = rut;
    if (comprobarGenero(genero)){
      this.genero = genero;
    }
  }

  public Persona(String nombre, int edad, String rut, char genero, float peso, float altura) {
    this(nombre, edad, rut, genero);
    this.peso = peso;
    this.altura = altura;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getRut() {
    return rut;
  }

  public void setRut(String rut) {
    this.rut = rut;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    if (comprobarGenero(genero)){
      this.genero = genero;
    }
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  /**
   * calculará si la persona esta en su peso ideal (peso en kg/(altura^2 en m)).
   * Si esta fórmula devuelve un valor menor que 20,
   * significa que está por debajo de su peso ideal, la función devuelve un -1,
   * si devuelve un número entre 20 y 25 (incluidos), significa que esta en peso ideal la función devuelve un 0
   * y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
   */
  public int calcularIMC(){
    if (this.peso > 0 && this.altura > 0) {
      //float imc = peso / (altura*altura);
      double imc = peso / Math.pow(altura, 2);
      if (imc < 20){
        return PESO_BAJO;
      }

      if (imc >= 20 && imc <= 25){
        return PESO_IDEAL;
      }

      return PESO_ALTO;
    }
    return SIN_DATOS_IMC;
  }

  /**
   * indica si es mayor de edad, devuelve un booleano.
   * @return si es o no mayor de edad
   */
  public boolean esMayorDeEdad(){
    return edad > 17;
  }

  /**
   * comprueba que el genero introducido es correcto.
   * Si no es correcto, será O. No será visible al exterior.
   * @param genero
   * @return 0 si no es correcto
   */
  private boolean comprobarGenero(char genero){
    /*if (genero == GENERO_OTRO || genero == GENERO_MASCULINO || genero == GENERO_FEMENINO) {
      return true;
    }

    return false;*/

    return genero == GENERO_OTRO || genero == GENERO_MASCULINO || genero == GENERO_FEMENINO;
  }

  @Override
  public String toString() {
    return "Persona{" +
            ", id=" + id +
            ", nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", rut='" + rut + '\'' +
            ", genero=" + genero +
            ", peso=" + peso +
            ", altura=" + altura +
            '}';
  }

  /**
   * genera un número aleatorio de 8 cifras. Este método será invocado cuando
   * se construya el objeto.
   * @return número aleatorio de 8 cifras
   */
  private int generaId(){
    return (int) (Math.random() * 89999999) + 10000000;
  }
}
