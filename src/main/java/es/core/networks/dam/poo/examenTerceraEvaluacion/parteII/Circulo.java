package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Circulo extends FiguraGeometrica{

	private int radio;
	
	public Circulo(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*(radio*radio);
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}
	
}
