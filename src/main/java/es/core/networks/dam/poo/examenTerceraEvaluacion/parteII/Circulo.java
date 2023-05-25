package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Circulo extends FiguraGeometrica {

	
	private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
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
