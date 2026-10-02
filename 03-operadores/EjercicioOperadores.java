import java.util.Scanner;

public class EjercicioOperadores {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        float numero1, numero2, suma, resta, mult, div, resto;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextFloat();
        
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextFloat();
        
        // realizamos las operaciones
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;
        
        //imprimimos los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + mult);
        System.out.println("La división es: " + div);
        System.out.println("El resto es: " + resto);
    
    }
    
}
