/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metier;

import javax.ejb.Stateless;

/**
 *
 * @author YanisBach
 */
@Stateless
public class GestionRDVCommercial implements GestionRDVCommercialLocal {

    @Override
    public void creerRDVCom(Long numA, String dateRDVCom, String heureRDVCom, Long idCommercial) {
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
