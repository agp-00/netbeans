/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT4_2;

import ACT4_1.UtilitatsArrays;

/**
 *
 * @author alumnat
 */
public class ACT4_2_3 {
    public static void main(String[] args) {
        int[][] matriu = UtilitatsMatrius.generaMatriu(4, 1, 100);
        int[] diagonal;
        
        System.out.println();
        UtilitatsMatrius.mostrarMatriu(matriu);
        System.out.println();
        diagonal = UtilitatsMatrius.generaDiagonalPrincipal(matriu);
        UtilitatsArrays.mostraArray(diagonal);
    }
}
