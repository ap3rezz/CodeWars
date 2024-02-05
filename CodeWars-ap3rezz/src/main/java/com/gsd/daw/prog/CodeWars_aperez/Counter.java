package com.gsd.daw.prog.CodeWars_aperez;

public class Counter {

	public static int countSheeps(Boolean[] arrayOfSheeps) {

		int contador = 0;

		for (int i = 0; i < arrayOfSheeps.length; i++) {

			if (arrayOfSheeps[i] != null && arrayOfSheeps[i] == true) {
				contador++;
			}
		}

		System.out.println(contador);
		return contador;

	}
}
