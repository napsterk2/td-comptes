/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.comptes;

import java.util.Date;

/**
 *
 * @author napster
 */
public class Operations {
    
    private int numeros;
    private Date dateoperations;
    private double montant;
    public Operations()
    {
        
    }

    public Operations(int numeros, Date dateoperations, double montant) {
        this.numeros = numeros;
        this.dateoperations = dateoperations;
        this.montant = montant;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public Date getDateoperations() {
        return dateoperations;
    }

    public void setDateoperations(Date dateoperations) {
        this.dateoperations = dateoperations;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    
    
}
