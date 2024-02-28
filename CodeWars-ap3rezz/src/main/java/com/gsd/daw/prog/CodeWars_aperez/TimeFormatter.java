package com.gsd.daw.prog.CodeWars_aperez;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
	public static String formatDuration(int seconds) {
        
		int secondsInt=0;
	    int minutes=0;
	    int hours=0;
	    int days=0;
	    int years=0;
      
      
	    secondsInt=seconds;
	    
	    while((secondsInt/60)>=1){
	      minutes++;
	      secondsInt-=60;
	    }
	    
	    while ((minutes/60)>=1){
	      hours++;
	      minutes-=60;
	    }
	    
	    while ((hours/24)>=1){
        days++;
        hours-=24;
      }
      
      while((days/365)>=1){
        years++;
        days-=365;
      }
      
      List<String> solution=new ArrayList<String>() {};
      
	    if(years>0){
	    	solution.add(years +"years");
	    }
	    
	    if(days>0) {
	    	solution.add(days +"days");
	    }
	    
	    if(hours>0) {
	    	solution.add(hours +"hours");
	    }
	    
	    if(minutes>0) {
	    	solution.add(minutes +"minutes");
	    }
	    
	    if(seconds>0) {
	    	solution.add(seconds +"seconds");
	    }

	    for(int i=0;i<solution.size();i++) {
	    	
	    }
	    
	    
	   // System.out.println(solution);
	    return "";
	     
    }
}
