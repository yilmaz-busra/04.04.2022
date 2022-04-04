/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compare.two.number;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class CompareTwoNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        int a,b;
        System.out.println("enter the first value");
        a=s.nextInt();
        System.out.println("enter the second value");
        b=s.nextInt();
        
        if(a<b){
            System.out.println("Second value is greater than first value");
        }
        else if(a>b){
           System.out.println("First value is greater than Second value"); 
        } else{
        System.out.println("First value is equal to second value");
        
    }
        
    }
    
}
