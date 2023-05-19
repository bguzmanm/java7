# Clase de Java y POO 
Clase 7

## Persona IMC

Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: id, nombre, edad, rut, genero (H hombre, M mujer, O otro), 
peso y altura. No queremos que se accedan directamente a ellos. 
Piensa que modificador de acceso es el más adecuado, también su tipo. 
Si quieres añadir algún atributo puedes hacerlo.

Por defecto, todos los atributos menos el id serán valores por 
defecto según su tipo (0 números, cadena vacía para String, etc.). 
genero será OTRO por defecto, usa constantes para ello.

Se implantaran varios constructores:

- Un constructor por defecto.
- Un constructor con el nombre, rut, edad y genero, el resto por defecto.
- Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:

- **calcularIMC()**: calculará si la persona esta en su peso ideal (peso en kg/(altura^2 en m)). 
Si esta fórmula devuelve un valor menor que 20, significa que está por debajo de su peso ideal,
la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), 
significa que esta en peso ideal la función devuelve un 0 y si devuelve un valor mayor 
que 25 significa que tiene sobrepeso, la función devuelve un 1. 
Te recomiendo que uses constantes para devolver estos valores.
- **esMayorDeEdad()**: indica si es mayor de edad, devuelve un booleano.
- **comprobarGenero(char genero)**: comprueba que el genero introducido es correcto. 
Si no es correcto, será O. No será visible al exterior.
- **toString()**: devuelve toda la información del objeto.
- **generaId()**: genera un número aleatorio de 8 cifras. 
Este método será invocado cuando se construya el objeto. Puedes dividir el método 
para que te sea más fácil. No será visible al exterior.
- Métodos **set** de cada parámetro, excepto de id.

Ahora, crea una clase ejecutable que haga lo siguiente:

Crea 3 objetos de la clase anterior, el primer objeto obtendrá sus atributos pidiéndolas 
por teclado, el segundo objeto los obtendrá de igual forma, 
menos el peso y la altura y el último por defecto, 
para este último utiliza los métodos set para darle a los atributos un valor.

Luego:

- Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
- Indicar para cada objeto si es mayor de edad.
- Por último, mostrar la información de cada objeto.

Puedes usar métodos en la clase ejecutable, para que os sea más fácil.