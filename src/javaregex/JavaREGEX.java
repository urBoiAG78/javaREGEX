/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaregex;
import java.util.regex.*;
import java.util.Scanner;
/**
 *
 * @author agonzalez
 */
public class JavaREGEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern pat1;
        
        pat1 = Pattern.compile("([0-9]{3})([0-9]{3})-([0-9]{4})");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phone number");
    }
    
}
