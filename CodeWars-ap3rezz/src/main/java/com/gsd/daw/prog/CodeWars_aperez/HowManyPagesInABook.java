package com.gsd.daw.prog.CodeWars_aperez;

public class HowManyPagesInABook {

	
	  public static int amountOfPages(int summary) {
	    
	
	    String cadenaNum="";
	    int n=0;
	    int aux=0;
	    
	 /*   
	    if(summary>10000) {
	    	
	    	n=38889;
	    	aux+=10000;
	    }
	    
	    else if(summary>1000) {
	    	
	    	n=2889;
	    	aux+=1000;
	    	
	    }
	    
	    else if(summary>100) {
	    	n=189;
	    	aux+=100;
	    	
	    }
	   */ 
	    
	    while(aux<summary) {
	    	n++;
	    	cadenaNum+=n;
	    	aux+=cadenaNum.length()-aux;
	    	
	    }
	 
	    
	    
	  /*
	    for(int i=1;i<100;i++) {
	    	cadenaNum+=i;
	    }
	    
	    */
	    
	    
	    
	    System.out.println(cadenaNum.length());
	      
	 
	    System.out.println(n);
	    return n;
	  }

	}
