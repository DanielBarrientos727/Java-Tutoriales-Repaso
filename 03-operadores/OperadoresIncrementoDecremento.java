// Operadores Aritmeticos Combinados

import java.util.Scanner;

public class OperadoresIncrementoDecremento {
    
    public static void main(String[] args) {
        
        /* Operadores de incremento y decremento y forma 1 de hacer 
        int x = 5;
        x++; // x ahora vale 6 y es igual a x = x + 1;
        x--; // x ahora vale 5 y es igual a x = x - 1;
        */
    
        /*ESTA ES OTRA FORMA DE HACER ESTO, EN QUE PUEDE VARIAR EL VALOR DE LA VARIABLE*/
        
        int x =5, y;
        
        // y  = x++; 
                
        y = x++; // El ++ es un sufijo, por lo que primero se incrementa x y luego se asigna el valor de x a y
        y = --x; // El ++ es un prefijo, por lo que primero se asigna el valor de x a y y luego se incrementa x
        
        System.out.println(y);
        System.out.println(x);
        // y vale 5 y x vale 6, porque primero se asigna el valor de x a y y luego se incrementa x
        // Ahora ambos valen 6, porque primero se incrementa x y luego se asigna el valor de x a y
    }
    
}