/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixobelix;

import SBean.AsterixRemote;

/**
 *
 * @author franck
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            javax.naming.Context jndi_context = new javax.naming.InitialContext();
            AsterixRemote ar = (AsterixRemote) jndi_context.lookup("ejb/Ast");
            ar.strength();
            if (jndi_context != null) {
                jndi_context.close();
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }
    
}
