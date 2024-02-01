package com.gsd.daw.prog.CodeWars_aperez;

public class BitCounting {

	public static int countBits(int n) {

		String bits = "";

		int contador = 0;

		int[] bytes = { 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

		for (int i = 0; i < bytes.length; i++) {
			if (n >= bytes[i]) {
				bits += "1";
        n-=bytes[i];
				contador++;
			} else {
				bits += "0";
			}
		}
		return contador;
	}

}
