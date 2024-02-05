package com.gsd.daw.prog.CodeWars_aperez;

public class Solution3 {
	public static int century(int number) {

		if(number<100) {
		 String	numerocambiado="00" +String.valueOf(number);
		 number= Integer.parseInt(numerocambiado);
		}
		
		if(number<1000) {
			 String	numerocambiado="0" +String.valueOf(number);
			 number= Integer.parseInt(numerocambiado);
		}
		
		
		String anioComprobar = String.valueOf(number);

		String siglo = String.valueOf(anioComprobar.charAt(0)) + String.valueOf(anioComprobar.charAt(1)) + "00";

		int actual = Integer
				.parseInt(String.valueOf(anioComprobar.charAt(0) + String.valueOf(anioComprobar.charAt(1))));
		int siguiente = actual + 1;

		if (number > Integer.parseInt(siglo)) {
			return siguiente;
		}

		return actual;

	}
}
