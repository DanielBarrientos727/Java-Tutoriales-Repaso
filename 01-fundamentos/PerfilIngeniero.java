 /*
  * Perfil de Daniel
  *
  * Este programa practica:
  * comentarios,
  * System.out.println(),
  * tipos de datos,
  * variables
  * y concatenacion.
  *
  * Meta: convertirme en doctor en 2036.
  */

public class PerfilIngeniero {

    public static void main(String[] args) {

        // ============================================================
        // 1. DATOS PERSONALES
        // ============================================================

        String nombre = "Daniel";
        char inicial = 'D';
        boolean estudiante = true;

        System.out.println("========================================");
        System.out.println("        PERFIL DEL FUTURO INGENIERO");
        System.out.println("========================================");

        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es estudiante: " + estudiante);


        // ============================================================
        // 2. TIPOS ENTEROS
        // ============================================================

        byte edad = 19;
        short semestre = 1;
        int anioActual = 2026;
        long metaDoctorado = 2036L;

        System.out.println();
        System.out.println("============= INFORMACION =============");

        System.out.println("Edad: " + edad);
        System.out.println("Semestre actual: " + semestre);
        System.out.println("Ano actual: " + anioActual);
        System.out.println("Ano de doctorado: " + metaDoctorado);


        // ============================================================
        // 3. NUMEROS DECIMALES
        // ============================================================

        float promedio = 4.2f;
        double altura = 1.74;
        double velocidadLuz = 299792458.0;

        System.out.println();
        System.out.println("============= DECIMALES ===============");

        System.out.println("Promedio: " + promedio);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Velocidad de la luz: " + velocidadLuz + " m/s");


        // ============================================================
        // 4. INTEGER
        // ============================================================

        Integer numeroPendiente = null;

        System.out.println();
        System.out.println("============= INTEGER =================");

        System.out.println("Numero pendiente: " + numeroPendiente);


        // ============================================================
        // 5. META PERSONAL
        // ============================================================

        String meta = "Ser doctor en computacion o areas relacionadas";

        System.out.println();
        System.out.println("=============== META ==================");

        System.out.println("Meta: " + meta);
        System.out.println(
                "En " + metaDoctorado + " quiero estar mucho mas cerca de esa meta."
        );
    }
}