/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Dish dishClass = new Dish();
        Scanner input = new Scanner(System.in);
        String txtDish; 
        
        System.out.println("Dishes for Each time of day!");
        System.out.println("type morning and the number for: ");
        System.out.println("1-eggs,2-toast,3-coffe,4-not applicable");
        System.out.println("or");
        System.out.println("type night and the number for: ");
        System.out.println("1-steak,2-potato,3-wine,4-cake");
        
        txtDish = input.next();
        dishClass.checkDish(txtDish);
    }
    
}
