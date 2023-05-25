package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

import java.util.HashMap;

public class ParteII {
    public static void pintarMatrizOriginal() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void pintarMatrizInvertida() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matriz invertida:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("No se pueden sumar las matrices. Las dimensiones no coinciden.");
            return;
        }

        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] matrizSuma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void getNumeroExtensiones(String datos) {
        String[] ficheros = datos.split(";"); 
        HashMap<String, Integer> extensiones = new HashMap<>();

        for (String fichero : ficheros) {
            String[] partes = fichero.split("\\.");
            if (partes.length == 2) {
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
            int contador = extensiones.get(extension);
            System.out.println("Extensión: " + extension + ", Cantidad: " + contador);
        }
    }
    
    public interface Estadisticas {
        double getArea();
        double getPerimetro();
    }
    
    public abstract class FiguraGeometrica implements Estadisticas {
        public abstract String getNombre();
    }
    
    public class Circulo extends FiguraGeometrica {
        private double radio;
        
        public Circulo(double radio) {
            this.radio = radio;
        }
        
        @Override
        public double getArea() {
            return Math.PI * radio * radio;
        }
        
        @Override
        public double getPerimetro() {
            return 2 * Math.PI * radio;
        }
        
        @Override
        public String getNombre() {
            return "Círculo";
        }
    }
    
    public class Cuadrado extends FiguraGeometrica {
        private double lado;
        
        public Cuadrado(double lado) {
            this.lado = lado;
        }
        
        @Override
        public double getArea() {
            return lado * lado;
        }
        
        @Override
        public double getPerimetro() {
            return 4 * lado;
        }
        
        @Override
        public String getNombre() {
            return "Cuadrado";
        }
    }

    public static void main(String[] args) {
        int[][] matriz1 = {{2, 4, 8}, {1, 3, 7}, {3, 5, 9}};
        int[][] matriz2 = {{1, 3, 5}, {2, 4, 6}, {3, 5, 7}};
        String datos = "hola.rm;usuarios.rm;test.txt;texto.rm;claves.rm;cosas.java;gatitos.rm;perritos.java;saludos.txt;adios.rm;fuego.txt;taza.java;java.txt;cuanto.txt;trece.java";

        pintarMatrizOriginal();
        System.out.println();
        pintarMatrizInvertida();
        System.out.println();
        sumarMatrices(matriz1, matriz2);
        System.out.println();
        getNumeroExtensiones(datos);
        System.out.println();
        ParteII parteII = new ParteII();
        
        Circulo[] circulos = new Circulo[3];
        for (int i = 0; i < 3; i++) {
            double radio = Math.random() * 10 + 1;
            circulos[i] = parteII.new Circulo(radio);
        }
        
        Cuadrado[] cuadrados = new Cuadrado[3];
        for (int i = 0; i < 3; i++) {
            double lado = Math.random() * 10 + 1;
            cuadrados[i] = parteII.new Cuadrado(lado);
        }
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        System.arraycopy(circulos, 0, figuras, 0, 3);
        System.arraycopy(cuadrados, 0, figuras, 3, 3);
        
        Estadisticas[] estadisticas = new Estadisticas[6];
        System.arraycopy(circulos, 0, estadisticas, 0, 3);
        System.arraycopy(cuadrados, 0, estadisticas, 3, 3);
        
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.getNombre() + " - Área: " + figura.getArea() + ", Perímetro: " + figura.getPerimetro());
        }
        
        System.out.println();
        
        for (Estadisticas estadistica : estadisticas) {
            System.out.println(estadistica.getClass().getSimpleName() + " - Área: " + estadistica.getArea() + ", Perímetro: " + estadistica.getPerimetro());
        }
    
   
    }

    
}

