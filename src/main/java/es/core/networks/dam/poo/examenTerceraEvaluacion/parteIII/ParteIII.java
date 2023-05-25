package es.core.networks.dam.poo.examenTerceraEvaluacion.parteIII;

import java.util.HashMap;

public class ParteIII {
	
	 public static void getNumeroExtensiones(String datos) {
		 HashMap<String, Integer> extensiones = new HashMap<String, Integer>();
		 
		 String[] ficheros = datos.split(";");

	        for (String fichero : ficheros) {
	            String[] partes = fichero.split("[.]");
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


	  
	        for (String extension : extensiones.keySet()) {
	            int cantidad = extensiones.get(extension);
	            System.out.println("Extension: " + extension + ", Numero ficheros: " + cantidad);
	        }
	    }
	 
	 public static void main(String[] args) {
	        String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;" +
	                "adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
	        
	        getNumeroExtensiones(datos);
	    }

}
