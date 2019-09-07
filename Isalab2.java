/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isalab2;

import java.util.*;

/**
 *
 * @author irindom1
 */
public class Isalab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char answer;
       
        do
        {
        System.out.println("Select between Rock, paper scissor ");
        System.out.println("Rock is 1, paper is 2 and scissor is 3");
         Scanner keyboard = new Scanner(System.in);
         int user = keyboard.nextInt();
         keyboard.nextLine(); 

         Random cChoice = new Random();
         int cChoiceRand = cChoice.nextInt(3)+1;
           System.out.println(cChoiceRand);

         if(user<4 && user>0){
          
          if(user== 1)
              System.out.println("you chose: Rock");
          if(user== 2)
              System.out.println("you chose: Paper");
          if(user== 3)
              System.out.println("you chose: Scissor");
          if(cChoiceRand == 1)
              System.out.println("The computer chose:Rock");
          if(cChoiceRand == 2)
              System.out.println("The computer chose: Paper");
          if(cChoiceRand == 3)
              System.out.println("The computer chose: Scissor");
          
          System.out.println("The result is:");
          if(user==cChoiceRand)
              System.out.println("A tie");
          else if(user==cChoiceRand+1)
              System.out.println("You won");
          else if(user==cChoiceRand-1)
              System.out.println("the computer won");
          else if(user==1 && cChoiceRand==3)
              System.out.println("you won");
          else if(user==3 && cChoiceRand==1)
              System.out.println("the computer won");
      }
      if(user>3 || user<1)
            System.out.println("Please choice, 1 for Rock, 2 for paper and 3 for scissor");
      
       System.out.println("Do you wanna play again?");
      String again = keyboard.nextLine();
      answer = again.charAt(0);
       
    }while (answer == 'y'|| answer == 'y');
    } 
             
    }
    

        
       
               
          
       
    
    
