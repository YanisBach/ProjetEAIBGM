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
public class RDVCommercial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCommercial;
    private String dateRDVCom;
    private String heureRDVCom;

    public RDVCommercial(Long idCommercial, String dateRDVCom, String heureRDVCom) {
        this.idCommercial = idCommercial;
        this.dateRDVCom = dateRDVCom;
        this.heureRDVCom = heureRDVCom;
    }

    public Long getIdCommercial() {
        return idCommercial;
    }

    public String getDateRDVCom() {
        return dateRDVCom;
    }

    public String getHeureRDVCom() {
        return heureRDVCom;
    }

    public void setIdCommercial(Long idCommercial) {
        this.idCommercial = idCommercial;
    }

    public void setDateRDVCom(String dateRDVCom) {
        this.dateRDVCom = dateRDVCom;
    }

    public void setHeureRDVCom(String heureRDVCom) {
        this.heureRDVCom = heureRDVCom;
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
    public int hashCode() {
        int hash = 0;
        hash += (idCommercial != null ? idCommercial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RDVCommercial)) {
            return false;
        }
        RDVCommercial other = (RDVCommercial) object;
        if ((this.idCommercial == null && other.idCommercial != null) || (this.idCommercial != null && !this.idCommercial.equals(other.idCommercial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.PlanningCommerciaux[ id commercial=" + idCommercial + " ]";
    }
    
   

    
}
