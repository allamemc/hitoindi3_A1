/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hito.aplicacionconsola;

/**
 *
 * @author Allam
 */
import java.util.Scanner;

public class AplicacionConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Programación orientada a objetos
        Persona persona = new Persona("Juan", "Pérez");
        System.out.println(persona.getNombreCompleto());

        // Programación procedimental
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        System.out.println("El cuadrado de " + numero + " es " + cuadrado(numero));

        // Programación basada en eventos
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.next();
        System.out.println("¡Hola, " + nombre + "!");
    }

    
    public static int cuadrado(int numero) {
        return numero * numero;
    }

    // Programación orientada a objetos
    public static class Persona {
        private String nombre;
        private String apellido;

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombreCompleto() {
            return nombre + " " + apellido;
        }
    }
}

