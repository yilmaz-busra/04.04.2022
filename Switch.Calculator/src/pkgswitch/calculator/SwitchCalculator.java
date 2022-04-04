/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.calculator;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class SwitchCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int a,b;
        char d;
        System.out.println("enter the first number");
        a=s.nextByte();
        System.out.println("enter the second number");
        b=s.nextByte();
        System.out.println("\" choose '+,-,*,/'\"");
        d=s.next().charAt(0);
        int c=0;
        switch(d){
            case '+':
                c=a+b;
                break;
            case'-':
                c=a-b;
                break;
            case'*':
                c=a*b;
                break;
            case'/':
                c=a/b;
                break;
    }
        System.out.println("Conclusion="+c);
    }
}
