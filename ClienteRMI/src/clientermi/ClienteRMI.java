/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;



import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
import rmi.RemoteInterface;
/**
 *
 * @author guerson.maldonado
 */
public class ClienteRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // CREAR 2 VENTANAS DE DIALOGO
            String valora = JOptionPane.showInputDialog("Ingrese primer numero");
            String valorb = JOptionPane.showInputDialog("Ingrese primer numero");
            //TRANSFORMAR EL CONTENIDO DE LAS VENTANAS A INT
            int a = Integer.parseInt(valora);
            int b = Integer.parseInt(valorb);
            //REGISTRAR EL SERVIDOR
            //1.- ESTABLECER EL PUERTO DE COMUNICACION
            Registry miregistro = LocateRegistry.getRegistry("127.0.0.1", 1234);
            //2.- ESTABLECER EÑ NOMBRE DEL SERVIDOR
            RemoteInterface s123 = (RemoteInterface) miregistro.lookup("OK");
            //INVOCAR A LA FUNCION E IMPRIMIR EL RESULTADO EN UNA VENTANA
            JOptionPane.showMessageDialog(null, "resultado suma: " + s123.operacion(a, b));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
