package ACT4_2;

import ACT4_1.UtilitatsArrays;

/**
 *
 * @ Tomeu Vives
 */
public class UtilitatsMatrius {
    
    /**
     * generar matriz con valores aleatorios predeterminados
     * @param longitud
     * @param minim
     * @param maxim
     * @return 
     */
    
    public static int[][] generaMatriu(int longitud, int minim, int maxim) {
        int [][] matriu = new int[longitud][longitud];
        
        for (int i = 0; i < matriu.length; i++) {
            matriu[i] = UtilitatsArrays.generaArray(longitud, minim, maxim);
        }
        return matriu;
    }
    
        /**
     * Mostra la matriu
     * @param matriu
     */
    public static void mostrarMatriu(int[][] matriu) {
        String separador = "  ";
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(separador);
            UtilitatsArrays.mostraArray(matriu[i]); 
           
        }
    }
    
    
}