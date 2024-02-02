package com.gsd.daw.prog.CodeWars_aperez;

public class Kata2 {
	public static String incrementString(String str) {

		/*
		 * int aumentarNum=Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
		 * 
		 * int aux;
		 * 
		 * aumentarNum++; if(aumentarNum==10){ aumentarNum=0;
		 * aux=Integer.parseInt(String.valueOf(str.charAt(str.length()-2))); aux+=1; }
		 * 
		 * 
		 * return
		 */

		String noNumeros = "";
		String numeros = "";

		int contadorCerosIzq = 0;
		String cerosIzq = "";

		
		
		
		if(str.equals("")) {
			return "1";
		}
		
		
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				numeros += String.valueOf(str.charAt(i));
				if (str.charAt(i) == 48) {

					if (i != str.length() - 1) {
						contadorCerosIzq++;
					}

				}
			} else {

				noNumeros += String.valueOf(str.charAt(i));
				if (str.charAt(str.length() - 1) == 48) {

				}
			}
		}

		if(str.charAt(str.length()-1) < 48 || str.charAt(str.length()-1) > 57) {
			return noNumeros +"1";
		}
		
		
		
		int resultado = Integer.parseInt(numeros);
		resultado++;
		
		if(String.valueOf(resultado).length()>numeros.length() && contadorCerosIzq>1) {
			contadorCerosIzq--;
		}
		
		for(int i=1;i<=contadorCerosIzq;i++) {
			cerosIzq+="0";
		}
		

		// System.out.println(noNumeros +resultado);

		return noNumeros + cerosIzq + resultado;

	}
}
