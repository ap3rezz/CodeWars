package com.gsd.daw.prog.CodeWars_aperez;

public class XO {
	  
	  public static boolean getXO (String str) {
	    
		  boolean resultado=false;
		  
		  
		  int countX=0;
		  int countO=0;
		  String aux="";
		  
	    for(int i=0;i<str.length();i++){
	      
	    	aux=String.valueOf(str.charAt(i));
	    	
	    	if(aux.equalsIgnoreCase("x")){
	    	  countX++;
	    	}
	    	
	    	if(aux.equalsIgnoreCase("o")){
		    	  countO++;
		    }
	    
	    }
	    
	    if(countX==countO) {
	    	return resultado=true;
	    }
	    
	    return resultado;
	    
	    
	    
	  }
	}
