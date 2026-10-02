/*

* Este es un comentario de varias lineas
*
* Quiero ser doctor en 2036
*
* Estoy viendo https://www.youtube.com/watch?v=JOAqpdM36wI&t=4519s
*
* y https://www.youtube.com/watch?v=lWgHvh1bKrA
*

*/

public class helloWorld {

public static void main(String[] args) {

    // ============================================================
    // 1. HOLA MUNDO
    // ============================================================

    // Punto de entrada de Java :3

    System.out.println("Hola mundo desde Java"); // esto es un hola mundo no ves
    System.out.println("Curso java");


    // ============================================================
    // 2. PRINTLN Y COMENTARIOS
    // ============================================================

    // imprime en consola el mensaje Hola mundo

    // println da un salto de linea al final del mensaje

    // Esto es un comentario de una sola linea

    // Copias Sout y ya

    /*
     * Mi nombre es Daniel holis :3
     */


    // ============================================================
    // 3. NÚMEROS ENTEROS
    // ============================================================

    // Estos solo son para enteros

    // ------------------------------------------------------------
    // byte
    // ------------------------------------------------------------

    byte entero = 12;

    System.out.println("numero entero: " + entero);


    // ------------------------------------------------------------
    // short
    // ------------------------------------------------------------

    short enteroMasGrande = 23;

    System.out.println("numero entero mas grande: " + enteroMasGrande);


    // ------------------------------------------------------------
    // int
    // ------------------------------------------------------------

    int enteroAunMasGrande = 123456789;

    System.out.println("numero entero aun mas grande: " + enteroAunMasGrande);


    // ------------------------------------------------------------
    // long
    // ------------------------------------------------------------

    long enteroGigante = 1234567890123456789L;

    System.out.println("numero entero gigante: " + enteroGigante);


    // ============================================================
    // 4. NÚMEROS DECIMALES
    // ============================================================

    // ------------------------------------------------------------
    // float
    // ------------------------------------------------------------

    float decimal = 3.57f;

    System.out.println("Numero decimal: " + decimal);

    // Toca ponerle f al final del numero para que lo reconozca
    // como float, que porqueria


    // ------------------------------------------------------------
    // double
    // ------------------------------------------------------------

    // Ahora bien, por eso no usamos float ya que es incomodo,
    // por ello usaremos SIEMPRE double.

    double decimalNuevo = 2.3467834567856789;

    System.out.println("Este es un numero decimal nuevo: " + decimalNuevo);

    // Double ocupa mucho espacio en memoria, pero, aunque float
    // ocupe menos, es re incomodo


    // ============================================================
    // 5. CARACTERES
    // ============================================================

    // 1 h h w e 7 son caracteres

    char caracter = 'y';

    System.out.println("Caracter: " + caracter);


    // ============================================================
    // 6. BOOLEANOS
    // ============================================================

    Boolean decision = false;

    // Si o no.

    System.out.println("La decision es: " + decision);


    // ============================================================
    // 7. TIPOS DE DATOS NO PRIMITIVOS
    // ============================================================

    // ------------------------------------------------------------
    // Integer
    // ------------------------------------------------------------

    Integer numero = null; // esto esta vacio y int no sirve pa eso y Integer sirve jahah

    // Integer es un tipo de dato no primitivo.

    System.out.println("El numero es: " + numero);


    // ------------------------------------------------------------
    // String
    // ------------------------------------------------------------

    String palabra = "Hola usuario, bienvenido a este archivo de java, como podeis observar, estoy aprediendo Java";

    // String es un tipo de dato no primitivo.
    // Se usan comillas dobles para escribir un String.
    // Las comillas simples se usan para char.

    System.out.println(palabra);


}


}
