/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bodymass.index;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class BodymassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        double a,b;
        System.out.println("enter the your height");
        a=s.nextDouble();
        System.out.println("enter the your weight");
        b=s.nextDouble();
        
        double c=b/(a*a);
        
        if(c<18){
         System.out.println("you are weak");
        }
        else if(18<c && c<25){
            System.out.println("you are normal");
        } 
        else if(25<c&& c<30){ 
            System.out.println("you are slightly fat");
        } 
        else if(30<c && c<35) {
        System.out.println("you are fat");
            
        }else System.out.println("you are obez");
    }
    
}
