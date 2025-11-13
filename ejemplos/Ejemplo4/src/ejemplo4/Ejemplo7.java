/*
El programa presenta mensaje de "acceso correcto" para las placas de vehiculos 
de la provincia de Guayas y Pichincha
LBA 0010
LBC 0010
GBZ 0101
PRZ 2020
pRC 3231
 */
package ejemplo4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo7 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine();

        // L    0
        // O    1
        // J    2 
        // A    3
        // 
        String inicial = ciudad.substring(0, 1); // se obtiene 
        // el primer 
        // caracter de la cadena
        // Si el valor de ciudad es 
        // "Loja" se obtiene "L"

        if ( inicial.equals("G") || inicial.equals("g") || inicial.equals("P") 
                || inicial.equals("p")  ) {
            System.out.printf("%s\n", "acceso correcto");
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }

    }
}
