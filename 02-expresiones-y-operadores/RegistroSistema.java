import java.util.Scanner;
import javax.swing.JOptionPane;

public class RegistroSistema {

    public static void main(String[] args) {

        // ==========================================
        // ENTRADA DE DATOS CON SCANNER
        // ==========================================

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        double altura;
        float promedio;
        char inicial;
        int ascii;

        System.out.println("=================================");
        System.out.println("       REGISTRO DEL USUARIO");
        System.out.println("=================================");

        System.out.println("Digite su nombre:");
        nombre = entrada.nextLine();

        System.out.println("Digite su edad:");
        edad = entrada.nextInt();

        System.out.println("Digite su altura en metros:");
        altura = entrada.nextDouble();

        System.out.println("Digite su promedio:");
        promedio = entrada.nextFloat();

        entrada.nextLine();

        System.out.println("Digite su inicial:");
        inicial = entrada.nextLine().charAt(0);

        System.out.println("Digite un numero ASCII:");
        ascii = entrada.nextInt();

        // ==========================================
        // CONSTANTE
        // ==========================================

        final int ANO_ACTUAL = 2026;

        // ==========================================
        // OPERACIONES
        // ==========================================

        int nacimiento = ANO_ACTUAL - edad;

        int edadFutura = edad + 5;

        float promedioDoble = promedio * 2;

        double alturaCentimetros = altura * 100;

        char caracterASCII = (char) ascii;

        // ==========================================
        // MOSTRAR DATOS
        // ==========================================

        System.out.println();
        System.out.println("=================================");
        System.out.println("        DATOS DEL USUARIO");
        System.out.println("=================================");

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Promedio: " + promedio);
        System.out.println("Inicial: " + inicial);
        System.out.println("ASCII " + ascii + ": " + caracterASCII);

        System.out.println();
        System.out.println("=================================");
        System.out.println("           CALCULOS");
        System.out.println("=================================");

        System.out.println("Ano de nacimiento aproximado: " + nacimiento);
        System.out.println("Edad dentro de 5 anos: " + edadFutura);
        System.out.println("Promedio multiplicado por 2: " + promedioDoble);
        System.out.println("Altura en centimetros: " + alturaCentimetros);

        // ==========================================
        // ENTRADA DE DATOS CON JOPTIONPANE
        // ==========================================

        String nombreGUI;
        int edadGUI;
        char inicialGUI;
        double alturaGUI;
        float frecuenciaGUI;

        nombreGUI = JOptionPane.showInputDialog(
                "Digite su nombre:"
        );

        edadGUI = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Digite su edad:"
                )
        );

        inicialGUI = JOptionPane.showInputDialog(
                "Digite su inicial:"
        ).charAt(0);

        alturaGUI = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "Digite su altura en metros:"
                )
        );

        frecuenciaGUI = Float.parseFloat(
                JOptionPane.showInputDialog(
                        "Digite la frecuencia de su procesador en GHz:"
                )
        );

        // ==========================================
        // MOSTRAR DATOS CON JOPTIONPANE
        // ==========================================

        JOptionPane.showMessageDialog(
                null,
                "===== DATOS INGRESADOS =====\n\n"
                + "Nombre: " + nombreGUI + "\n"
                + "Edad: " + edadGUI + "\n"
                + "Inicial: " + inicialGUI + "\n"
                + "Altura: " + alturaGUI + " metros\n"
                + "Frecuencia del procesador: "
                + frecuenciaGUI + " GHz"
        );

        entrada.close();
    }
}