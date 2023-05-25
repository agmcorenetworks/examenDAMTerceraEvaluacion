package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;




public class ParteII {
	
	//matrices 
	    public static void pintarMatrizOriginal() {
	        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	        System.out.println("Matriz Original:");
	        for (int[] fila : matriz) {
	            for (int elemento : fila) {
	                System.out.print(elemento + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void pintarMatrizInvertida() {
	        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	        System.out.println("Matriz Invertida:");
	        for (int i = 0; i < matriz[0].length; i++) {
	            for (int j = 0; j < matriz.length; j++) {
	                System.out.print(matriz[j][i] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    
	    public static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
	        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
	            System.out.println("Las matrices no tienen el mismo tamaño.");
	            return;
	        }

	        int filas = matriz1.length;
	        int columnas = matriz1[0].length;

	        int[][] resultado = new int[filas][columnas];

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }

	        System.out.println("Suma de matrices:");
	        for (int[] fila : resultado) {
	            for (int elemento : fila) {
	                System.out.print(elemento + " ");
	            }
	            System.out.println();
	        }
	    }

	    
	    
	    //método para ve rel número de extensiones de los archivos
	    
	    public static void getNumeroExtensiones() {
	        String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
	        String[] ficheros = datos.split(";");

	        HashMap<String, Integer> extensiones = new HashMap<>();

	        for (String fichero : ficheros) {
	            int puntoIndex = fichero.lastIndexOf('.');
	            if (puntoIndex >= 0) {
	                String extension = fichero.substring(puntoIndex + 1);
	                extensiones.put(extension, extensiones.getOrDefault(extension, 0) + 1);
	            }
	        }

	        System.out.println("Extensiones encontradas:");
	        for (String extension : extensiones.keySet()) {
	            int cantidad = extensiones.get(extension);
	            System.out.println(extension + ": " + cantidad + " fichero(s)");
	        }
	    }
	    
	    public static void main(String[] args) {
	        pintarMatrizOriginal();
	        System.out.println();
	        pintarMatrizInvertida();
	        int[][] matriz1 = {{2, 4, 8}, {1, 3, 5}, {3, 5, 9}};
	        int[][] matriz2 = {{1, 3, 7}, {2, 4, 6}, {3, 5, 7}};

	        sumarMatrices(matriz1, matriz2);
	        
	        getNumeroExtensiones();
	        
	    }
	}

	
	
