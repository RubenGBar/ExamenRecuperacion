package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Resultado Introducido | Resultado Esperado 					| Resultado Obtenido
 *  1					 | Imprime un tablero con casillas 1x1  | Imprime un tablero con casillas 1x1
 *  2					 | Imprime un tablero con casillas 2x2  | Imprime un tablero con casillas 2x2
 *  3 					 | Imprime un tablero con casillas 3x3  | Imprime un tablero con casillas 2x2  
 *  4 					 | Imprime un tablero con casillas 4x4  | Imprime un tablero con casillas 4x4  
 *  5 					 | Imprime un tablero con casillas 5x5  | Imprime un tablero con casillas 5x5  
 * */
public class Ejercicio01 {

	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Variable para guardar el valor del escaque
		int escaque = 0;

		// Pido que introduzca un valor para los escaques
		System.out.println("Introduzca un valor para los escauqes (tamaño de las casillas)");
		// Try catch para evitar que introduzca valores no válidos
		try {
			// Leo el valor de escaque del teclado
			escaque = sc.nextInt();
		} catch (InputMismatchException e) {
			// Muestro el mensaje de error
			System.out.println("Se ha introducido un valor erroneo");
			// Limpio el teclado
			sc.nextLine();
			// Introduzco un valor para que se muestre el mensaje de finalización del
			// programa
			escaque = -1;
		}

		// Compruebo que el número sea mayor que 0 y solo entonces pinto el tablero
		if (escaque <= 0) {
			// Si el número es menor que cero muestro un mensaje de finalización del
			// programa
			System.out.println("El programa ha terminado");
		} else {
			// Bucle for para controlar las columnas del tablero
			for (int i = 0; i < 8; i++) {
				// Si el la i es par empiezo imprimiendo espacios
				if (i % 2 == 0) {
					/*
					 * Imprimo un salto de línea cuando se imprima 
					 * cada fila con las casillas con su medida
					 * adecuada se imprima. 1x1, 2x2 etc
					 */
					for (int j = 0; j < escaque; j++) {
						/*
						 * Imprimo el número de casillas, en este caso 8
						 */
						for (int k = 0; k < 8 / 2; k++) {
							// Imprimo los espacios
							for (int l = 0; l < escaque; l++) {
								System.out.print(" ");
							}
							// Imprimo las almoadillas
							for (int n = 0; n < escaque; n++) {
								System.out.print("#");
							}
						}
						System.out.println();
					}
				// Si el la i es impar empiezo imprimiendo almoadillas
				} else {
					/*
					 * Imprimo un salto de línea cuando se imprima
					 * cada fila con las casillas con su medida
					 * adecuada se imprima. 1x1, 2x2 etc
					 */
					for (int j = 0; j < escaque; j++) {
						/*
						 * Imprimo el número de casillas, en este caso 8
						 */
						for (int k = 0; k < 8 / 2; k++) {
							// Imprimo las almoadillas 
							for (int l = 0; l < escaque; l++) {
								System.out.print("#");
							}
							// Imprimo los espacios
							for (int n = 0; n < escaque; n++) {
								System.out.print(" ");
							}
						}
						System.out.println();
					}
				}
			}
		}
		// Cierro el Scanner
		sc.close();
	}

}
