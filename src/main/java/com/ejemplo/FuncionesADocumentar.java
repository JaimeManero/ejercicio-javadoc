package com.ejemplo;
/**
 * Esta clase contiene métodos para realizar operaciones  en arrays de enteros.
 */
public class FuncionesADocumentar {
    /**
     * Método principal que demuestra el uso de los métodos de esta clase.
     * @param args argumentos de la línea de comandos (no se ha utilizado)
     */
    public static void main(String[] args) {
        
        int a[] = {7, 14, 9, 18, 11, 6, 13, 12, 1, 5, 4, 3, 2, 8, 10};

        System.out.println("La suma de los elementos del arreglo es: " + suma(a));
        System.out.println("El promedio de los elementos del arreglo es: " + promedio(a));
        System.out.println("El mayor de los elementos del arreglo es: " + mayor(a));
        System.out.println("El menor de los elementos del arreglo es: " + menor(a));
        System.out.println("El arreglo invertido es: ");
        invertir(a);
        System.out.println("El arreglo ordenado es: ");
        ordenar(a);
    }

    /**
     * Calcula la suma de los elementos en un array.
     * @param a array de enteros
     * @return La suma de los elementos del array
     */
    public static int suma(int a[]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }

    /**
     * Calcula el promedio de los elementos en un array.
     * @param a array de enteros
     * @return El promedio de los elementos del array
     */
    public static double promedio(int a[]) {
        return suma(a) / a.length;
    }

    /**
     * Encuentra el valor máximo en un array de enteros.
     * @param a array de enteros
     * @return El mayor elemento del array
     */
    public static int mayor(int a[]) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > mayor)
                mayor = a[i];
        return mayor;
    }

    /**
     * Encuentra el valor mínimo en un array de enteros.
     * @param a array de enteros
     * @return El menor elemento del array
     */
    public static int menor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < menor)
                menor = a[i];
        return menor;
    }

    /**
     * Invierte un array de enteros e imprime los elementos invertidos
     * @param a array de enteros a invertir
     */

    public static void invertir(int a[]) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    /**
     * Ordena un array de enteros en orden ascendente e imprime los elementos ordenados
     * @param a array de enteros a ordenar
     */
    public static void ordenar(int a[]) {
        int aux;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i; j < a.length; j++)
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
