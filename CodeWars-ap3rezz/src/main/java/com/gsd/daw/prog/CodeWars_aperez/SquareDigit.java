package com.gsd.daw.prog.CodeWars_aperez;

public class SquareDigit {

	  public int squareDigits(int n) {
	    
		  
		  String longitud= String.valueOf(n);
		  
		  String resultado="";
		  
		  int aux=0;
		  
		  String auxString="";
		  
		  for(int i=0;i<longitud.length();i++){
	      
			  auxString=String.valueOf(longitud.charAt(i));
	    	
			  aux=Integer.parseInt(auxString);
			  resultado+=aux*aux;
	    }
		  
		  return Integer.parseInt(resultado);
		  
	    
	  }

	}