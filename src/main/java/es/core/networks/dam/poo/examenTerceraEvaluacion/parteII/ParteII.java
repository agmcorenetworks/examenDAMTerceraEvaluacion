package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;

public class ParteII {
	public static void main(String[]args) {
		
	int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
	
	System.out.println("MATRIZ NORMAL");
	matrizNormal(matriz1);
	
	System.out.println("");
	
	System.out.println("MATRIZ INVERSA");
	matrizInversa(matriz1);
	
	int[][] matriz2 = {{2,4,8},{1,3,7},{3,5,9}};
	int[][] matriz3 = {{1,3,5},{2,4,6},{3,5,7}};
	System.out.println(" ");
	System.out.println("SUMA DE MATRICES");
	sumarMatrices(matriz2,matriz3);
	System.out.println(" ");
	getNumeroExtensiones();
	
	Circulo circ1 = new Circulo(1);
	Circulo circ2 = new Circulo(2);
	Circulo circ3 = new Circulo(3);
	
	Cuadrado cuad1 = new Cuadrado(1);
	Cuadrado cuad2 = new Cuadrado(2);
	Cuadrado cuad3 = new Cuadrado(3);
	
	Circulo[] circulo = {circ1,circ2,circ3};
	Cuadrado[] cuadrado = {cuad1,cuad2,cuad3};
	FiguraGeometrica[] figu = {circ1,circ2,circ3,cuad1,cuad2,cuad3};
	Estadisticas[] est = {circ1,circ2,circ3,cuad1,cuad2,cuad3};
	
	for (int i=0;i<circulo.length;i++) {
		System.out.println(circulo[i].getArea());
		System.out.println(circulo[i].getPerimetro());
		}
	System.out.println("");
	for (int i=0;i<cuadrado.length;i++) {
		System.out.println(cuadrado[i].getArea());
		System.out.println(cuadrado[i].getPerimetro());
		}
	System.out.println("");
	for (int i=0;i<figu.length;i++) {
		System.out.println(figu[i].getArea());
		System.out.println(figu[i].getPerimetro());
		}
	System.out.println("");
	for (int i=0;i<est.length;i++) {
		System.out.println(est[i].getArea());
		System.out.println(est[i].getPerimetro());
	}
	}
	
	
	static void matrizNormal(int [][]matriz) {
	 for (int i = 0; i < matriz.length; i++) {
		 for (int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	 }
	

	static void matrizInversa(int[][]matriz) {
	for (int j = 0; j < matriz[0].length; j++) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    	}
	}
	
	
	static void sumarMatrices(int[][] matriz1, int [][]matriz2) {
		for(int i = 0; i<matriz1.length; i++) {
			for(int j = 0; j<matriz1[i].length; j++) {
				int numMatriz1 = matriz1[i][j];
				int numMatriz2 = matriz2[i][j];
				int sumar = numMatriz1 + numMatriz2;
				System.out.print(sumar + " ");
			}
			System.out.println(" ");
		}
	}
	
	static void getNumeroExtensiones() {
	 String datos="hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
	
	 String[] separarDatos = datos.split(";");
	 
	 HashMap<String, Integer> extensiones = new HashMap<>();
	
	 for (String ficheroNuevo : separarDatos) {
	        String[] partesFichero = ficheroNuevo.split("\\.");
	        if (partesFichero.length == 2) {
	            String extension = partesFichero[1];
	            
	        
	            if (extensiones.containsKey(extension)) {
	                int contador = extensiones.get(extension);
	                contador++;
	                extensiones.put(extension, contador);
	            } else {
	                extensiones.put(extension, 1);
	            }
	        }
	    }
	 for (String extension : extensiones.keySet()) {
	        int cantidad = extensiones.get(extension);
	        System.out.println("Extension: " + extension + ", Cantidad: " + cantidad);
	    }
	}
	

}
