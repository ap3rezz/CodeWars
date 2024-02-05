package com.gsd.daw.prog.CodeWars_aperez;

import java.lang.StringBuilder;

class Solution2 {

	static String toCamelCase(String s) {

		String[] stringSeparados = s.split("_|-");

		StringBuilder stringBuild = null;

		String resultado = "";

		for (int i = 0; i < stringSeparados.length; i++) {

			stringBuild = new StringBuilder(stringSeparados[i]);

			if (i != 0) {
				stringBuild.replace(0, 1, String.valueOf(stringBuild.charAt(0)).toUpperCase());
				resultado += stringBuild;

			} else {

				if (String.valueOf(stringSeparados[i].charAt(0)).equals(String.valueOf(stringSeparados[i].charAt(0)).toUpperCase())) {

					stringBuild.replace(0, 1, String.valueOf(stringBuild.charAt(0)).toLowerCase());
					resultado += stringBuild;
				}
				else {
					resultado += stringBuild;
				}

			}

		}

		System.out.println(resultado);

		return resultado;

	}
}
