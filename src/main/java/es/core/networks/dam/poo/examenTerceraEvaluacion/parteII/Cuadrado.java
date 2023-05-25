package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Cuadrado extends FiguraGeometrica{

	private int lado;
	
	public Cuadrado(int lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}
	
}
