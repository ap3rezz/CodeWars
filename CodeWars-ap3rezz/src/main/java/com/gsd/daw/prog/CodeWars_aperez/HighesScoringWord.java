package com.gsd.daw.prog.CodeWars_aperez;

public class HighesScoringWord {
	public static String high(String s) {

		String[] cantidadPalabras=s.split(" ");
		
		int[] scores=new int[cantidadPalabras.length];
		
		for (int i = 0; i < cantidadPalabras.length; i++) {
			for(int o=0;o<cantidadPalabras[i].length();o++) {
				scores[i]+=(int)(cantidadPalabras[i].charAt(o)-96);
			}
		}
		
		int scoreResultado=scores[0];
		int posicionString=0;
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>scoreResultado) {
				scoreResultado=scores[i];
				posicionString=i;
			}
		}
		
		return cantidadPalabras[posicionString]; 

	}

}
