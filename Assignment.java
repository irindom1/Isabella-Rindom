/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.*;

/**
 * Assignment 1
 * @author isabellarindom
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What type of chips do you want? 1. Ahi or 2. Poi");
// Initialize keyboard scanner to obtain user input
        Scanner keyboard = new Scanner(System.in);
        
        // Obtain user input
        int chipsType = keyboard.nextInt();
        
        // Initialize variable to hold calories per chip
        int caloriesPerChip = 0;
        
        // Determine the calories per chip
        if (chipsType == 1) {
            System.out.println("You chose 1. Ahi");
            
            // 90 chips in a bag, 10 servings in a bag, each serving is 360 calories
            caloriesPerChip = 10 * 360 / 90;
        } else if (chipsType == 2) {
            System.out.println("You chose 2. Poi");
            
            // 88 chips in a bag, 8 servings in a bag, each serving is 550 calories
            caloriesPerChip = 8 * 550 / 88;
        } else { 
            // This is not a valid option
            System.out.println("Choice invalid");
        }
        
        System.out.println();
        // Prompt the user to enter how many chips she ate
        System.out.println("How many did you eat?");
        
        // Obtain user input
        int chipsEaten = keyboard.nextInt();
        
        System.out.println();
        // Print result of calories eaten
        System.out.println("calories consumed: " + (chipsEaten * caloriesPerChip));
   
    }
}