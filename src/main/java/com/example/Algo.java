package com.example;

import java.util.Scanner;
import java.util.Vector;

public class Algo {
    
    // 13 Algorithme de Luhn https://en.wikipedia.org/wiki/Luhn_algorithm
	public static void algoLuhn() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Exo 13: Entre le nombre de carte bleue >FACTICE< à rentrer: ");
		String randomCardNumber = sc.nextLine();
		int n = randomCardNumber.length();
		int total = 0;
		boolean pair = true;

		// On parcours n de droite à gauche, et on double chaque valeur en emplacement
		// 'pair' (un sur deux)
		for (int i = n - 1; i >= 0; i--) {
            int chiffre = randomCardNumber.charAt(i) - '0';
            if (chiffre < 0 || chiffre > 9) {
                // Les valeurs ne peuvent comprendre que des chiffres allant de 0 à 9
                System.out.println("Invalide. Entrée non numérique détectée.");
                sc.close();
                return;
            }
            if (pair) {
                chiffre *= 2; // double la valeur équivalente de chiffre = chiffre * 2
                if (chiffre > 9) {
                    chiffre -= 9; // si le double dépasse 9, on soustrait 9
                }
            }
            pair = !pair;
            total += chiffre;
        }
		
		System.out.println(total % 10 == 0);
		sc.close();
	}

	// 14 Algorithme glouton
	// https://www.geeksforgeeks.org/greedy-algorithm-to-find-minimum-number-of-coins/
	public static void algoGlouton() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Exo 14: Entrez la valeur en centimes d'euros (ex: 400 pour 4euros) : ");
		int montant = sc.nextInt();
		sc.close();

		int[] pieces = { 200, 100, 50, 20, 10, 5, 2, 1 };
		Vector<Integer> result = new Vector<>();

		for (int i = 0; i < pieces.length; i++) {
			int nombrePieces = montant / pieces[i];
			for (int j = 0; j < nombrePieces; j++) {
				result.add(pieces[i]);
			}
			montant %= pieces[i];
		}

		System.out.println("Pièces optimales : " + result);
	}

    // 24 Algorithme de compression: RLE
	// https://stackoverflow.com/questions/26985038/compressing-a-string-in-java
	public static void compressRLE() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exo 24: Entrez la chaine de caractère à compresser");
		String str = sc.nextLine();
		sc.close();

		int count;
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			count = 1;

			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			if (count == 1) {
				result.append(letter);
			} else {
				result.append(count).append(letter);
			}
		}

		System.out.println(result.toString());
	}
}
