package com.gsd.daw.prog.CodeWars_aperez;

public class NumberUtils {


	
    public static boolean isNarcissistic(int number) {
        
    	String numeroString=String.valueOf(number);
    	
    	String numeroTemporal="";
    	
    	int [] numeroSeparado=new int[numeroString.length()];
    	
    	int resultado=0;
    	
    	for(int i=0;i<numeroSeparado.length;i++) {
    		
    		numeroTemporal=String.valueOf(numeroString.charAt(i));
    		
    		numeroSeparado[i]=Integer.parseInt(numeroTemporal);
    	
    		numeroSeparado[i]=(int)(Math.pow(numeroSeparado[i], numeroString.length()));
    		
    		resultado+=numeroSeparado[i];
    	}
    	
    	
    	if(resultado!=number) {
    		return false;
    	}
    	
    	return true;
    	
    	
    }

}