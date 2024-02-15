package com.gsd.daw.prog.CodeWars_aperez;

import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
	
		  public static String oddOrEven (int[] array) {
		  
		    if(Arrays.stream(array).sum()%2==0){
		      return "odd";
		    }
		    return "even";
		    
		  }
		
}
