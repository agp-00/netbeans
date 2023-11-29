package ACT4_6;

import ACT4_1.UtilitatsArrays;
import ACT4_3.UtilitatsConsola;
import ACT4_2.UtilitatsMatrius;
import java.util.ArrayList;


 /**
  * Crea una classe que inicialitzi una matriu quadrada,
  * A continuaciĂł gestiona el joc del cuc.
  *     SIMBOL_FULLA --> fulla
  *     SIMBOL_BUIT  --> res
  *
  */

public class ACT4_6_4 {
    // creamos las dos variables que seleccionamos nada mas ejecutar el codigo, tamaño de tablero y numero de hojas
    static int NTAULER;
    static int NFULLES;
    // aplicamos x simbolo a las diferentes variables que necesitaremos para el programa
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_FULLA = 9;
    static final int SIMBOL_CUC = 1;
    //creamos arrays para tablero y arraylist para gusano
    static int[][] tauler;
    ArrayList<int[]> cuc = new ArrayList<>();
    //creamos variable para movimiento del gusano
    static int accio;
    
    public static void main(String[] args) {
        //aplicamos el tamaño del tablero
        NTAULER=UtilitatsConsola.llegirSencer("Mida del tauler: ");
        //aplicamos numero de hojas de la partida
        NFULLES=UtilitatsConsola.llegirSencer("Nombre de fulles: ");
        //creamos tablero con la longitud seleccionada antes
        tauler = UtilitatsMatrius.generaMatriu(NTAULER, 0, 0);  // matriu NTAULERxNTAULER
        // creamos un array con dos valores entre 0 y el tamaño del tablero-1, cuyos dos valores sera la posicion del gusano
        cuc = UtilitatsArrays.generaArray(2,0, tauler.length-1);     // (x,y) del cuc
        
        //llamamos al metodo emplenatauler
        emplenaTauler(tauler, cuc);
        //9.33-9.45 
        //13.26
        
        do {
            //mostramos la matriz "tauler" despues de haber creado el gusano y las hojas en la matriz
            UtilitatsMatrius.mostrarMatriu(tauler);
            //leemos la accion indicada en el prompt y leemos la variable
            accio=UtilitatsConsola.llegirSencer("ACCIONS: 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");
            
            //llamamos a otro metodo
            cambiaPosicio(tauler, cuc, accio);

        } //siempre que la accion no sea igual a 0 (accion para salir del juego)
            while (accio!=0);
    }
     
    public static void emplenaTauler(int[][] tauler, int[] cuc) {
        //creamos un array para posteriormente rellenarlo con la posicion de la hoja
        int[] fulla;
        
         // colocamos el gusano en el tablero con la posicion aleatoria creada anteriormente
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
        
        // bucle for con el numero de hojas indicado como maximo valor, para que cree el numero de hojas indicado
        for (int i=0; i<NFULLES; i++) {
            // creamos un array con dos valores entre 0 y el tamaño del tablero-1, cuyos dos valores sera la posicion de la hoja
            fulla = UtilitatsArrays.generaArray(2,0, tauler.length-1);
            // Situamos la hoja de posicion generada en el tablero
            tauler[fulla[0]] [fulla[1] ] = SIMBOL_FULLA;
        }
    }
    
        public static void afegeixFulla(int[][] tauler) {
            //variable mida igual a longitud del tablero indicada
        int mida = tauler.length;
        //creamos array hoja
        int[] fulla;
        //creamos boolean okfulla
        boolean okfulla = true;
        
        do {
            fulla  = UtilitatsArrays.generaArray(2,0, mida-1); // creamos un array con dos valores entre 0 y el tamaño del tablero-1, cuyos dos valores sera la posicion de la hoja
            //si la posicion generada esta vacia crea una hoja
            if (tauler[fulla[0]][fulla[1]] == SIMBOL_BUIT) { 
                tauler[fulla[0]][fulla[1]] = SIMBOL_FULLA;
                //hacemos que el boolean tenga valor false
                okfulla = false;
            }
          // ejecutamos este metodo siempre que el boolean sea true
        } while (okfulla);
        
    }
    
    public static void cambiaPosicio(int[][] tauler, int[] cuc, int accio) {
        //creamos variable mida con longitud del tablero para operar con el gusano
        final int MIDA = tauler.length;
        
        // cambiamos que la posicion donde se encuentra el gusano actualmente sea una posicion vacia ya que moveremos el gusano ahora
        tauler[cuc[0]][cuc[1]] = SIMBOL_BUIT;
        //creamos switch para ver el movimiento que haremos
        switch (accio) {
            case 4 -> // IZQ
                cuc[1] = (cuc[1]==0 ? MIDA-1 : cuc[1]-1); 
            case 6  -> // DER
                cuc[1] = (cuc[1]==MIDA-1 ? 0 : cuc[1]+1); 
            case 8  -> // ARB
                cuc[0] = (cuc[0]==0 ? MIDA-1 : cuc[0]-1); 
            case 2 -> //ABJ
                cuc[0] = (cuc[0]==MIDA-1 ? 0 : cuc[0]+1); 
        }
        // si el gusano se pone en la posicion donde hay una hoja llama al metodo afeigeixFulla
        if (tauler[cuc[0]][cuc[1]] == SIMBOL_FULLA) {
            afegeixFulla(tauler);
        }
        //nueva posicion del gusano al moverse
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
    }
    
}