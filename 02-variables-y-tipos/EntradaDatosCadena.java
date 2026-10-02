import java.util.Scanner;

public class EntradaDatosCadena {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cadena;

        System.out.println("Digite una cadena: ");

        cadena = entrada.nextLine();

        System.out.println("La cadena digitada es: " + cadena);

    }

}