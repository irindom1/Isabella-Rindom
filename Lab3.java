/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.*;

/**
 * Week3
 * @author IsabellaRindom
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String encryptedMessage = "";
	int key;
	char letter;
                
// Initialize keyboard scanner to obtain user input
    Scanner keyboard = new Scanner(System.in);
		
        System.out.println("Enter a message to Encrypt:");
    // Obtain user input   
        String message = keyboard.nextLine();
		
        System.out.println("Key: ");
    // Obtain user input
        key = keyboard.nextInt();
        
    //Encrypted message
    for(int a = 0; a < message.length(); ++a){
	letter = message.charAt(a);
			
                if(letter >= 'a' && letter <= 'z'){
	    letter = (char)(letter + key);
	            
                if(letter > 'z'){
	    letter = (char)(letter - 'z' + 'a' - 1);
	        }
	            
	        encryptedMessage += letter;
	    }
	    else if(letter >= 'A' && letter <= 'Z'){
	            letter = (char)(letter + key);
	            
                if(letter > 'Z'){
	    letter = (char)(letter - 'Z' + 'A' - 1);
	        }
	            
	        encryptedMessage += letter;
	    }
	    else 
            {
                encryptedMessage += letter;
	    }
            }
    
// Print result of the Encrypted Message
    System.out.println("Encrypted Message = " + encryptedMessage);  
    }
    
}
