package com.gsd.daw.prog.CodeWars_aperez;

public class Multiplication{
	  public static int [][] multiplicationTable(int n){
	    
	    int[][] tableResultado=new int[n][n];
	    
	    for(int i=0;i<tableResultado.length;i++){
	      for(int o=0;o<tableResultado[i].length;o++){
	        tableResultado[i][o]=(i+1)*(o+1);
	      }
	    }
	    
	    return tableResultado;
	    
	  }
	}
