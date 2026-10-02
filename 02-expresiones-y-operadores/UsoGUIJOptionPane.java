import javax.swing.JOptionPane;

public class UsoGUIJOptionPane {

public static void main(String[] args) {

        String cadena;

        int entero;

        char letra;

        double decimal;

        float decimal2;

        // No me habia percatado que solo String va con letra inicial con Mayuscula,
        // y los demas con minuscula, por eso me daba error al compilar XD

        cadena = JOptionPane.showInputDialog("Digite por favor una cadena: ");

        // Input es entrada, por eso copia lo que escribimos, digamos "hola" y se guarda en cadena.

        // entero = JOptionPane.showInputDialog("Digite por favor un numero entero: ");

        // da error ya que JOptionPane.showInputDialog devuelve un String,
        // y no un int, por eso hay que convertirlo a int con Integer.parseInt

        entero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite por favor un numero entero: ")
        );

        // letra = JOptionPane.showInputDialog("Digite por favor un caracter: ")

        // da error ya que JOptionPane.showInputDialog devuelve un String,
        // y no un char, por eso hay que convertirlo a char con charAt(0)
        // para obtener el primer caracter del String

        letra = JOptionPane.showInputDialog(
                "Digite por favor un caracter: "
        ).charAt(0);

        // decimal = JOptionPane.showInputDialog("Digite por favor un numero decimal: ");

        // da error ya que JOptionPane.showInputDialog devuelve un String,
        // y no un double, por eso hay que convertirlo a double con Double.parseDouble

        decimal = Double.parseDouble(
                JOptionPane.showInputDialog("Digite por favor un numero decimal: ")
        );

        decimal2 = Float.parseFloat(
                JOptionPane.showInputDialog(
                        "Digite por favor un numero decimal (float): "
                )
        );
        
        //ShowMessageDialog es para mostrar un mensaje en una ventana emergente
        //ShowInputDialog para ingresar datos en una ventana emergente

        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);

        JOptionPane.showMessageDialog(null, "El caracter es: " + letra);

        JOptionPane.showMessageDialog(null, "El numero decimal es: " + decimal);

        JOptionPane.showMessageDialog(null, "El numero decimal (float) es: " + decimal2);

    }

}