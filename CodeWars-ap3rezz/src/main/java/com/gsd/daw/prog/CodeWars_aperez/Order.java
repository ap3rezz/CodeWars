package com.gsd.daw.prog.CodeWars_aperez;

public class Order {
	public static String order(String words) {

		if (words.equals("")) {
			return "";
		}

		String[] stringSeparados = words.split(" ");

		String[] resultado = new String[stringSeparados.length];

		String resultadoFinal = "";

		for (int i = 0; i < stringSeparados.length; i++) {
			for (int o = 0; o < stringSeparados[i].length(); o++) {
				if (stringSeparados[i].charAt(o) >= 48 && stringSeparados[i].charAt(o) <= 57) {
					resultado[stringSeparados[i].charAt(o) - 49] = stringSeparados[i];
				}
			}
		}

		for (int i = 0; i < resultado.length; i++) {
			resultadoFinal += resultado[i];

			if (i != resultado.length - 1) {
				resultadoFinal += " ";
			}
		}

		// System.out.println(resultadoFinal);
		return resultadoFinal;

	}
}
