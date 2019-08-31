/**
 * week1
 * @author Isabella
 * @date Aug 30, 2019
 */
package isabellalab1;

import java.util.Scanner;

public class Isabellalab1 {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numcanswer=0;
        int numicanswer=0;
        for (int counter = 1; counter <=10; counter ++){
                int a = 1 + (int)(Math.random()*9);
                int b = 1 + (int)(Math.random()*9);
                int guess;
                int count = 0;
                System.out.println("what is the number?");
                System.out.println(a+"+"+b+"=");
                guess=keyboard.nextInt();
                if(guess==a+b){
                System.out.println("correct");
                numcanswer++;}
                    else{
                    System.out.println("incorrect");
                            numicanswer++;}   
        
    }
        System.out.println("you answered " +numcanswer+ " correctly and " +numicanswer+ " incorrectly");
}}
