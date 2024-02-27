package com.gsd.daw.prog.CodeWars_aperez;

import java.util.HashMap;

public class ConversionRomanic {
	public String solution(int n) {
        
	      String resultado="";
	      HashMap<String, Integer> valoresRomanos=new HashMap<>();
	      
	      valoresRomanos.put("M", 1000);
	      valoresRomanos.put("D", 500);
	      valoresRomanos.put("C", 100);
	      valoresRomanos.put("L", 50);
	      valoresRomanos.put("X", 10);
	      valoresRomanos.put("V", 5);	      
	      valoresRomanos.put("I", 1);
		
	      
	      while(n>0) {
	    	  
	    	  if(n%1000==0) {
	    		  resultado+="M";
	    		  n-=1000;
	    	  }
	    	  if(n/500>1) {
	    		  resultado+="D";
	    		  n-=500;
	    	  }
	    	  if(n/100>1) {
	    		  resultado+="C";
	    		  n-=100;
	    	  }
	    	  
	    	  if(n/50>1) {
	    		  resultado+="L";
	    		  n-=50;
	    	  }
	    	  
	    	  if() {
	    		  
	    	  }
	    	  
	    	  
	    	  
	      }
	      

	      
	      return "";
	    }
}
