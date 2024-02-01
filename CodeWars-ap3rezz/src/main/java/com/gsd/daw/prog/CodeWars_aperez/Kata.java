package com.gsd.daw.prog.CodeWars_aperez;

public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    
	  
	  int asciiResultado=0;
	  int contador=0;
	  
	  for(int i=1;i<array.length;i++) {
		  if(array[i]-1!=array[i-1]) {
			  asciiResultado=array[i];
		  }
		  else {
			  contador++;
		  }
		  if(contador==array.length-1) {
			  asciiResultado=array[0];
		  }
		  
	  }
	  
	//  System.out.println((char) (Integer.parseInt(String.valueOf(asciiResultado-1))));
	  
	  return (char) (asciiResultado-1);
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
}
