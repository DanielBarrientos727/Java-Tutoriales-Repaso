// Operadores Aritmeticos Combinados

import java.util.Scanner;

public class OperadoresAritmeticosCombinados {
    
    public static void main(String[] args) {
    int numero = 10;
    
    
    //Pero ahora quiero que numero valga 15
    
    numero = numero + 5; //numero ahora vale 15
    
    //pa resumir
    
    numero += 5; //numero ahora vale 20 y es igual a numero = numero + 5;
    
    numero -= 5; //numero ahora vale 15 y es igual a numero = numero - 5;
    
    numero *= 2; //numero ahora vale 30 y es igual a numero = numero * 2;
    
    numero /= 3; //numero ahora vale 10 y es igual a numero = numero / 3;
    
    numero %= 3; //numero ahora vale 1 y es igual a numero = numero % 3;
    
    System.out.println("numero: " + numero);

    }
    
}