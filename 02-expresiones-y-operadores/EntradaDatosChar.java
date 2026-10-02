import java.util.Scanner;

public class EntradaDatosChar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char letra;

        System.out.println("Digite un caracter: ");
        letra = entrada.nextLine().charAt(0);

        System.out.println("El caracter digitado es: " + letra);

    }

}

//Si coloco digamos, esto HOLAAAA solo guardar H y ya