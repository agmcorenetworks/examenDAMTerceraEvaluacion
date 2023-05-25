package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;

public class ParteII {


	public static void pintarMatriz() {
		int[][] miMatriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        System.out.println("Matriz Original:");

	        for (int i = 0; i < miMatriz.length; i++) {
	            for (int j = 0; j < miMatriz[i].length; j++) {
	                System.out.print(miMatriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
	
	
	public static void pintarMatrizInvertida() {
        int[][]  miMatriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Resultado de la matriz Invertida:");

        for (int j = 0; j <  miMatriz[0].length; j++) {
            for (int i = 0; i <  miMatriz.length; i++) {
                System.out.print( miMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	
	public static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("No se pueden sumar las matrices. No coincide las dimensiones de la matriz introducida");
            return;
        }

        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] result = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            	result[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("La suma de las matrices es =");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	 public static void getNumeroExtensiones() {
	        String texto = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";

	        // Separar el string en un array de ficheros
	        String[] ficheros = texto.split(";");

	        // Tabla hash para contar las extensiones
	        HashMap<String, Integer> extensiones = new HashMap<>();

	        // Procesar cada fichero con un bucle for each
	        for (String fichero : ficheros) {
	            // Separar nombre y extensión
	            int indexPunto = fichero.lastIndexOf('.');
	            if (indexPunto == -1) {
	                continue; // Si no tiene extensión válida, omite el fichero
	            }

	            String nombre = fichero.substring(0, indexPunto);
	            String extension = fichero.substring(indexPunto + 1);

	            // Incrementamos el contador de la extensión en la tabla hash
	            extensiones.put(extension, extensiones.getOrDefault(extension, 0) + 1);
	        }

	        // Mostramos las extensiones y la cantidad de ficheros por extensión
	        System.out.println("Extensiones encontradas:");

	        for (String extension : extensiones.keySet()) {
	            int cantidadFicheros = extensiones.get(extension);
	            System.out.println("Extension: " + extension + ", Cantidad de ficheros: " + cantidadFicheros);
	        }
	    }
	 
	 public static void main(String[] args) {
	        pintarMatriz();
	        System.out.println();
	        pintarMatrizInvertida();
	        System.out.println();

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

	        //Llamar metodo sumarMatrices
	        sumarMatrices(matriz1, matriz2);
	        
	        //Llamar metodo getNumeroExtenseiones
	        getNumeroExtensiones();
	    }
	 
	 
	
}
