package Servidor;

import java.rmi.server.UnicastRemoteObject;
import rmi.RemoteInterface;

public class ServerImplements extends UnicastRemoteObject implements RemoteInterface{
    
    //PARA DAR SOPORTE AL throws eXCEPTION
    public ServerImplements () throws  Exception{
        
    }
    //DESARROLLO DE LA FUNCION A SER DICTRIBUIDA
     @Override
     public int operacion(int x, int y) throws Exception{
         return x+y;
     }
    
}


