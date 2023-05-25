package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public String getName() {
        return "Cuadrado";
    }
   
}
