package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

abstract class FiguraGeometrica implements estadisticas {
	
	public abstract String getNombre();

    @Override
    public String toString() {
        return "Figura: " + getNombre();
    }

}
