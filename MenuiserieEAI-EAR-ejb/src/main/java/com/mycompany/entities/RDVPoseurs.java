/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entities;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author CharlotteMaurice
 */
@Entity
public class RDVPoseurs implements Serializable{
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEquipePoseur;
    private String dateRDVPose;
    private String heureRDVPose;

    public RDVPoseurs(Long id, String dateRDVPose, String heureRDVPose) {
        this.idEquipePoseur = idEquipePoseur;
        this.dateRDVPose = dateRDVPose;
        this.heureRDVPose = heureRDVPose;
    }

    public Long getIdEquipePoseur() {
        return idEquipePoseur;
    }

    public String getDateRDVPose() {
        return dateRDVPose;
    }

    public String getHeureRDVPose() {
        return heureRDVPose;
    }

    public void setIdEquipePoseur(Long id) {
        this.idEquipePoseur = idEquipePoseur;
    }

    public void setDateRDVPose(String dateRDVPose) {
        this.dateRDVPose = dateRDVPose;
    }

    public void setHeureRDVPose(String heureRDVPose) {
        this.heureRDVPose = heureRDVPose;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipePoseur != null ? idEquipePoseur.hashCode() : 0);
        return hash;
    }

    /*public class ExceptionAucunCreneauDisponible{
        public static void main(String[] args){
            
        try{
            
        }
        catch{
       
        }
        }
   } */
    
    
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RDVPoseurs)) {
            return false;
        }
        RDVPoseurs other = (RDVPoseurs) object;
        if ((this.idEquipePoseur == null && other.idEquipePoseur != null) || (this.idEquipePoseur != null && !this.idEquipePoseur.equals(other.idEquipePoseur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.PlanningPoseur[ id=" + idEquipePoseur + " ]";
    }
    
}
