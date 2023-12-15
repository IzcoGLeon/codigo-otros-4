package org.generation;

import java.util.Scanner;

/**
 * El código toma un input por medio del uso del objeto Scanner y su atributo System.in. Se declaran dos 
 * variables String que alamcenaran la respeusta de cada jugador, posteriormente se evalúa si se ingresaron los 
 * valores específicados por medio de un bloque if - else, si se cumple con la condición de ingreso de valores, 
 * se anida otro bloque if-else para, ahora, evaluar si es empate (usando el método de String .equals()) o no.
 * Al final se imprime un mensaje donde se menciona al ganador y posteriormente se cierra el objeto Scanner.
 */

public class Codigo4 {

	public static void main(String[] args) {

		// Se agrega el input stream para poder ingresar valor mediante Scanner a consola
		Scanner s = new Scanner(System.in);

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		//Se agrega metodo toLowerCase para manejar excepciones donde se escriba una opción con mayúsculas
		String j1 = s.nextLine().toLowerCase();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String j2 = s.nextLine().toLowerCase();
		System.out.println("Jugador 1, tu opción es: " + j1);
		System.out.println("Jugador 2, tu opción es: " + j2);
		
		
		// Condición para evaluar si se ingresan los valores especificados, si no se ejecuta el bloque else
		// que muestra un mensaje de valor inválido
		if ((j1.equals("piedra") || j1.equals("papel") || j1.equals("tijeras"))
				&& (j2.equals("piedra") || j2.equals("papel") || j2.equals("tijeras"))) {
			// Si se cumple condición, ahora se evalúa si es empate o no
			if (j1.equals(j2)) {
				System.out.println("Empate");
			} else {
				int g = 2;
				switch (j1) {
				case "piedra":
					if (j2.equals("tijeras")) {
						g = 1;
						break;
					}

				case "papel":
					if (j2.equals("piedra")) {
						g = 1;
						break;
					}

				case "tijeras":
					if (j2.equals("papel")) {
						g = 1;
						break;
					}
				}
				System.out.println("Gana el jugador " + g);
			}

		} else {
			System.out.println("Ingresaste una opción incorrecta, intenta de nuevo");
		}
		// Se cierra objeto Scanner
		s.close();

	}
}


