package com.gsd.daw.prog.CodeWars_aperez;

public class Vowels {

	  public static int getCount(String str) {
	    
	    String aux="";
		int resultado=0;
	    for(int i=0;i<str.length();i++){
	    	aux=String.valueOf(str.charAt(i));
	    	
	    	if(aux.equalsIgnoreCase("a") || aux.equalsIgnoreCase("e") || aux.equalsIgnoreCase("i") || aux.equalsIgnoreCase("o") || aux.equalsIgnoreCase("u")) {
	    		resultado++;
	    	}
	    }
	    
	    return resultado;
	  }

	}