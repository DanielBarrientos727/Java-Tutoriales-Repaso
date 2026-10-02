//Entrada de datos usando Scanner

public class EntradaDatos { 
    
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in); // Creamos un objeto de la clase Scanner para poder leer datos desde la entrada 
        //Alli podemos guardar el valor que ingrese el usuario en una variable y ya
        
        int numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt(); // Guarda en la variable numero el número entero que introduce el usuario por teclado
        // O sea, pues nextInt es pa que coja el numero que el usuario introduzca  con un espacio  de memoria y no se va a mover hasta que digite un numero
        
        System.out.println("El numero digitado es: " + numero);
    }
    
}
