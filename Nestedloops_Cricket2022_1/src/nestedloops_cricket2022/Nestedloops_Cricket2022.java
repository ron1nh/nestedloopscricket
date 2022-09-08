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
        
     int gametime = Integer.parseInt(JOptionPane.showInputDialog("enter the number of overs in the game  fdafadsfafaf"));
    int runs;
    int batsman = 11;
    
    
    int team1runs=0;
    int team2runs =0;
    int team1wickets = 0;
    int team2wickets = 0;
    
    int wides;
    int varbowls;
    
    /**
     * the variable  no ball checker is used to so that for the next loop of the code you cant enter in a wicket,
     * because in cricket if there is ever a no ball then the next ball the batsman gets a free hit,meaning he cant 
     * get out.
     */
    int noballchecker=0;  
    
    /**
     * this for loop is for each teams batting and bowling round,
     * so that when one teams finished batting the next team gets to bat or bowl.
     */
     for (int halves_game=1;halves_game<=2;halves_game++)
     {
           int wickets= 0; 
           int noballs = 0;
           int caught =0;
           int bowled = 0;
           int stump= 0;
           int totalruns = 0;
           
           /** 
            * This is the nested loop that is used to loop how many overs there are in the game,
            * what the user entered
            */
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
         runs = Integer.parseInt(JOptionPane.showInputDialog("ERROR enter a whole number please from 0-6 for the runs "));   
       }
       
       /**
        * this is the if statement that checks if there is a no ball or wide,they are both against the rules and add 
        * a run to the opposing team.In cricket if there is a wide the bowler gets an extra ball so that the batsman can
        * face the full six bowls.
        */
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
       * in cricket if there is a no ball or there is a wide it is impossible for it to be a wicket,
       * and in cricket if someone balls a no ball the next bowl the batsman can not get out,as discussed earlier.
       * so ranvar's purpose is that if a wide or no ball is entered the user can't enter in a wicket.
       */
      if (noballchecker>=1)
      {
       ranvar=1;
      }
      
      
    if (ranvar!=1)
    
    {
       String strwicket = JOptionPane.showInputDialog("was there a wicket,type 'yes' to confirm");
       
      /**
       * In cricket there are many ways to get someone 'out',they can either be bowled from the bowler,stumped by the keeper
       * or if the batsman hits the ball and then a fielder catches it,thus I created ways to enter in each way so that the teams
       * can keep track of how they get their wickets.
       */
        if (strwicket.equals("yes"))
        {
         batsman = batsman-1; 
         wickets++;
         String option = JOptionPane.showInputDialog("what was the wicket from bowling? type 'bowled  a stump? type 'stump'/n was it caught? type 'caught' "); 
         
         if (!option.equals("bowled") && !option.equals("stump") && !option.equals("caught"))
         {
          option = JOptionPane.showInputDialog("ERROR pls enter in a valid input \n "
                  + "what was the wicket from bowling? type 'bowled /n a stump? type 'stump'/n was it caught? type 'caught' "); 
         }
           switch (option) {
               case "bowled":
                   bowled++;
                   break;
               case "stump":
                   stump++;
                   break;
               case "caught":
                   caught++;
                   break;
               default:
                   break;
           }
        
        } 
       } 
    
        /** \
         * then every over the runs get added to total runs to keep track of that teams total.
         */
        totalruns = totalruns + runs;
         
        if (batsman<=1)
        {
          overs = gametime;
        }
         
       
        } /**
         * this is the bowls end 
         */
        
         System.out.print("end of over change of bowler");
        }/**
         * this is the overs end 
         */
   
        teams = teams + 1;
        /** 
         * Now this part is just printing the variables that they need to track in cricket 
         * and that all the statistics from each team is visible,I also use it to assign runs to each time and see who is the winner at the end.
         * 
         */
        if (teams==1)
        {
        team1runs = totalruns;
        
        System.out.println(team_name1 + ";Results for batting ");
        System.out.println(totalruns + " this is the total the other team is going to chase good luck!");
        
        System.out.println(team_name2 + ":Results for bowling");
        System.out.println(wickets + " wickets scored");
        System.out.println(noballs + " noballs balled");
        System.out.println(caught  + " batsman caught out");
        System.out.println(stump + " batsman stumped ");
        System.out.println(bowled  + " batsman bowled ");
        }
        else if (teams>1)
        {
        team1runs = totalruns;
        
        System.out.println(team_name2 + ";Results for batting ");
        System.out.println(totalruns + " this is the total that the second team scored ");
        
        System.out.println(team_name1 + ":Results for bowling ");
        System.out.println(wickets + " wickets scored");
        System.out.println(noballs + " noballs balled");
        System.out.println(caught  + " batsman caught out");
        System.out.println(stump + " batsman stumped ");
        System.out.println(bowled  + " batsman bowled ");
        }
        
     }/**
      * this is the halves end,turnover of batsman and bowlers 
      */
    
     /**
      * now when the game is finished the winner is determined by who has more runs and if they equal its a draw.
      */
     System.out.println("");
     
     int difference = Math.abs(team1runs-team2runs);
      System.out.println("DESCISION");
      
     if (team1runs>team2runs)
     {
      System.out.println("The winner is " + team_name1 + " winning by " + difference);
     }
     else if (team1runs==team2runs)
     {
       System.out.println("and the outcome is a draw"); 
     }
     else    
     {
       System.out.println("The winner is " + team_name2 + " winning by " + difference);   
     }
   
    System.out.println("END MATCH");
    
    }  
}
