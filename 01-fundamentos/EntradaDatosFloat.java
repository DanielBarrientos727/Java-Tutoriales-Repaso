//Entrada de datos usando Scanner

public class  EntradaDatosFloat { 
    
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in); 
        
        float numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextFloat(); 
        
        System.out.println("El numero digitado es: " + numero);
        //float es un tipo de dato que permite almacenar números con decimales, a diferencia de int que solo almacena números enteros, y no se pone . sino , pa separar los decimales
    }
    
}
