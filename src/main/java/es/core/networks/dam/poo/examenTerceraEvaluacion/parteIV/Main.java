package es.core.networks.dam.poo.examenTerceraEvaluacion.parteIV;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo(9);
        Circulo circulo3 = new Circulo(4);

        Cuadrado cuadrado1 = new Cuadrado(2);
        Cuadrado cuadrado2 = new Cuadrado(9);
        Cuadrado cuadrado3 = new Cuadrado(3);

        Circulo[] circulos = {circulo1, circulo2, circulo3};
        Cuadrado[] cuadrados = {cuadrado1, cuadrado2, cuadrado3};

        FiguraGeometrica[] figuras = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

        Estadisticas[] estadisticas = {circulo1, circulo2, circulo3, cuadrado1, cuadrado2, cuadrado3};

        for (Circulo circulo : circulos) {
            calcularAreaYPerimetro(circulo);
        }

        for (Cuadrado cuadrado : cuadrados) {
            calcularAreaYPerimetro(cuadrado);
        }

        for (FiguraGeometrica figura : figuras) {
            calcularAreaYPerimetro(figura);
        }

        for (Estadisticas estadistica : estadisticas) {
            calcularAreaYPerimetro(estadistica);
        }
    }

    public static void calcularAreaYPerimetro(Estadisticas figura) {
        String nombre = figura.getClass().getSimpleName();
        double area = figura.getArea();
        double perimetro = figura.getPerimetro();

        System.out.println("figura: " + nombre);
        System.out.println("area: " + area);
        System.out.println("perimetro: " + perimetro);
        System.out.println();
    }
}