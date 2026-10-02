public class Planeta {

    public static void main(String[] args) {

        String nombre = "Marte";

        int lunas = 2;

        double distanciaSol = 227.9;

        float temperatura = -63.0f;

        char tipo = 'R';

        boolean tieneAtmosfera = true;

        long diametro = 6779000L;

        System.out.println("===== DATOS DEL PLANETA =====");

        System.out.println("Nombre: " + nombre);
        System.out.println("Lunas: " + lunas);
        System.out.println("Distancia al Sol: " + distanciaSol + " millones de km");
        System.out.println("Temperatura media: " + temperatura + " °C");
        System.out.println("Tipo: " + tipo);
        System.out.println("Tiene atmosfera: " + tieneAtmosfera);
        System.out.println("Diametro: " + diametro + " metros");
    }
}