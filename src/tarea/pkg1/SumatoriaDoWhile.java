/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg1;

/**
 *
 * @author mikim
 */
public class SumatoriaDoWhile {
     public static void main(String[] args) {
        int num = 1;
        int suma = 0;

        do {
            suma += num; // Acumula el número
            num++;       // Incrementa el contador
        } while (num <= 50);

        System.out.println("La sumatoria del 1 al 50 es: " + suma);
    }
}
