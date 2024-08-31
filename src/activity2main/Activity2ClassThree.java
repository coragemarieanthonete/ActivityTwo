/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2main;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Corage
 */
public class Activity2ClassThree extends Activity2ClassTwo{
    
    public Activity2ClassThree(int size) {
        super(size);
    }
    public void removeduplicates(){
        Set<Double> newbasket = new HashSet<>();
        int newBasketTop = -1;
        boolean hasDuplicate = false;
        
            for (int i = 0; i <= top; i++) {
            if (!newbasket.contains(StackBasket[i])){
                System.out.println("\nDuplicate man ni Gang! " + StackBasket[i]);
                StackBasket[++newBasketTop] = StackBasket[i];
                top = newBasketTop;        
                hasDuplicate = true;
            } else{
                System.out.println(StackBasket[i]);
                hasDuplicate = true;
            }
            newbasket.add(StackBasket[i]);
        }
        if(!hasDuplicate){
            System.out.println("\nCHAR WAY DUPLICATE! ");
        }
    }
    
    
}
