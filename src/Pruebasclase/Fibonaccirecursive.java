/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebasclase;

/**
 *
 * @author alumnat
 */
public class Fibonaccirecursive {
    public static void main(String[] args) {
    int longitud = ACT4_1.UtilitatsArrays.llegirSencer("Introduzca la base:");
    int [] array = new int [longitud];
    
    ACT4_1.UtilitatsArrays.generaArrayFibonacci(longitud);
    ACT4_1.UtilitatsArrays.mostraArray(array);
    
    }
    


}
