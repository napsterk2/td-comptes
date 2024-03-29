/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.comptes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author napster
 */
public abstract class Comptes {
    
    protected int code; 
    
    protected double solde; 
    
    protected List<Operations> operations = new ArrayList<>();

    public Comptes() {
    }

    public Comptes(int code, double solde) {
        this.code = code;
        this.solde = solde;
        
    }
    
    public void verser(double mt)
    { 
       Versement v = new Versement(operations.size()+1, new Date(), mt); // pour enregistrer les informations sur le versements en cour 
       operations.add(v);
       solde+=mt;
        
    }
    
    public abstract void retirer( double montant); // fonction qui sera inplementée dans chacune des classes enfants
    
    public void virement(double montant, Comptes cp2)
    
    {
        retirer(montant);
        cp2.verser(montant);
    }
    
    public double consulterSolde() // methode qui permet d'afficher le solde du compte 
    {
        return this.solde;
    }
    public abstract void updateSolde(); // methode qui permet de mettre à jour le compte! la mise a jour se fait differemment en fonction de a nature du Compte
    
    public List<Operations> getOperation()
    // cette methode va permettre de prendre la main sur les operations dans une mesure de performance des systemes d'information decisionnelle
    { 
        return operations;
    }
    public double totalVersement()
    {
        double somme = 0;
        
        for (Operations o: operations)
        {
             if (o instanceof Versement)
                 somme = somme+o.getMontant(); // methode qui permet de calculer le total des versements 
        }
        
        return somme;
    }
    
     public double totalRetrait()
    {
        double somme = 0;
        
        for (Operations o: operations)
        {
             if (o instanceof Retrait)
                 somme = somme+o.getMontant(); 
        }
        
        // creation de la methode qui permet de calculer le total des retraits 
        return somme;
    }
}
// 