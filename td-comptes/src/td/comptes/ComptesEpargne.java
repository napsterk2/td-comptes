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
public class ComptesEpargne extends Comptes
{
private double taux; 

    public ComptesEpargne() {
    }

    public ComptesEpargne(double taux, int code, double solde) {
        super(code, solde);
        this.taux = taux;
    }
    

    @Override
    public void retirer(double montant) {
         if (montant>solde)
        {
             throw new RuntimeException("solde insuffisant");
        }
        
         Retrait r = new Retrait(operations.size()+1, new Date(), montant); 
       operations.add(r);
       solde-=montant;
    }

    @Override
    public void updateSolde() {
      solde =  solde*(1+taux/100);
      
    }
    
}
