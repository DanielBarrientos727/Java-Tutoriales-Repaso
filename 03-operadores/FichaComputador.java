public class FichaComputador {

    public static void main(String[] args) {

        int nucleos = 6;

        float frecuencia = 4.1f;

        double precio = 850000.0;

        boolean tieneSSD = true;

        char categoria = 'A';

        String modelo = "HP ProDesk 600 G4";

        long almacenamientoBytes = 256000000000L;

        // Datos del computador
        System.out.println("=============================");
        System.out.println("     FICHA DEL COMPUTADOR");
        System.out.println("=============================");

        System.out.println("Modelo: " + modelo);
        System.out.println("Nucleos: " + nucleos);
        System.out.println("Frecuencia: " + frecuencia + " GHz");
        System.out.println("Precio: $" + precio);
        System.out.println("Tiene SSD: " + tieneSSD);
        System.out.println("Categoria: " + categoria);
        System.out.println("Almacenamiento: " + almacenamientoBytes + " bytes");

        // Operaciones
        int dobleNucleos = nucleos * 2;

        float mitadFrecuencia = frecuencia / 2;

        double descuento = precio * 0.10;

        double precioFinal = precio - descuento;

        long almacenamientoGB = almacenamientoBytes / 1000000000L;

        int residuo = nucleos % 4;

        System.out.println();
        System.out.println("--- CALCULOS ---");

        System.out.println("Doble de nucleos: " + dobleNucleos);
        System.out.println("Mitad de frecuencia: " + mitadFrecuencia + " GHz");
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("Almacenamiento aproximado: " + almacenamientoGB + " GB");
        System.out.println("Residuo de nucleos / 4: " + residuo);
    }
}