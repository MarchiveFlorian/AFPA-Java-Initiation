package com.example;

public class Crypto {
    
    // 16 Chiffrement par décalage
	// https://www.geeksforgeeks.org/caesar-cipher-in-cryptography/
	public static StringBuffer caesarCipher(String str, int shift_value, String shift_direction) {

		StringBuffer result = new StringBuffer();

		// Ajuster le décalage en fonction de la direction
		if (shift_direction.equalsIgnoreCase("LEFT")) {
			shift_value = 26 - (shift_value % 26); // Convertir le décalage gauche en décalage droit équivalent
		} else if (shift_direction.equalsIgnoreCase("RIGHT")) {
			shift_value = shift_value % 26; // Assurer que le décalage est dans la plage 0-25
		} else {
			throw new IllegalArgumentException("shift_direction doit être 'RIGHT' ou 'LEFT'");
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				ch = (char) (((int) str.charAt(i) + shift_value - 65) % 26 + 65); // Convertit le ch en son code ASCII,
																					// -65 pour que 'A' devienne 0, 'B'
																					// = 1 etc, %26 pour rester dans
																					// l'alphabet, +65 reconvertit la
																					// veleur en ACSII majuscule
			} else if (Character.isLowerCase(ch)) {
				ch = (char) (((int) str.charAt(i) + shift_value - 97) % 26 + 97); // même chose mais cette fois 97 pour
																					// la version minuscule
			}
			result.append(ch);
		}
		return result;
	}
}
