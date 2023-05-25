package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;

public class ParteII {
	

    public static void pintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] invertirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizInvertida = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[j][i] = matriz[i][j];
            }
        }

        return matrizInvertida;
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
    
    public static void getNumeroExtensiones(String datos) {
        HashMap<String, Integer> extensiones = new HashMap<String, Integer>();

        String[] ficheros = datos.split(";");

        for (String fichero : ficheros) {
            String[] partes = fichero.split("\\.");

            if (partes.length > 1) {
                String extension = partes[1];

                if (extensiones.containsKey(extension)) {
                    int contador = extensiones.get(extension);
                    extensiones.put(extension, contador + 1);
                } else {
                    extensiones.put(extension, 1);
                }
            }
        }

        System.out.println("Extensiones encontradas y cantidad de ficheros:");

        for (String extension : extensiones.keySet()) {
            int cantidad = extensiones.get(extension);
            System.out.println(extension + ": " + cantidad);
        }
    }
    
public static void main(String[] args) {
// -----------------------Ejercicio 1-----------------------------------
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz original:");
        pintarMatriz(matriz);

        System.out.println("\nMatriz invertida:");
        int[][] matrizInvertida = invertirMatriz(matriz);
        pintarMatriz(matrizInvertida);
// -----------------------Ejercicio 2-----------------------------------
        int[][] matriz1 = {
                {2, 4, 8},
                {1, 3, 7},
                {3, 5, 9}
            };

        int[][] matriz2 = {
                {1, 3, 5},
                {2, 4, 6},
                {3, 5, 7}
            };

        System.out.println("Matriz 1:");
        pintarMatriz(matriz1);

        System.out.println("\nMatriz 2:");
        pintarMatriz(matriz2);

        System.out.println("\nResultado de la suma:");
        int[][] suma = sumarMatrices(matriz1, matriz2);
        pintarMatriz(suma);
// -----------------------Ejercicio 3-----------------------------------
        String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
        getNumeroExtensiones(datos);     
    }
}