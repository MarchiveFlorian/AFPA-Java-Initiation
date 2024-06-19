package com.example;

import java.util.Random;
import java.util.Scanner;

public class Games {
    
    // 8 Jeu du plus ou moins
	public static void guessRandom() {

		Scanner sc = new Scanner(System.in);
		// instanciation d'un objet de la classe Random
		Random r = new Random();
		// génération d'un nombre >= 0 et <= 100
		int n = r.nextInt(100);
		int guessNumber = 200; // initialisé en dehors des limites pour ne jamais avoir le cas ou le nombre
								// random soit = a guessNumber
		int tryNumber = 10;

		System.out.println(
				"Exo 8: Entrez un nombre entre 0 et 100 pour deviner n, vous avez " + tryNumber + " tentatives.");
		while (guessNumber != n && tryNumber > 0) {
			guessNumber = sc.nextInt();
			if (guessNumber < n) {
				System.out.println("Le nombre à deviner est plus grand, réessayez");
				tryNumber--;
				System.out.println("Il vous reste " + tryNumber + " tentatives");
			} else if (guessNumber > n) {
				System.out.println("Le nombre à deviner est plus petit, réessayez");
				tryNumber--;
				System.out.println("Il vous reste " + tryNumber + " tentatives");
			} else {
				System.out.println("Vous avez deviné le nombre : " + n + " bravo");
			}
		}
		sc.close();
	}

    // 21 Jeu : Mastermind
	public static void masterMind() {

		// On défini le code secret grace à random, on le rempli avec 4 valeurs allant
		// de 0 à 7
		Random r = new Random();
		int[] secret = new int[4];
		for (int i = 0; i < 4; i++) {
			secret[i] = r.nextInt(8);
		}

		// On défini le nombre d'essais
		int tryNumber = 8;
		int[] code = new int[4];

		// On demande à l'utilisateur de nous donner sa proposition de code
		System.out.println("Exo 21: Entrez le code à tester sous ce format: 1234 allant de 0000 à 9999, vous avez "
				+ tryNumber + " tentatives.");
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

		while (tryNumber > 0) {
			String input = sc.next();

			// Validation de la proposition
			if (input.length() != 4 || !input.matches("[0-7]{4}")) {
				System.out.println("La proposition doit etre composée de 4 chiffres entre 0 et 7");
				continue;
			}

			// Remplissage du tableau code avec la proposition utilisateur
			for (int i = 0; i < 4; i++) {
				code[i] = input.charAt(i) - '0';
			}

			// Vérification de la proposition par rapport au code secret
			int wellPlaced = 0;
			int misplaced = 0;
			boolean[] secretUsed = new boolean[4];
			boolean[] codeUsed = new boolean[4];

			// Vérifier les chiffres bien placés
			for (int i = 0; i < 4; i++) {
				if (code[i] == secret[i]) {
					wellPlaced++;
					secretUsed[i] = true;
					codeUsed[i] = true;
				}
			}

			// Vérifier les chiffres mal placés
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i != j && !codeUsed[i] && !secretUsed[j] && code[i] == secret[j]) {
						misplaced++;
						codeUsed[i] = true;
						secretUsed[j] = true;
						break;
					}
				}
			}

			if (wellPlaced == 4) {
				System.out.println("Vous avez deviné la combinaison : " + input + " bravo");
				return;
			} else {
				tryNumber--;
				System.out.println(input + " -> " + wellPlaced + " bien placé(s), " + misplaced + " mal placé(s).");
				System.out.println("Il vous reste " + tryNumber + " tentative(s).");
			}
		}

		// Si le code n'est pas trouvé après les tentatives
		System.out.print("Vous avez épuisé toutes vos tentatives. La combinaison secrète était : ");
		for (int num : secret) {
			System.out.print(num);
		}
		System.out.println();
		sc.close();
	}
}
