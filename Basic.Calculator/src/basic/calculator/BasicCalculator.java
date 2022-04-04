/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.calculator;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class BasicCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
         int a, b, c=0;
         char d;
         System.out.println("enter the first value ");
         a=s.nextInt();
          System.out.println("enter the second value ");
         b=s.nextInt();
         System.out.println(" choose '+,-,*,/'");
         d=s.next().charAt(0);
         
         if(d=='+'){
             c=a+b;
             System.out.println("Conclusion="+ c);
         } else if(d=='-'){
             c=a-b;
             System.out.println("Conclusion="+ c);
         } else if(d=='*'){
             c=a*b;
             System.out.println("Conclusion="+ c);}
         else if(d=='/'){
             c=a/b;
             System.out.println("Conclusion="+ c);}
         else System.out.println("ERROR");
         
        
         
         
         
         
    
    }  
}
