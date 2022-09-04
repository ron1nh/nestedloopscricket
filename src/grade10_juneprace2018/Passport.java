/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade10_juneprace2018;

/**
 *
 * @author Jeani
 */
import javax.swing.*;
public class Passport {
    
    public static void main(String[] args) {
      
        int vaccinated = Integer.parseInt(JOptionPane.showInputDialog("if it is vaccinated = 1 if not unvanccinated = 0"));
        
        if (vaccinated == 1)
        {
         String horsename =JOptionPane.showInputDialog("what is the name of the your little boy sire :)");
         String vet =JOptionPane.showInputDialog("what is the name of the vet");
         String firstname =JOptionPane.showInputDialog("what is the first name of the previous owner");
         String lastname =JOptionPane.showInputDialog("what is the last name of the previous owner ");
         
          char first = firstname.toUpperCase().charAt(0);
         System.out.println("Passport for \t " + horsename);
         System.out.println("Certified by  \t " + vet);
         System.out.println("");
         System.out.println("Previous owner:" + first + "," + lastname);
        }
        else if (vaccinated ==0)
        {
         System.out.println("they dont qaulify for a passport");
        }
        else
        {
          System.out.println("incorrect input,invalid"); 
        }
        
        
        
    }
}
