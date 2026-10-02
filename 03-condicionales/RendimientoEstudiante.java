public class RendimientoEstudiante {

    public static void main(String[] args) {

        double nota = 3.8;

        if (nota >= 5.0) {
            System.out.println("Excelente");

        } else if (nota >= 4.0) {
            System.out.println("Muy bueno");

        } else if (nota >= 3.0) {
            System.out.println("Aprobado");

        } else if (nota >= 2.0) {
            System.out.println("Reprobado");

        } else {
            System.out.println("Muy bajo");
        }

        if (nota >= 2.0 && nota < 3.0) {
            System.out.println("Puede presentar recuperacion");

        } else {
            System.out.println("No puede presentar recuperacion");
        }
    }
}