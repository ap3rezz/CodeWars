package com.gsd.daw.prog.CodeWars_aperez;

import java.util.ArrayList;
import java.util.List;

public class JustifyText {
	public static String justify(String text, int width) {
	    
		List<String> texto=new ArrayList<String>();
		
		for(int i=0;i<text.length();i++) {
			texto.add(String.valueOf(text.charAt(i)));
		}
		
		int repaso=width;
		
		while(repaso<=width) {
			
			if(texto.get(repaso).matches("\\p{L}" ) || texto.get(repaso).equals(",") || texto.get(repaso).equals(".") && texto.get(repaso+1).equals(" ")) {
				texto.remove(repaso+1);
				texto.add(repaso+1,"\n");	
			}
			
			else if(texto.get(repaso).matches("\\p{L}") && texto.get(repaso).matches("\\p{L}")) {
				
				
				
			}
		
		
		
		repaso+=width;
		}
		
		
		
		
		
		return text;
	  }
}
