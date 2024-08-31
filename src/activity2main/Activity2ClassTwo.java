/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity2main;

/**
 *
 * @author Corage
 */
public class Activity2ClassTwo extends Activity2ClassOne {
    
    public Activity2ClassTwo(int size) {
        super(size);
    }
    public void countElements(){
        if (!isempty()){
            int Value = top+1;
            System.out.println("Value: " + Value);
        }
        else{
            System.out.println("Walay Value");
        }
       
    }
    
}
