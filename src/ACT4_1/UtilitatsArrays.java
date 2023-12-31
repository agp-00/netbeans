package ACT4_1;

import java.util.Scanner;

/**
 * @author joan
 */
public class UtilitatsArrays {

    /**
     * Llegeix un sencer del teclat.
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     *               d'escriure.
     * @return El sencer escrit per l'usuari
     */
    public static int llegirSencer(String prompt) {
        Scanner teclat = new Scanner(System.in);
        int sencer = 0;
        
        System.out.print(prompt);
        sencer = teclat.nextInt();
        return sencer;
    }

    /**
     * Llegeix una cadena del teclat.
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     *               d'escriure.
     * @return La cadena escrita per l'usuari
     */
    public static String llegirCadena(String prompt) {
        Scanner teclat = new Scanner(System.in);
        String cadena;


        System.out.print(prompt);
        cadena = teclat.next();
        return cadena;
    }

    /**
     * Llegeix un real del teclat. 
     *
     * @param prompt El missatge que mostra al'usuari indicant quina dada ha
     *               d'escriure.
     * @return El real escrit per l'usuari
     */
    public static double llegirDouble(String prompt) {
        Scanner teclat = new Scanner(System.in);
        double real = 0;

        System.out.print(prompt);
        real = teclat.nextDouble();
        return real;
    }

    /**
     * Mostra el menu per pantalla i demana a l'usuari l'opció a executar fins
     * que l'usuari en pitja una de correcta.
     *
     * @param titol    El titol del menu
     * @param opcions  La llista d'opcions, sense numero
     * @param pregunta La pregunta que es fa a l'usuari
     * @return L'opció vàlida elegida per l'usuari.
     */
    public static int gestionarMenu(String titol, String[] opcions, String pregunta) {
        int sencer;
		
        System.out.println(titol);
        for (int i = 0; i < opcions.length; i++) {
            System.out.println((i + 1) + ". " + opcions[i]);
        }
        do {
            sencer = llegirSencer(pregunta);
        } while (sencer < 1 || sencer > opcions.length);
        return sencer;
    }

    /**
     * Mostra l'array de sencers que rep com a paràmetre per pantalla
     *
     * @param valors L'array que conté els valors que volem mostrar per pantalla.
     */
    public static void mostraArray(int[] valors) {
        String separador = "";
        System.out.print('[');
		
        for (int i = 0; i < valors.length; i++) {
            System.out.print(separador + valors[i]);
            separador = ", ";
        }
        System.out.println(']');
        System.out.println();
    }

    /**
     * Mostra l'array de double que rep com a paràmetre per pantalla
     *
     * @param valors L'array que conté els valors que volem mostrar per pantalla.
     */
    public static void mostraArray(boolean[] valors) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < valors.length; i++) {
            System.out.print(separador + valors[i]);
            separador = ", ";
        }
        System.out.println(']');
        System.out.println();
    }

    /**
     * Mostra l'array de double que rep com a paràmetre per pantalla
     *aaa
     * @param valors L'array que conté els valors que volem mostrar per pantalla.
     */
    public static void mostraArray(double[] valors) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < valors.length; i++) {
            System.out.print(separador + valors[i]);
            separador = ", ";
        }
        System.out.println(']');
        System.out.println();
    }

    /**
     * Mostra l'array de double que rep com a paràmetre per pantalla
     *
     * @param valors L'array que conté els valors que volem mostrar per pantalla.
     */
    public static void mostraArray(String[] valors) {
        String separador = "";
        System.out.print('[');

        for (int i = 0; i < valors.length; i++) {
            System.out.print(separador + valors[i]);
            separador = ", ";
        }
        System.out.println(']');
        System.out.println();
    }
    
    /**
     * sumar elementos de un array
     * 
     * @param valors
     */
    public static void sumarArray(int[] valors) {
        int suma = 0;
        for (int i = 0; i < valors.length; i++) {
            suma = suma + valors[i];
        }
        System.out.println(suma);
    }

    
    /**
     * hacer media de valores de un array
     * @param valors
     */
    
    public static float mitjanaArray(int[] valors) {
        int suma = 0;
        int total = valors.length;
        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }
        return (float) suma / (float)total;        
    }
    
    /**
     * crear arrays de valores aleatorios con un maximo y minimo predeterminados
     * @param valors
     */
    
    public static int[] generaArray(int longitud, int minim, int maxim) {
        int [] array = new int[longitud];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = minim + (int) (Math.random() * (maxim - minim + 1));
        }
        return array;
    }
    
        /**
     * crear arrays de valores aleatorios con un maximo y minimo predeterminados
     */
    
    public static int[] generaArrayFibonacci(int longitud) {
        int [] array = new int[longitud];
        
        for (int i = 0; i < array.length; i++) {
            switch (i) {
                case 0:
                    array[i] = 0;
                    break;
                case 1:
                    array[i] = 1;
                    break;
                default:
                    i = array[i-2] + array[i-1];
            }
        }
        return array;
    }
    
    /**
     * comparar dos arrays
     * @param array1
     * @param array2
     * @return 
     */
    public static boolean compararArrays(int[] array1, int[] array2) {
        boolean comparacion = true;
        if (array1.length != array2.length) {
            comparacion = false;
        }
        for (int i = 0; i < array1.length;i++) {
            if (array1[i] == array2[i]) {
                comparacion = true;                
            } else {
                comparacion = false;
            }
        }
        return comparacion;
    }
    
}