package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

// Clase Circulo que hereda de FiguraGeometrica
class Circulo extends FiguraGeometrica {
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
