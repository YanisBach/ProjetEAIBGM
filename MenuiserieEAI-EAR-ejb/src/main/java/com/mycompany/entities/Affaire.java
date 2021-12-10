
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
public class Affaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numA;
    private int numClient;
    private String adresseA;
    private String etatA;
    private int montantA;
    private int sommePayee;
    private String referenceCatalogue;
    private String coteExactes;
    private int montantAEncaisser;
   

    public Affaire(Long numA, int numClient, String adresseA, String etatA, int montantA) {
        this.numA = numA;
        this.numClient = numClient;
        this.adresseA = adresseA;
        this.etatA = etatA;
        this.montantA = montantA;
    }

    public Affaire(Long numAffaire, int numClient, String adresseA) {
        this.numA = numAffaire;
        this.numClient = numClient;
        this.adresseA = adresseA;
    }

    public void renseignerAffaire(Long numA, int montantA, String referenceCatalogue, String coteExactes){
        this.numA = numA;
        this.montantA = montantA;
        this.referenceCatalogue = referenceCatalogue;
        this.coteExactes = coteExactes;

    }
    
    public void cloturerAffaire(Long numA, String etatA){
        this.numA = numA;
        this.etatA = "terminée";
    }
    
    public void majEtatAffaire(Long numA, String etatA){
        this.numA = numA;
        this.etatA = etatA; 
    }
    
    public void deposerCheque(Long numA, int sommePayee){
        this.numA = numA;
        this.sommePayee = sommePayee;
    }
    
    public void encaisser(Long numA, int montantAEncaisser){
        this.numA = numA;
        this.montantAEncaisser = montantAEncaisser;
    }
    
    public void commanderMenuiserie(Long numA, String referenceCatalogue, int cotesExactes){
       this.numA = numA;
        this.referenceCatalogue = referenceCatalogue;
        this.coteExactes = coteExactes;
    }
    /*public class ExceptionNegociationsNonAbouties{
        public static void main(String[] args){
            
        try{
            
        }
        catch{
       
        }
        }
   } */
    
    
    
    
    
    public Long getNumA() {
        return numA;
    }

    public int getNumClient() {
        return numClient;
    }

    public String getAdresseA() {
        return adresseA;
    }

    public String getEtatA() {
        return etatA;
    }

    public int getMontantA() {
        return montantA;
    }

    public void setNumA(Long numA) {
        this.numA = numA;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public void setAdresseA(String adresseA) {
        this.adresseA = adresseA;
    }

    public void setEtatA(String etatA) {
        this.etatA = etatA;
    }

    public void setMontantA(int montantA) {
        this.montantA = montantA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numA != null ? numA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affaire)) {
            return false;
        }
        Affaire other = (Affaire) object;
        if ((this.numA == null && other.numA != null) || (this.numA != null && !this.numA.equals(other.numA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entities.Affaire[ num affaire =" + numA + " ]";
    }
    
}
