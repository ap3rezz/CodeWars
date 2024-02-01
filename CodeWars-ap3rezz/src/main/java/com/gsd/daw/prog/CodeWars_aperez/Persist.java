package com.gsd.daw.prog.CodeWars_aperez;

class Persist {
	public static int persistence(long n) {

		boolean oneDigit = false;

		int number = (int) (n);

		int newNumber = 1;

		String numString = String.valueOf(number);

		int contador = 0;

		if(String.valueOf(number).length()==1) {
			return contador;
		}
		
		while (!oneDigit) {

			if (contador >= 1) {
				numString = String.valueOf(newNumber);
			}

			newNumber = 1;

			for (int i = 0; i < numString.length(); i++) {
				newNumber *= Integer.parseInt(String.valueOf(numString.charAt(i)));

			}

			if (!oneDigit) {
				contador++;
			}
			
			if (String.valueOf(newNumber).length() == 1) {
				oneDigit = true;
				
			}
			
			
			System.out.println(powersOfTwo(0));
			
			

		}
		//System.out.println(contador);
		return contador;
	}
	
	
public static long[] powersOfTwo(int n){
	    
	    long[] resultado=new long[n+1];
	    
	    for(int i=0;i<n;i++){
	      resultado[i]= (long)(Math.exp(i));
	    }
	    
	    return resultado;
	  }
	
}
