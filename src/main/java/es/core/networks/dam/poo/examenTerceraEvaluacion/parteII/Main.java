package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Main {

	public static void main(String[] args) {
		// Crear 3 objetos de tipo Circulo
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(7.5);
        Circulo circulo3 = new Circulo(3.0);

        // Crear 3 objetos de tipo Cuadrado
        Cuadrado cuadrado1 = new Cuadrado(4.0);
        Cuadrado cuadrado2 = new Cuadrado(6.0);
        Cuadrado cuadrado3 = new Cuadrado(2.5);

        // Crear un array de tipo Circulo e insertar los objetos
        Circulo[] Figurascirculos = {circulo1, circulo2, circulo3};

        // Crear un array de tipo Cuadrado e insertar los objetos
        Cuadrado[] FigurasCuadrados = {cuadrado1, cuadrado2, cuadrado3};

        // Crear un array de tipo FiguraGeometrica e insertar todos los objetos
        FiguraGeometrica[] figuras = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

        // Crear un array de tipo Estadisticas e insertar todos los objetos
        estadisticas[] estadisticas = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

        // Recorrer los arrays y llamar a los métodos calcularArea y calcularPerimetro
        for (Circulo circulo : Figurascirculos) {
            System.out.println(circulo);
            System.out.println("Área: " + circulo.getArea());
            System.out.println("Perímetro: " + circulo.getPerimetro());
            System.out.println();
        }

        for (Cuadrado cuadrado : FigurasCuadrados) {
            System.out.println(cuadrado);
            System.out.println("Área: " +" "+ cuadrado.getArea());
            System.out.println("Perímetro: "+" " + cuadrado.getPerimetro());
            System.out.println();
        }

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
            System.out.println("Área: " +" "+ figura.getArea());
            System.out.println("Perímetro: "+" " + figura.getPerimetro());
            System.out.println();
        }

        for (estadisticas estadistica : estadisticas) {
            System.out.println(estadistica);
            System.out.println("Área: " +" "+ estadistica.getArea());
            System.out.println("Perímetro: "+" " + estadistica.getPerimetro());
            System.out.println();
        }
    }
}


