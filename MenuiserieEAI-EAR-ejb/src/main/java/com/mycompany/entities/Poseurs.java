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
public class Poseurs implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEquipePoseur;
    private String nomEquipePoseur;

    public Poseurs(Long idEquipePoseur, String nomEquipePoseur) {
        this.idEquipePoseur = idEquipePoseur;
        this.nomEquipePoseur = nomEquipePoseur;
    }


    public Long getIdEquipePoseur() {
        return idEquipePoseur;
    }

    public String getNomEquipePoseur() {
        return nomEquipePoseur;
    }

    public void setIdEquipePoseur(Long idEquipePoseur) {
        this.idEquipePoseur = idEquipePoseur;
    }

    public void setNomEquipePoseur(String nomEquipePoseur) {
        this.nomEquipePoseur = nomEquipePoseur;
    }
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipePoseur != null ? idEquipePoseur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poseurs)) {
            return false;
        }
        Poseurs other = (Poseurs) object;
        if ((this.idEquipePoseur == null && other.idEquipePoseur != null) || (this.idEquipePoseur != null && !this.idEquipePoseur.equals(other.idEquipePoseur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.Poseurs[ id équipe de poseurs =" + idEquipePoseur + " ]";
    }
    
}
