package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class ParteII {
    int[][] matrizOriginal;
    int[][] matrizInvertida;

    public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void obtenerMatrizInvertida() {
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;
        matrizInvertida = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[j][i] = matrizOriginal[i][j];
            }
        }
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

    public static void main(String[] args) {
        ParteII parteII = new ParteII();

        parteII.matrizOriginal = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz Original:");
        parteII.imprimirMatriz(parteII.matrizOriginal);
        System.out.println();

        parteII.obtenerMatrizInvertida();
        System.out.println("Matriz Invertida:");
        parteII.imprimirMatriz(parteII.matrizInvertida);
        System.out.println();

        int[][] matriz2 = {
            {2, 4, 8},
            {1, 3, 7},
            {3, 5, 9}
        };

        int[][] matriz3 = {
            {1, 3, 5},
            {2, 4, 6},
            {3, 5, 7}
        };

        int[][] sumaMatrices = sumarMatrices(matriz2, matriz3);
        System.out.println("Suma de Matrices:");
        parteII.imprimirMatriz(sumaMatrices);
    }
}
