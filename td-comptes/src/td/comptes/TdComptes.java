/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.comptes;

/**
 *
 * @author napster
 */
public class TdComptes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereo
      Comptes cp = new ComptesCourant(5000,1, 8000);
      
      Comptes cp2 = new ComptesEpargne(5.5, 2, 150000);
      
      cp.verser(45000);
      
        System.out.println(" le solde de cp est "+cp.consulterSolde());
      
      
      
    }
    
}
