// Operadores Math o mejor dicho Metodos de la clase Math

public class OperadoresMath {

    public static void main(String[] args) {

        double raiz = Math.sqrt(36.56);

        System.out.println("Raiz: " + raiz);

        double base = 5;

        double exponente = 2;

        double resultado = Math.pow(base, exponente);

        System.out.println("Potencia: " + resultado);

        // Math.sqrt() devuelve un double.
        // Math.pow() tambien devuelve un double.

        double numero2 = 3.45;

        long resultadoRedondeado = Math.round(numero2);
        
        //resultado que es una variable ya la use, toca otra

    
            System.out.println("Numero redondeado: " + resultadoRedondeado);
            
            float numero3 = 5.34f;
            int resultadofloat = Math.round(numero3);
            
            System.out.println(resultadofloat);
            
            //Lo rendodea 
            
            double numero4 = Math.random();
            //sale cualquier numero naaha infinito.
            
            System.out.println(numero4);
    }
    
}

