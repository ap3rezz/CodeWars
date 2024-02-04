package com.gsd.daw.prog.CodeWars_aperez;

import java.util.Arrays;

public class StringSplit {
    public static String[] solution(String s) {
        

    	
      if(s.length()%2==1){
    	  s+="_";
    	 
      }
    	
  	String[] resultado= new String[s.length()/2];
  	
    int aux=0;
    	for(int i=0;i<s.length();i++) {
    		
    		if(i%2==0) {
    			resultado[aux]=String.valueOf(s.charAt(i));
    		}
    		else {
    			resultado[aux]+=String.valueOf(s.charAt(i));
    		}
    		if(i%2==1 && i!=0) {
    			aux++;
    		}
    	}
      
    //	System.out.println(Arrays.toString(resultado));
    	return resultado;
    	
    }
}
