//Entrada de datos usando Scanner

public class  EntradaDatosDouble { 
    
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in); 
        
        double numero;
        
        System.out.println("Digite un numero: ");
        numero = entrada.nextDouble(); 
        
        System.out.println("El numero digitado es: " + numero);
        //double es un tipo de dato que permite almacenar números con decimales, a diferencia de int que solo almacena números enteros, y no se pone . sino , pa separar los decimales
    }
    
}
