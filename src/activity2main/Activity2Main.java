/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity2main;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Corage
 */
public class Activity2Main {

   
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of the Basket: ");
        int maxSize = scn.nextInt();
        
        
       Activity2ClassFive stack = new Activity2ClassFive(maxSize);
        
        while(true){
            System.out.println("\nType 0 to Exit");
            System.out.println("Type 1 to Push" );
            System.out.println("Type 2 to Pop");
            System.out.println("Type 3 to Peek");
            System.out.println("Type 4 to Loop");
            System.out.println("Type 5 to Show Number of Elements");
            System.out.println("Type 6 to Find Duplicate");
            System.out.println("Type 7 to View Bottom Element");
            System.out.println("Type 8 to Add to New Stack");
            System.out.println("Type 9 to Add to New Loop\n");
       int choice = scn.nextInt();
       
       if (choice == 1){ 
           System.out.println("\nPush Value: ");
          double pushValue = scn.nextDouble();
          stack.push(pushValue);
       }   
       
        else if (choice == 2){
           stack.pop();
       }
       
        else if (choice == 3){
            System.out.println("\nMao ni siya ang top: ");
           System.out.println(stack.peek());
       }
        else if (choice == 4){
            System.out.println("\nMao ni siya tanan: ");
           stack.loop();
        }
        else if (choice == 5){
            System.out.println("Number of Elements: ");
            stack.countElements();
        }
        else if (choice == 6){
            stack.removeduplicates();
        }
        else if (choice == 7){
            System.out.println(stack.bottomElement());
         
        }
        else if (choice == 8){
            stack.stackStack();
        }
        else if (choice == 9){
            stack.newloop();
        }
        else if (choice == 0){
            break;
        }

       else{
            System.out.println("\nGIIGNAG 1 2 3 4 5 6 7 8 9 0 LANG!!!");  
        }
        }
    }
}
    

