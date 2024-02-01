package com.gsd.daw.prog.CodeWars_aperez;

public class DRoot {
	  public static int digital_root(int n) {
	    
		  String numeroString=String.valueOf(n);;
		  
		  boolean unDigito=false;
		  
		  int[] numeroSeparado;
		  
		  int resultado=0;
		  
		  while(unDigito==false) {
			  
			  resultado=0;
			  
			  
			  
			  numeroSeparado=new int[numeroString.length()];
			  
			  for(int i=0;i<numeroSeparado.length;i++) {				  
				  numeroSeparado[i]=Integer.parseInt(String.valueOf(numeroString.charAt(i)));
				  
				  resultado+=numeroSeparado[i];
			  }
			  
			  numeroString=String.valueOf(resultado);
			  
			  if(numeroString.length()==1) {
				  unDigito=true;
				  
			  }
			  
		  }
		  
		  return Integer.parseInt(numeroString);
		  
		  
	  }
	}
