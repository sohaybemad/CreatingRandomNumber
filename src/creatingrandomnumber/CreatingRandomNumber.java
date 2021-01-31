
package creatingrandomnumber;

import java.util.Scanner;


public class CreatingRandomNumber {

    
    public static void main(String[] args) {
        
         //this program to create a random number
        
          Scanner input = new Scanner(System.in);
     
     System.out.println("enter your guess");
     double guess = input.nextDouble();
     int random_number = (int)(Math.random()*100);
     
     if(guess==random_number)
     {
         System.out.println("your guess is correct");
     }   
     else if(guess >= random_number)
     {    System.out.println("your guess greater than the correct");
          System.out.println("the correct number is " + random_number);
     }
          else  
     { System.out.println("your guess is less than the correct");
         System.out.println("the correct number is " + random_number);
     }



    }
    
}
