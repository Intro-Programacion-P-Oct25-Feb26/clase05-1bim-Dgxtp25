/*
 Realizar un programa en java que permita determinar si un estudiante ha pasado 
el ciclo se ingresa el promedio del estudiante
- Un estudiante pasa el ciclo si tiene un promedio mayor o igual a 7.5 

- Si el estudiante aprueba el ciclo, presentar un mensaje como sigue, 
Estudiante aprobado con un promedio: ?
- Si el estudiante tiene una nota mayor o igual a 5 y menor o igual a 7.4 
presentar un mensaje con el siguiente texto; Estudiante en suspenso con un promedio: ? 
- Si el estudiante tiene una nota menor a 5 presentar un mensaje con el 
siguiente texto; Estudiante reprobado con un promedio: ? 
 */
package ejemplo3;

/**
 *
 * @author reroes
 */
public class Ejemplo8 {

    public static void main(String[] args) {
        // Condicionales aninados
        // >= 7.5 Aprobado
        //  and < 7.5 Suspenso
        // >= 3 and < 5 Recuperación
        // >= 0 < 3 Reprobado
        // las notas no pueden pasar de 10
        // Si la nota fuera de rango es negativa hay que indicarlo
        double promedio = 2.9;
        String mensaje = "";
        
        

        if (promedio >= 7.5) {
            //System.out.printf("Estudiante aprobado con un "
             //       + "promedio: %.2f\n", promedio);
            //mensaje = "Estudiante aprobado con un "
              //      + "promedio:" + promedio;
            mensaje = String.format("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
                    
        } else {
            if ((promedio>= 5) && (promedio < 7.5)) {
                mensaje = String.format("Estudiante en suspenso con un "
                        + "promedio: %.2f\n", promedio);
        } else {
            if ((promedio>= 5)  && (promedio >= 7.5) && (promedio < 5)) {
                mensaje = String.format("Estudiante en recuperacion con un "
                        + "promedio: %.2f\n", promedio);        
         } else {    
                 if ((promedio >=0) && (promedio < 3)) {
                mensaje = String.format("Estudiante reprobado con un "
                        + "promedio: %.2f\n", promedio);
         } else { 
            
            if (promedio< 0)
                 mensaje = String.format("La nota es negativa y esta fuera "
                         + "de rango "
                       , promedio);
            
                mensaje = String.format("La nota es positiva y esta dentro de "
                        + "rango "
                       , promedio);
                 
                 }        
                
               }
            System.out.printf("mensaje");

            }

        }
    }
}

