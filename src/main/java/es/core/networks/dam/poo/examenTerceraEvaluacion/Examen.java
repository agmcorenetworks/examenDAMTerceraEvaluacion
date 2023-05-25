package es.core.networks.dam.poo.examenTerceraEvaluacion;
import es.core.networks.dam.poo.examenTerceraEvaluacion.parte.ParteI;
import es.core.networks.dam.poo.examenTerceraEvaluacion.parteII.ParteII;

public class Examen {

	
	/**
	 
	 Examen 3ª Evaluación POO DAM

Instrucciones:

- Clonar el repositorio del examen
- Crear una rama con nombre: Nombre_apellidos_terceraEvaluacionDAM
- moverse a la nueva rama creada
- empezar a realizar los ejercicios listados en el PDF de la carpeta resources
- al terminar hacer commit y push de la rama creada
- Verificar en la página git que se ha subido la rama

Realizar los ejercicios de las dos partes, creando las clases y carpetas necesarias, se podrán crear las clases/métodos de apoyo que se consideren necesarias.

	
	 */
	public static void main(String[] args) {
        // Parte I
        System.out.println("Parte I:");
        ParteI.cadenas();
        ParteI.dam();
        ParteI.literal();
        ParteI.arrayString();
        String frase = "Esta es una frase de prueba";
        System.out.println(ParteI.buscaEspacios(frase));
        ParteI.usoStringBuffer();
        System.out.println();
        
        // Parte II
        System.out.println("Parte II:");
        ParteII.pintarMatriz();
        System.out.println();
        ParteII.sumarMatrices();
        System.out.println();
        ParteII.getNumeroExtensiones();    
	}
}