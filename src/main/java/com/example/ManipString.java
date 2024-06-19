package com.example;

import java.util.Scanner;

public class ManipString {
    
    // 9.1 Décompte des voyelles
	public static void vowelCounter() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ex0 9.1: Entrez un mot ou une phrase afin de compter le nombre de voyelle(s).");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			// check if char[i] is vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
					|| str.charAt(i) == 'i'
					|| str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				// count increments if there is vowel in
				// char[i]
				count++;
			}
		}

		// display total count of vowels in string
		System.out.println("Total de voyelles: " + count);

		sc.close();
	}

	// 9.2 Décompte des majuscules
	public static void upperCaseCounter() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exo 9.2: Entrez un mot ou une phrase afin de compter le nombre de majuscule(s).");
		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				System.out.println(ch + " est une lettre en majuscule.");
				count = count + 1;
			}
		}

		if (count == 0) {
			System.out.println("Il n'y a pas de lettre en majuscule.");
		} else {
			System.out.println("Le nombre de majuscules est de : " + count);
		}

		sc.close();
	}

	// 9.3 Transformation de chaine de caracteres
	public static void toUpperCase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exo 9.3: Entrez un mot ou une phrase afin de la transformer en MAJUSCULES uniquement.");
		String str = sc.nextLine();
		str = str.toUpperCase();
		System.out.println("Voici le résultat : " + str);
		sc.close();
	}

	// 9.4 Inversion d'une chaine de caracteres
	public static void stringRevert() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exo 9.4: Entrez un mot ou une phrase afin de l'inverser.");
		String str = sc.nextLine();
		String str2 = "";
		char ch;

		System.out.println("Mot à transformer : " + str);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // On recupere chaque lettre
			str2 = ch + str2; // On ajoute chaque lettre
		}

		System.out.println("Le mot inversé est: " + str2);
		sc.close();
	}

	// 9.5 Transformation d'une phrase en camelCase
	// https://stackoverflow.com/questions/1143951/what-is-the-simplest-way-to-convert-a-java-string-from-all-caps-words-separated
	public static void stringToCamelCase() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exo 9.5: Entrez une chaine de caractère afin de la transformer en camelCase");
		String str = sc.nextLine();

		String[] parts = str.split("\\s+");
		StringBuilder str2 = new StringBuilder();

		// Handle the first word to ensure the first letter is lowercase
		if (parts.length > 0) {
			str2.append(parts[0].toLowerCase());
		}

		// Handle the rest of the words, transforming them to ProperCase
		for (int i = 1; i < parts.length; i++) {
			str2.append(toProperCase(parts[i]));
		}

		System.out.println("résultat: " + str2.toString());
		sc.close();
	}

	public static String toProperCase(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}

	// 9.6 Localisation d'une sous-chaîne de caractères
	public static void stringFinder() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exo 9.6: Entrez une chaine de caractère");
		String str = sc.nextLine();
		System.out.println("Réecrire un des mots à chercher");
		String str2 = sc.nextLine();

		// Initialisation des indices de début et de fin
		int startIndex = -1;
		int endIndex = -1;

		// Parcours de la chaîne principale pour trouver la sous-chaîne
		for (int i = 0; i <= str.length() - str2.length(); i++) {
			boolean found = true;
			for (int j = 0; j < str2.length(); j++) {
				if (str.charAt(i + j) != str2.charAt(j)) {
					found = false;
					break;
				}
			}
			if (found) {
				startIndex = i;
				endIndex = i + str2.length() - 1;
				break; // On arrête la recherche après avoir trouvé la première occurrence
			} else {
				startIndex = -1;
				endIndex = -1;
			}
		}

		// Affichage des résultats
		System.out.println("Premier index : " + startIndex);
		System.out.println("Deuxieme index : " + endIndex);
		sc.close();
	}
}
