package com.gsd.daw.prog.CodeWars_aperez;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
	public static String formatDuration(int seconds) {

		if(seconds==0) {
			return "now";
		}
		
		int secondsInt = 0;
		int minutes = 0;
		int hours = 0;
		int days = 0;
		int years = 0;

		secondsInt = seconds;

		while ((secondsInt / 60) >= 1) {
			minutes++;
			secondsInt -= 60;
		}

		while ((minutes / 60) >= 1) {
			hours++;
			minutes -= 60;
		}

		while ((hours / 24) >= 1) {
			days++;
			hours -= 24;
		}

		while ((days / 365) >= 1) {
			years++;
			days -= 365;
		}

		List<String> solution = new ArrayList<String>() {
		};
		String resultado = "";

		if (years > 0) {
			if (years == 1) {
				solution.add(years + " year");
			} else {
				solution.add(years + " years");
			}

		}

		if (days > 0) {
			if (days == 1) {
				solution.add(days + " day");
			} else {
				solution.add(days + " days");
			}

		}

		if (hours > 0) {
			if (hours == 1) {
				solution.add(hours + " hour");
			} else {
				solution.add(hours + " hours");
			}

		}

		if (minutes > 0) {
			if (minutes == 1) {
				solution.add(minutes + " minute");
			} else {
				solution.add(minutes + " minutes");
			}
		}

		if (secondsInt > 0) {

			if (secondsInt == 1) {
				solution.add(secondsInt + " second");
			} else {
				solution.add(secondsInt + " seconds");
			}

		}

		if (solution.size() == 1) {
			System.out.println(solution.get(0));
			return solution.get(0);
		}

		if (solution.size() == 2) {
			return solution.get(0) + " and " + solution.get(1);
		}

		if (solution.size() > 2) {
			for (int i = 0; i < solution.size(); i++) {
				resultado += solution.get(i);

				if (i == solution.size() - 2) {
					resultado += " and ";
				} else if (i == solution.size() - 1) {

				} else {
					resultado += ", ";
				}

			}
		}

		// System.out.println(solution);
		return resultado;

	}

}
