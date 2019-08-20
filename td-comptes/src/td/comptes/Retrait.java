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
public class Retrait extends Operations { // heritage de la classe Operation comme specifié sur le diagramme de classe
// construteur de la super classe
    public Retrait() {
    }

    public Retrait(int numeros, Date dateoperations, double montant) {
        super(numeros, dateoperations, montant);
    }
    
    
    
}
