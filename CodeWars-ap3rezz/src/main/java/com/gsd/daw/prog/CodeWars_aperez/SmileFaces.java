package com.gsd.daw.prog.CodeWars_aperez;

import java.util.*;

public class SmileFaces {

	public static int countSmileys(List<String> arr) {

		int contadorSimile = 0;

		for (String string : arr) {
			if (contieneSmile(string)) {
				contadorSimile++;
			}
		}

		return contadorSimile;

	}

	public static boolean contieneSmile(String posibleSonrisa) {

		if (posibleSonrisa.length() > 3 || posibleSonrisa.length() < 2) {
			return false;
		}

		if (posibleSonrisa.length() == 3 && !posibleSonrisa.contains("-") && !posibleSonrisa.contains("~")) {
			return false;
		}

		if (!posibleSonrisa.endsWith("D") && !posibleSonrisa.endsWith(")")) {
			return false;
		}

		if (!posibleSonrisa.startsWith(":") && !posibleSonrisa.startsWith(";")) {
			return false;
		}

		if (posibleSonrisa.contains("(") || posibleSonrisa.contains("]") || posibleSonrisa.contains("X")) {
			return false;
		}

		if (posibleSonrisa.contains("-") || posibleSonrisa.contains("~")) {
			return true;
		}

		return true;
	}

}
