package com.gsd.daw.prog.CodeWars_aperez;

import java.util.List;

public class ConnectFour {

	public static String whoIsWinner(List<String> piecesPositionList) {

		String[][] tablero = new String[6][7];

		String[] jugada;

		int[] contadorProfundidad = { 6, 6, 6, 6, 6, 6, 6 };

		for (int i = 0; i < piecesPositionList.size(); i++) {

			jugada = piecesPositionList.get(i).split("_");

			tablero[contadorProfundidad[jugada[0].charAt(0) - 65]][jugada[0].charAt(0) - 65] = jugada[1];
			contadorProfundidad[jugada[0].charAt(0) - 65]--;
		}

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {

				if (tablero[i][j].equals("Red") || tablero[i][j].equals("Yellow")) {

				}

			}
		}

		return "Draw";
	}
}
