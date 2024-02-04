package com.gsd.daw.prog.CodeWars_aperez;

public class PigLatin {
	public static String pigIt(String str) {
        
      String[] palabrasSeparadas=str.split(" ");
      
      String resultado="";
      
      for(int i=0;i<palabrasSeparadas.length;i++){
        if(i>0){
                    resultado+=" ";          
        }

        for(int o=0;o<palabrasSeparadas[i].length();o++){
          
          if(o>0){
                      
                      resultado+=String.valueOf(palabrasSeparadas[i].charAt(o));            
          }

        }
        resultado+=String.valueOf(palabrasSeparadas[i].charAt(0));
        if(palabrasSeparadas[i].charAt(0) !=33 || palabrasSeparadas[i].charAt(0) !=63){
            resultado+="ay";
        }

        
      }
      
      
      
      System.out.println(resultado);
      return resultado;
      
    }
}
