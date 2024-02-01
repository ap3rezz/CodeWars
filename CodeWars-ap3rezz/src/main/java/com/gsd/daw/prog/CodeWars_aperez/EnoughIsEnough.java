package com.gsd.daw.prog.CodeWars_aperez;

import java.util.Arrays;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {

		int[] resultado = {};
		int contador = 0;
		int posicionEliminar = 0;
		int numeroObservado;

		for (int i = 0; i < elements.length; i++) {

			numeroObservado = elements[i];

			for (int o = 0; o < elements.length; o++) {

				if (numeroObservado == elements[i]) {
					contador++;
				}

				if (contador >= maxOccurrences) {
					posicionEliminar = i;
				}

				System.arraycopy(elements, 0, resultado, 0, posicionEliminar);
				System.arraycopy(elements, posicionEliminar + 1, resultado, posicionEliminar, elements.length - posicionEliminar);

			}

		}
		
		return resultado;

	}
}
