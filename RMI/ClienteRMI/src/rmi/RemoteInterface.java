/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
        
public interface RemoteInterface extends Remote{
    
    public int operacion (int x, int y) throws Exception;
    
}
