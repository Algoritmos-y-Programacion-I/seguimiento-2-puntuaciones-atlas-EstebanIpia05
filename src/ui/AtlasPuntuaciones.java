// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar
	private static final int
	MAX_JUG = 10;
	private static final int
	MAX_ROND = 5;

	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{	
		int canjug, canron;
		// Declaracion de todas las variables a usar en el programa
		System.out.println("Digite la cantidad de jugadores");
        canjug = escaner.nextInt();

		System.out.println("Digite la cantidad de rondas");
        canron = escaner.nextInt();

		int[] puntua = new int [canron];
		int[] sumaPuntajes = new int [canjug];

		 for (int i = 0; i < canjug; i++){
			for (int j = 0; j < canron; j++) {
			System.out.println("Jugador "+ (i+1) + " - puntaje en ronda "+(j+1));
			System.out.print(">");
			puntua[i] = escaner.nextInt();
			
			}
			sumaPuntajes[i] = calcularSumaTotal(puntua, canron);
            System.out.println("Puntaje " + (i+1) + ": " + sumaPuntajes[i]);
	
		 }

		// Notificacion al usuario de la solicitud de dato

		// Capturamos el dato con nuestro Scanner (que se llama, escaner)



		// Realizamos los cálculos delegandolos a los métodos


		// Notificación al usuario de los resultados


	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public int calcularSumaTotal(int[] numeros, int puntajes) {
		int suma =0;
		for (int i = 0; i<puntajes; i++){
			suma += numeros[i];
			System.out.println("Resultado de la suma: "+ suma);
		} 

        return suma;
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public double calcularPromedio(int[] numeros) {
        return 0;
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    public double encontrarMayor(double[] numeros) {
        return 0;
    }

	

	
}