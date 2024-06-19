package com.example;

public class Recursivity {
    
    // 15.1 Somme d'éléments d'un tableau
	// https://www.geeksforgeeks.org/sum-array-elements-using-recursion/
	public static int recursiveAddArray(int[] array, int n) {

		if (n <= 0) {
			return 0;
		} else {
			return (recursiveAddArray(array, n - 1) + array[n - 1]);
		}
	}

	// 15.2 Insérer un symbole dans une chaine de caractères
	public static String recursiveString(String str) {

		// Condition d'arrêt : si la chaîne est vide ou ne contient qu'un seul caractère
		if (str.length() <= 1) {
			return str;
		}

		// Prendre le premier caractère, ajouter un tiret et appeler récursivement la
		// fonction sur le reste de la chaîne
		return Character.toString(str.charAt(0)) + "-" + recursiveString(str.substring(1));
	}
}
