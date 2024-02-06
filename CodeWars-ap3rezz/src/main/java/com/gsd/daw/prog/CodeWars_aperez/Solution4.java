package com.gsd.daw.prog.CodeWars_aperez;

public class Solution4 {

	public static boolean validatePin(String pin) {

		if (pin.length() != 4 && pin.length() != 6) {
			return false;
		}

		for (int i = 0; i < pin.length(); i++) {
			if (pin.charAt(i) >= 48 && pin.charAt(i) <= 57) {

			} else {
				return false;
			}

		}

		return true;
	}

}
