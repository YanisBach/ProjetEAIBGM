/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metier;

import javax.ejb.Local;

/**
 *
 * @author YanisBach
 */
@Local
public interface GestionAffaireLocal {
    public void creerAffaire(Long numAffaire, int numClient,String adresseClient);
}
