package com.gsd.daw.prog.CodeWars_aperez;

public class FindOutlier {
	  static int find(int[] integers) {
	    
		  int posiblePar=0;
		  int posibleNopar=0;
		  int contadorPar=0;
		  
		  for(int i=0;i<integers.length;i++) {
			  if(integers[i]%2==0) {
				  posiblePar=integers[i];
				  contadorPar++;
			  }
			  else {
				  posibleNopar=integers[i];
			  }
		  }
		  
		  if(contadorPar!=1) {
			  return posibleNopar;
		  }
		  else {
			  return posiblePar;
		  }
		  
	    
	    
	    
	    
	  }
}