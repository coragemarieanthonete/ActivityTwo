/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2main;

/**
 *
 * @author PC
 */
public class Activity2ClassFive extends Activity2ClassFour {
        public Activity2ClassFive(int size) {
        super(size);
    }
      public void stackStack(){
        
        for (int i = 0; i <= top; i++) {
            if (!isfull()) {
                System.out.println("\nAdded stack to newstack: "
                + StackBasket[i]);
                newStack.push(StackBasket[i]);
            } else {
                System.out.println("\nYou're stack is full");
            }
            }

        }
    
}
