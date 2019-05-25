package Servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainServer {

    public static void main(String[] args) {
        // INICIALIZAR EL SERVIDOR

        try {
            //CERRAR EL PUERTO DE COMUNICACIÓN
            Registry miregistro = LocateRegistry.createRegistry(1234);
            //REGISTRAR EL OBJETO DISTRIBUIDO
            miregistro.rebind("OK", new ServerImplements());
            System.err.println("SERVIDOR ENCENDIDO");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
