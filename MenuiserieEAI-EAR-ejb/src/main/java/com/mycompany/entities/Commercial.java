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
public class Commercial implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCommercial;
    private String nomCom;
    private String prenomCom;

    public Commercial(Long idCommercial, String nomCom, String prenomCom) {
        this.idCommercial = idCommercial;
        this.nomCom = nomCom;
        this.prenomCom = prenomCom;
    }

    public Long getIdCommercial() {
        return idCommercial;
    }

    public String getNomCom() {
        return nomCom;
    }

    public String getPrenomCom() {
        return prenomCom;
    }

    public void setIdCommercial(Long idCommercial) {
        this.idCommercial = idCommercial;
    }

    public void setNomCom(String nomCom) {
        this.nomCom = nomCom;
    }

    public void setPrenomCom(String prenomCom) {
        this.prenomCom = prenomCom;
    }

   

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommercial != null ? idCommercial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commercial)) {
            return false;
        }
        Commercial other = (Commercial) object;
        if ((this.idCommercial == null && other.idCommercial != null) || (this.idCommercial != null && !this.idCommercial.equals(other.idCommercial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.Commerciaux[ Identifiant commercial =" + idCommercial + " ]";
    }
    
}
