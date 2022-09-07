/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloops_cricket2022;

import javax.swing.JOptionPane;

/**
 *
 * @author Ronin henning 
 */
public class Nestedloops_Cricket2022 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
     
     String team_name1 = JOptionPane.showInputDialog("What is the name of team 1");
     String team_name2 = JOptionPane.showInputDialog("What is the name of team 2");
     
     int teams=0;
        
     int gametime = Integer.parseInt(JOptionPane.showInputDialog("enter the number of overs in the game  "));
    int runs;
    int batsman = 11;
    
    
    int team1runs=0;
    int team2runs =0;
    int team1wickets = 0;
    int team2wickets = 0;
    
    int wides;
    int varbowls;
    
    int noballchecker=0;  
    
     for (int halves_game=0;halves_game<=2;halves_game++)
     {
           int wickets= 0; 
           int noballs = 0;
           int caught =0;
           int bowled = 0;
           int stump= 0;
           int totalruns = 0;
        for (int overs=0;overs<gametime;overs++)  
        {
         varbowls =6;   
         
         for(int bowls=1;bowls<=varbowls;bowls++)
         {
          int ranvar=0;
             if (noballchecker > 0 )
             {
         noballchecker = noballchecker - 1;
             }
             
             
        runs = Integer.parseInt(JOptionPane.showInputDialog("enter a whole number  from 0-6 for the runs "));
       if (runs<0 || runs>6)
       {
         runs = Integer.parseInt(JOptionPane.showInputDialog("enter a whole number please from 0-6 for the runs "));   
       }
       
       
       String stroption = JOptionPane.showInputDialog("was there a wide or a no ball type 'noball' or 'wide' to choose,or type anything else if not  "); 
       if (stroption.equals("wide"))
       {
        varbowls++;
        runs++;
        ranvar=1;
        
       }
       else if (stroption.equals("noball"))
       {
        noballs++;
        runs++;
        noballchecker=2;
        ranvar=1;
       }
      
      /**
       * in cricket if there is a no ball or there is a wide it is impossible for it to be a wicket,and in cricket if someone balls a no ball the next bowl the batsman can not get out
       */
      if (noballchecker>=1)
      {
       ranvar=1;
      }
      
    if (ranvar!=1)
    
    {       
       String strwicket = JOptionPane.showInputDialog("was there a wicket,type 'yes' to confirm");
       
      
        if (strwicket.equals("yes"))
        {
         batsman = batsman-1; 
         wickets++;
         String option = JOptionPane.showInputDialog("what was the wicket from bowling? type 'bowled /n a stump? type 'stump'/n was it caught? type 'caught' "); 
         

         if (option.equals("bowled"))
         {
          bowled++;  
         }
         else if (option.equals("stump"))
         {
          stump++;   
         }
         else if (option.equals("caught"))
         {
          caught++;  
         }
         else 
         {
             
         }
        } 
       } 
    
        
        totalruns = totalruns + runs;
         
        if (batsman<=1)
        {
          overs = gametime;
        }
         
       
        } /**
         * this is the bowls end 
         */
        
         System.out.print("end of ever change of bowler");
        }/**
         * this is the overs end 
         */
   
        teams = teams + 1;
        
        if (teams==1)
        {
        team1runs = totalruns;
        
        System.out.println(team_name1 + ";Results");
        System.out.println(totalruns + "this is the total the other team is going to chase good luck!");
        
        System.out.println(team_name2 + ":Results");
        System.out.println(wickets + " wickets scored");
        System.out.println(noballs + " noballs balled");
        System.out.println(caught  + " batsman caught out");
        System.out.println(stump + " batsman stumped ");
        
        }
        else if (teams>1)
        {
        team1runs = totalruns;
        
        System.out.println(team_name2 + ";Results");
        System.out.println(totalruns + "this is the total that the second team scored ");
        
        System.out.println(team_name1 + ":Results");
        System.out.println(wickets + " wickets scored");
        System.out.println(noballs + " noballs balled");
        System.out.println(caught  + " batsman caught out");
        System.out.println(stump + " batsman stumped ");
        }
        
     }/**
      * this is the halves end,turnover of batsman and bowlers 
      */
    
     System.out.println("");
     
     int difference = Math.abs(team1runs-team2runs);
      System.out.println("DESCISION");
      
     if (team1runs>team2runs)
     {
      System.out.println("The winner is " + team_name1 + "winning by " + difference);
     }
     else if (team1runs==team2runs)
     {
       System.out.println("and the outcome is a draw"); 
     }
     else    
     {
       System.out.println("The winner is " + team_name2 + "winning by " + difference);   
     }
   
    System.out.println("END MATCH");
    
    }  
}
