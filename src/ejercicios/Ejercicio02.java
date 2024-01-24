package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Resultado Introducido | Resultado Esperado					| Resultado Obtenido
 *  8 y 5, S			 | 3 y 55 Sigue el programa 			| 3 y 55 Sigue el programa
 *  12 y 0, N			 | 12 y 0 Termina el programa			| 12 y 0 Termina el programa
 *  10 y 9, df			 | 1 y 51 Termina el programa  			| 1 y 51 Termina el programa
 *  4 y 0, S			 | 8 y 0  Sigue el programa				| 8 y 0  Sigue el programa
 *  aasdf y as			 | Me vueleve a pedir horas y minutos 	| Me vueleve a pedir horas y minutos
 * */
public class Ejercicio02 {

	public static void main(String[] args) {
		// Creo el Scanner
		Scanner sc = new Scanner(System.in);
		// Guardo las horas introducidas por el teclado
		int hora = 0;
		// Guardo los minutos introducidos por teclado
		int min = 0;
		// Variable para volver a repetir el programa si se introduce S
		String repetir = "";
		// Variable para que el programa siempre se repita
		boolean repite = true;
		// Constante para poder calcular las horas
		final int HORAENPUNTO = 12;
		// Constante para poder calcular las horas
		final int MINENPUNTO = 60;
		// Variable para calcular la hora real
		int horaReal = 0;
		// Variable para calcular lso minutos reales
		int minReal = 0;
		
		// Repito todo el programa hasta que se introduzca algo distinto a S
		do {
			// Do while para que introduzca una hora hasta que sea correcta
			do {
				// Pido que introduzca una cantidad de horas
				System.out.println("Introduzca una hora vista en el espejo: ");

				// Try catch para que hora sea un valor correcto
				try {
					// Leo el valor de hora del teclado
					hora = sc.nextInt();
				} catch (InputMismatchException e) {
					// Muestro el mensaje de error
					System.out.println("Se ha introducido un valor erroneo");
					// Limpio el teclado
					sc.nextLine();
					// Introduzco un valor para que se vuelva a pedir un valor
					hora = -1;
				}

			} while (hora > 12 || hora < 1);

			// Do while para que introduzca una cantidad de minutos hasta que sea correcta
			do {
				// Pido que introduzca una cantidad de minutos
				System.out.println("Introduzca unos minutos vistos en el espejo: ");

				// Try catch para que min sea un valor correcto
				try {
					// Leo el valor de min del teclado
					min = sc.nextInt();
				} catch (InputMismatchException e) {
					// Muestro el mensaje de error
					System.out.println("Se ha introducido un valor erroneo");
					// Limpio el teclado
					sc.nextLine();
					// Introduzco un valor para que se vuelva a pedir un valor
					min = -1;
				}

			} while (min > 59 || min < 0);
			
			/* Si no me introduce minutos para calcular la hora real solo tengo 
			 * que restarle la hora introducida a 12*/
			if(min == 0) {
				horaReal = HORAENPUNTO - hora;
			}else {
			/*
			* Si me introduce minutos para calcular la hora real tengo que restarle
			* la hora introducida a 12 y menos 1 y para calcular los minutos tengo que 
			* restarle los minutos introducidos a 60
			*/
				horaReal = HORAENPUNTO - hora - 1;
				minReal = MINENPUNTO - min;
			}
			
			// En cualquier caso las 12 siempre serán las 12
			if (hora == 12) {
				horaReal = 12;
			}
			
			// Muestro por pantalla la hora real
			System.out.println("La hora real es: " + horaReal + " : " + minReal);
			
			// Le pregunto si quiere volver a repetir el programa
			System.out.println("¿Quiere volver a introducir una hora? Si es así pulse S, sino N");
			// Leo el valor de repetir del teclado
			repetir = sc.next();

			// Si introduce algo que no sea S termina el programa
			if (repetir.equals("S")) {
				break;
			}

		} while (repite);
		
		// Muestro que el programa ha terminado
		System.out.println("El programa ha terminado");
		
		// Cierro el Scanner
		sc.close();
	}

}
