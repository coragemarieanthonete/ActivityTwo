/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2main;

import java.util.Stack;

/**
 *
 * @author Corage
 */
public class Activity2ClassOne {
    Stack<Double> newStack = new Stack<>();
     int maxSize;
     double[] StackBasket;
    int top;
    
    public Activity2ClassOne(int size){
        maxSize = size;
        StackBasket = new double[maxSize];
        top = -1;
    }
    public boolean isfull(){
        return (top == maxSize - 1); 
    }
    public boolean isempty(){
        return (top == -1);
    }
    
     public void push(double Value){
         if(!isfull()){
            StackBasket [++top] = Value;
             //System.out.println(StackBasket[top]);
         }
         else{
             System.out.println("PUNONG PUNONG NA PO AKO"); 
         }    
     } 
     public double pop(){
         if (!isempty()){
          return StackBasket [top--];        
        }
         else{
             System.out.println("WALA NA GANI NO");
             return -1;
         }
     }
//    public double peek(){
//         if (!isempty()){
//          return StackBasket[top];     
//        }
//         else{
//             System.out.println("WALA NAY SULOD, FINAL NA!");
//             return -1;
//         }        
//    }
     public double  bottomElement(){
        if (!isempty()) {
            return StackBasket[0];           
        }
        else {
            System.out.println("\nWay sulod");
            return -1;     
        }
    }

    public void loop(){
         if (!isempty()){
            for (int i = top; i >= 0; i --){
            System.out.println(StackBasket[i]);
        }
         }
         else{
            System.out.println("WAY SULOD");        
    }
         
     }
        public void newloop(){
         if (!isempty()){
            for (int i = top; i >= 0; i --){
            System.out.println(newStack.get(i));
        }
         }
         else{
            System.out.println("WAY SULOD");        
    }
         
     }
}
