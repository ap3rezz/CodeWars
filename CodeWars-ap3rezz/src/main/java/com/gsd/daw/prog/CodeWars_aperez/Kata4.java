package com.gsd.daw.prog.CodeWars_aperez;

import java.util.Arrays;

public class Kata4 {
	public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

		int[] mediaClase = new int[classPoints.length + 1];
		mediaClase = Arrays.copyOf(classPoints, classPoints.length + 1);

		mediaClase[mediaClase.length - 1] = yourPoints;

		if ((Arrays.stream(mediaClase).sum() / classPoints.length) > yourPoints) {
			return false;
		}

		return true;

	}
}