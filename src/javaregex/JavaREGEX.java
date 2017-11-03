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
        
        System.out.println("Enter a phone number");
        Scanner input = new Scanner(System.in);
        String sInput = input.next();
        Matcher match = pat1.matcher(sInput);
        
        if(match.matches())
        {
            String n1 = match.group(1);
            String n2 = match.group(2);
            String n3 = match.group(3);
            System.out.println("Congrats. You entered ");
            System.out.println("(" + n1 + ") " + n2 + "-" + n3);
        }
        else
        {
            System.out.println("Please enter a number that matches the format");
        }
    }
    
}
