package ACT4_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author scraf
 */
public class ACT4_2_1 {
    public static void main(String[] args) {
        final int mida = 10;
        int [][] matriu = UtilitatsMatrius.generaMatriu(mida, 1, 8);
        for (int i = 0, j = 0; i < matriu.length; i++) {
                System.out.print("[" + matriu[i][i] + "][" + matriu[j][j] + "]");
                System.out.println();
        }
    }
}
