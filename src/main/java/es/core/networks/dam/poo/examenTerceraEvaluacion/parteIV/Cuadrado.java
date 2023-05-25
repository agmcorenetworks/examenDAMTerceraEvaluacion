package es.core.networks.dam.poo.examenTerceraEvaluacion.parteIV;

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
    public String getName() {
        return "Cuadrado";
    }
}