/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author Dell
 */
public class LAB2 {
    public static void main(String[] args) {
        try {
            int[] list = new int[10];
            System.out.println("list[10 is " + list[10]);
        }
        catch(ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        catch(RuntimeException ex) {
            System.out.println("RuntimeException");
        }
        catch(Exception ex) {
            System.out.println("Exception");
        }
    }
    
    
}