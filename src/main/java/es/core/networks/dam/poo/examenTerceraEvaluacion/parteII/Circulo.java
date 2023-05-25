package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String getName() {
        return "Circulo";
    }
    

}