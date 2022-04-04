/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changing.variable;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class ChangingVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        System.out.println("enter the first value");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
         System.out.println("enter the second value");
        b=s.nextInt();
        
        a = a+b; // iki değişkeni toplayıp, sonrasında verilen değişkenden çıkarırsan değerler değişir.
        b= a-b;
        a=a-b;
        
        System.out.println("new first value: "+ a+ "new second value: "+b);
    }
    
}
