/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebasclase;

/**
 *
 * @author alumnat
 */
public class recursive1 {
    public static void main(String[] args) {

    int base = ACT4_1.UtilitatsArrays.llegirSencer("Introduce la base:");
    
    System.out.println(calcularFactorial(base));
    }

    private static int calcularFactorial(int base) {
        
        if (base == 1)
            return 1;
        else
            return base * calcularFactorial(base - 1);
    }
}