/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2main;

/**
 *
 * @author PC
 */
public class Activity2ClassFour extends Activity2ClassThree {
    
    public Activity2ClassFour(int size) {
        super(size);
    }
    public double peek(){
         if (!isempty()){
          return StackBasket[top];     
        }
         else{
             System.out.println("WALA NAY SULOD, FINAL NA!");
             return -1;
         }
}
}
