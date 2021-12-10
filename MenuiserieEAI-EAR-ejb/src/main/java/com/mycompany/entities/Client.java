/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author CharlotteMaurice
 */
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numClient;
    private String adresseA; // adresse de l'affaire, lieu de pose de la menuiserie
    private String adresseC;
    private String mailC;
    private int telephoneC;

    public Client(Long numClient, String adresseA) {
        this.numClient = numClient;
        this.adresseA = adresseA;
    }

    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getNumClient() {
        return numClient;
    }

    public String getAdresseA() {
        return adresseA;
    }

    public String getAdresseClient() {
        return adresseC;
    }

    public String getMailC() {
        return mailC;
    }

    public int getNumT() {
        return telephoneC;
    }

    public void setNumClient(Long numClient) {
        this.numClient = numClient;
    }

    public void setAdresseA(String adresseA) {
        this.adresseA = adresseA;
    }

    public void setAdresseC(String adresseC) {
        this.adresseC = adresseC;
    }

    public void setMailC(String mailC) {
        this.mailC = mailC;
    }

    public void setTelephoneC(int telephoneC) {
        this.telephoneC = telephoneC;
    }
 
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numClient != null ? numClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.numClient == null && other.numClient != null) || (this.numClient != null && !this.numClient.equals(other.numClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.client[ numéro client=" + numClient + " ]";
    }
    
}
