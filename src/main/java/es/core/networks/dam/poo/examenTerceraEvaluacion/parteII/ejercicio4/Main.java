package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII.ejercicio4;

public class Main {
    public static void main(String[] args) {
    	
    	// Creo los objetos de circulo y los asigno a un hueco del array
        Circulo[] circulos = new Circulo[3];
        circulos[0] = new Circulo(2.5);
        circulos[1] = new Circulo(3.0);
        circulos[2] = new Circulo(1.8);

        // Creo los objetos de cuadrado y los asigno a un hueco del array
        Cuadrado[] cuadrados = new Cuadrado[3];
        cuadrados[0] = new Cuadrado(4.0);
        cuadrados[1] = new Cuadrado(2.5);
        cuadrados[2] = new Cuadrado(3.2);

        //Creo un array de tipo FiguraGeometrica e insertar los circulo
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = circulos[0];
        figuras[1] = circulos[1];
        figuras[2] = circulos[2];
        figuras[3] = cuadrados[0];
        figuras[4] = cuadrados[1];
        figuras[5] = cuadrados[2];

      //Creo un array de tipo Estadisticas e insertar los circulo
        Estadisticas[] estadisticas = new Estadisticas[6];
        estadisticas[0] = circulos[0];
        estadisticas[1] = circulos[1];
        estadisticas[2] = circulos[2];
        estadisticas[3] = cuadrados[0];
        estadisticas[4] = cuadrados[1];
        estadisticas[5] = cuadrados[2];

        // Bucle for each para recorrer el rray de FiguraGeometrica facilmente y sacar cada objeto
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Nombre: " + figura.getName());
            System.out.println("Área: " + figura.getArea());
            System.out.println("Perímetro: " + figura.getPerimetro());
            System.out.println();
        }
        // Bucle for each para recorrer el array de Estadisticas facilmente y sacar cada objeto
        for (Estadisticas estadistica : estadisticas) {
            System.out.println("Área: " + estadistica.getArea());
            System.out.println("Perímetro: " + estadistica.getPerimetro());
            System.out.println();
        }
    }
 }
