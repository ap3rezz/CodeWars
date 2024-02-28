package com.gsd.daw.prog.CodeWars_aperez;

public class RangeExtraction {
	public static String rangeExtraction(int[] arr) {

		int numeroComparar = arr[0];
		int posrango = 0;
		int cont = 0;
	
		StringBuilder resultado=new StringBuilder();
		
		resultado.append(arr[0] +",");
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] + 1 == numeroComparar || arr[i] - 1 == numeroComparar) {
				cont++;
				

			} else {
				if (cont >= 2) {
					resultado.deleteCharAt(resultado.length()-1);
					resultado.append("-" + arr[i-1] + ", ");
					cont = 0;
				} else if (cont == 1) {
					resultado.append(arr[i - 1] + "," + arr[i] + ",");
					cont = 0;
				} else if (cont == 0) {
					resultado.append(arr[i] + ",");
					cont = 0;
				}
			}

			numeroComparar=arr[i];

		}
		
		System.out.println(resultado.toString());
		return String.valueOf(resultado);
	}
}
