package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

public class Cuadrado extends FiguraGeometrica {
	private double lado;
	
	//constructor
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}
	
	
	//SOBREESCRIBO 
	
	@Override
	 public String getName() {
        return "Es un Cuadrado";
    }


	public double getArea() {
		return this.lado * this.lado;
	}

	public double getPerimetro() {
		return 4*this.lado;
	}

}
