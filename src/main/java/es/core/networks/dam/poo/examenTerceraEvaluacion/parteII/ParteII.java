package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;
import java.util.HashMap;

public class ParteII {
	
	// Ejercicio 1
    public static void mostrarMatriz() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        } 
    }
    
    public static void mostrarMatrizInvertida() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("Matriz invertida:");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    // Ejercicio 2
    public static void sumaMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("No se pueden sumar las matrices. Las dimensiones no coinciden.");
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
        
        System.out.println("Suma de las matrices:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Ejercicio 3
    public static void getNumeroExtensiones() {
        String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";
        String[] ficheros = datos.split(";");
        HashMap<String, Integer> extensiones = new HashMap<>();
        
        for (String fichero : ficheros) {
            String[] partes = fichero.split("\\.");
            if (partes.length == 2) {
                String extension = partes[1];
                extensiones.put(extension, extensiones.getOrDefault(extension, 0) + 1);
            }
        }
        
        System.out.println("Estas son las extensiones encontradas:");
        for (String extension : extensiones.keySet()) {
            int cantidad = extensiones.get(extension);
            System.out.println(extension + ": " + cantidad);
        }
    }
    
    // Ejercicio 4
    public interface Estadisticas {
        double getArea();
        double getPerimetro();
    }

    public abstract class FiguraGeometrica implements Estadisticas {
        public abstract String getName();
    }

    public class Circulo extends FiguraGeometrica {
        private double radio;
        
        public Circulo(double radio) {
            this.radio = radio;
        }
        
        @Override
        public String getName() {
            return "Círculo";
        }
        
        @Override
        public double getArea() {
            return Math.PI * radio * radio;
        }
        
        @Override
        public double getPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

    public class Cuadrado extends FiguraGeometrica {
        private double lado;
        
        public Cuadrado(double lado) {
            this.lado = lado;
        }
        
        @Override
        public String getName() {
            return "Cuadrado";
        }
        
        @Override
        public double getArea() {
            return lado * lado;
        }
        
        @Override
        public double getPerimetro() {
            return 4 * lado;
        }
    }
    
}


