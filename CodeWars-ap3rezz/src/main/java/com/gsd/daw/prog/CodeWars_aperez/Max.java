package com.gsd.daw.prog.CodeWars_aperez;

import java.util.Arrays;

public class Max {
	public static int sequence(int[] arr) {
		
		
		
		int mediaArray=Arrays.stream(arr).sum()/arr.length;
		int resultado=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>mediaArray) {
				resultado+=arr[i];
			}
		
		}
		
	    return 0;
	  }
}
