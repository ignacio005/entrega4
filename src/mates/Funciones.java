package mates;

public class Funciones {

    //1
    public static int suma(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número ingresado debe ser mayor o igual a 0");
        } else if (n == 0) {
            return 0;
        } else {
            return n + suma(n - 1);
        }
    }

    //2
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número ingresado debe ser mayor o igual a 0");
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //3
    public static int potencia(int n, int base) {
        if (n < 0) {
            throw new IllegalArgumentException("El número ingresado debe ser mayor o igual a 0");
        } else if (n == 0) {
            return 1;
        } else {
            return base * potencia(n - 1, base);
        }
    }
}
