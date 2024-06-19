package com.example;

import java.util.Scanner;

public class Binary {
    
    // 10.1 Du binaire à la base 10
	// https://stackoverflow.com/questions/10178980/how-to-convert-a-binary-string-to-a-base-10-integer-in-java
	public static void binaryBase10() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Exo 10.1 : Entrez un nombre binaire : ");
		String n = sc.nextLine();

		int base10 = 0;
		int longueur = n.length();

		for (int i = 0; i < longueur; i++) {
			// Le caractère à la position actuelle
			char chiffre = n.charAt(longueur - 1 - i);
			// Conversion du caractère en entier (0 ou 1)
			int valeur = Character.getNumericValue(chiffre);
			// Ajout de la contribution de ce chiffre au résultat final
			base10 += valeur * Math.pow(2, i);
		}

		System.out.println("Résultat : " + base10);
		sc.close();
	}

	// 10.2 De la base 10 au binaire
	public static void base10ToBinary() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Exo 10.2 : Entrez un nombre en base 10 : ");
		int number = sc.nextInt();

		// Cas particulier pour le nombre 0
		if (number == 0) {
			System.out.println("Le nombre en binaire est : 0");
			sc.close();
			return;
		}

		StringBuilder binaire = new StringBuilder();

		while (number > 0) {
			int reste = number % 2;
			binaire.insert(0, reste); // On ajoute le reste au début de la chaîne
			number = number / 2; // Division entière par 2
		}

		System.out.println("Le nombre en binaire est : " + binaire.toString());
		sc.close();
	}
}
