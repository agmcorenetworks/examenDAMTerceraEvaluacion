package es.core.networks.dam.poo.examenTerceraEvaluacion.parteII;

//Clase abstracta FiguraGeometrica que implementa la interfaz Estadisticas
abstract class FiguraGeometrica implements Estadisticas {
    public abstract String getName();

    @Override
    public double getArea() {
        // Implementación genérica para el cálculo del área
        return 0.0;
    }

    @Override
    public double getPerimetro() {
        // Implementación genérica para el cálculo del perímetro
        return 0.0;
    }
}
