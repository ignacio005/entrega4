package aplicacion;

import mates.Funciones;

public class Principal {
    public static void main(String[] args) {
        try {
            System.out.println("1) La suma de los 10 primeros números naturales es: " + Funciones.suma(10));
            System.out.println("2) El factorial del 5 es " + Funciones.factorial(5));
            System.out.println("3) La potencia n-esima de un número es " + Funciones.potencia(3,2));
        } catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}