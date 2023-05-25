package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

//Clase Cuadrado que hereda de FiguraGeometrica
class Cuadrado extends FiguraGeometrica {
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