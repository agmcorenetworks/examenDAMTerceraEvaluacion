package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.Hashtable;

public class ParteII {
	
	static  String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;" +
            "adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
	
	
	/* Dada la matriz: 
	123
	456
	789
	Pintar la matriz por consola tal cual*/

	
	public static void matriz1() {
		// Creo la matriz
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Recorro la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
	}
        
        /* Pintar la matriz por consola invirtiendo las columnas por las filas (quedando así): 
	    147
	    258
	    369*/
        
        public static void matriz2() {
        	// Creo la matriz
        	
            int[][] matrizAlReves = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

            //Cambiamos las variables j e i en el bucle for, para recorrerla de otra manera
            for (int j = 0; j < matrizAlReves[0].length; j++) {
                for (int i = 0; i < matrizAlReves.length; i++) {
                    System.out.print(matrizAlReves[i][j]);
                }
                System.out.println();
            }
            
    	}
        
        // 3- Hashtable
        public static void getNumeroExtensiones() {
            String[] ficheros = datos.split(";");

            Hashtable<String, Integer> extensiones = new Hashtable<String, Integer>();

            for (String fichero : ficheros) {
                String[] partes = fichero.split("\\.");

                if (partes.length >= 2) {
                    String extension = partes[partes.length - 1];

                    // Comparo las extensiones para ver si ya se encuentran y sumar +1
                    if (extensiones.containsKey(extension)) {
                        int contador = extensiones.get(extension);
                        extensiones.put(extension, contador + 1);
                    } else {
                        extensiones.put(extension, 1);
                    }
                }
            }

            for (String extension : extensiones.keySet()) {
	            int cantidad = extensiones.get(extension);
	            System.out.println("Extensión: " + extension + ", Cantidad: " + cantidad);
	        }
			
        }

        	    
        	

  
        
        
	    public static void main(String[] args) {
	    	
	   System.out.println("Metodo 1");
	  // matriz1();
	   System.out.println("Metodo 2");
	  // matriz2();
	   System.out.println("Metodo 3");
	  getNumeroExtensiones();
	    	
	        
	            
	    }
}
