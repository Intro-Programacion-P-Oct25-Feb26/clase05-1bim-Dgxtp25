/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Datos fijos
        double costoMembresia = 25.0;
        double descuento = 0.05;
        double valorDescuento = 0;
        double totalPagar;

        // Solicitud de datos
        System.out.println("GIMNASIO FUERZA TOTAL");
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Ingrese su usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        entrada.nextLine(); 

        System.out.print("Ingrese su parroquia: ");
        String parroquia = entrada.nextLine();

        System.out.print("Ingrese el día de pago (1-31): ");
        int diaPago = entrada.nextInt();

        // Validación de descuento
        boolean parroquiaValida = parroquia.equalsIgnoreCase("El Valle") || parroquia.equalsIgnoreCase("El Sagrario");
        boolean diaValido = diaPago < 10;

        if (parroquiaValida && diaValido) {
            valorDescuento = costoMembresia * descuento;
            totalPagar = costoMembresia - valorDescuento;
        } else {
            totalPagar = costoMembresia;
        }

        // Recibo detallado
        System.out.println("\nRECIBO DEL SOCIO");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Usuario: " + usuario);
        System.out.println("Edad: " + edad);
        System.out.println("Parroquia: " + parroquia);
        System.out.println("Día de pago: " + diaPago);
        System.out.println("-----------------------------");
        System.out.println("Valor membresía: $" + costoMembresia);

        if (valorDescuento > 0) {
            System.out.println("Descuento (5%): $" + valorDescuento);
        } else {
            System.out.println("Descuento: No aplica");
        }

        System.out.println("Total a cancelar: $" + totalPagar);
        System.out.println("=============================");
    }
}

    
    

