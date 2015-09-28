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
@javax.ejb.Stateless(mappedName = "ejb/Obelix", name = "Obelix")
public class Obelix implements ObelixRemote {

    @Override
    public void strength() {
        System.out.println("Obelix.strength");
    }
}