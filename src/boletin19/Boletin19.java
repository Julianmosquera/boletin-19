package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class Boletin19 {

    public static void main(String[] args) {
        Buzon b1 = new Buzon();
        int respuesta;
        b1.cargarArray();

        do {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones :  1   2  3  4  5  6  7  "));
            switch (respuesta) {
                case 1:
                    System.out.println("Numero de correos en total: " + b1.numeroDeCorreo());
                    break;

                case 2:
                    if (b1.porLer() == false) {
                        System.out.println("Quedan mensajes sin leer ");
                    } else {
                        System.out.println("Todos los mensajes estan leidos");
                    }
                    break;
                case 3:

                    System.out.println(b1.amosaPrimerNoLeido());
                    break;

                case 4:
                    b1.amosarTodo();
                    break;
                case 5:
                    b1.enGade(new Correo("nuevo correo", true));
                    break;
                case 6:
                    b1.eliminar(2);
                    break;

                case 7:
                    System.out.println("Saliendo del programa");
                    break;

            }
        } while (respuesta != 7);
        System.exit(0);

    }
}
  
    


