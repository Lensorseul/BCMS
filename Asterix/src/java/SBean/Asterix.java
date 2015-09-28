/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SBean;

import javax.ejb.Stateless;

/**
 *
 * @author franck
 */
@javax.ejb.Stateless(mappedName = "ejb/Ast", name = "Asterix")
public class Asterix implements AsterixRemote {

    @javax.ejb.EJB(mappedName = "ejb/Obelix", lookup = "ejb/Obelix") ObelixRemote o = null;
    @Override
    
    public void strength() {
        System.out.println("Asterix.strength");
        o.strength();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
