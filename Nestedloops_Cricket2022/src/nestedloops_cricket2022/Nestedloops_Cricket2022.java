/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloops_cricket2022;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeani
 */
public class Nestedloops_Cricket2022 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
    int runs;
    int batsman = 11;
    int totalruns = 0;
    int noball;
    int wides;
    int varbowls;
    int wickets= 0;
    int noballs = 0;
    
   
    
         
        for (int overs=0;overs<=20;overs++)  
        {
         varbowls =6;   
         
         for(int bowls=0;bowls<=varbowls;bowls++)
         {
             
        int noballchecker=1;   
        
        runs = Integer.parseInt(JOptionPane.showInputDialog("enter a whole number  from 0-6"));
       if (runs<0 || runs>6)
       {
         runs = Integer.parseInt(JOptionPane.showInputDialog("enter a whole number please from 0-6"));   
       }
       
       String strwides = JOptionPane.showInputDialog("was there a wide? type 'yes' to confirm"); 
       if (strwides.equals("yes"))
       {
        varbowls++;
        runs++;
       }
       
       String strnoball = JOptionPane.showInputDialog("was there a noball? type 'yes' to confirm");
       if (strnoball.equals("yes"))
       {
        noballs++;
        runs++;
        noballchecker++;
       }
      
      /**
       * in cricket if there is a no ball or there is a wide it is impossible for it to be a wicket,and in cricket if someone balls a no ball the next bowl the batsman can not get out
       */
      
    if (!strnoball.equals("yes") || !strwides.equals("yes") && noballchecker==1)
    {       
       String strwicket = JOptionPane.showInputDialog("was there a wicker,type 'yes' to confirm");
       
        if (strwicket.equals("yes"))
        {
         batsman = batsman-1; 
         wickets++;
        }
        
        
       } 
        
        totalruns = totalruns + runs;
         
         
         
         
         
         
         
         }
        
        }
   
    
    
    
    
    
    }  
}
