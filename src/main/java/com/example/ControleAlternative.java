package com.example;

import java.time.Year;

public class ControleAlternative {

    // exercice 3.1 Verification de la majorité
    public static void displayLegalStatus(int birthYear) {

        // Récupérer l'année actuelle
        int currentYear = Year.now().getValue();
        // Faire soustraction entre année actuelle et parametre
        int age = currentYear - birthYear;

        // Faire un if pour afficher le bon message
        if (age > 17) {
            System.out.println(" -> Vous êtes majeur.");
        } else {
            System.out.println(" -> Vous êtes mineur.");
        }
    }

    // excercice 3.2 Calcul et condition
    public static void customNumberDisplay(int a, int b) {

        int sum = a + b;
        int multi = a * b;

        if (sum > 100) {
            System.out.println(" -> La somme est supérieure à 100, la voici: " + sum);
        } else {
            System.out.println(" -> La somme est inférieure à 100, voici la multiplication des valeurs: " + multi);
        }
    }

    // exercice 3.3 min-max
	public static void minMax(int a, int b, int c) {

		if (a > b && a > c) {
			int max = a;
			System.out.println(" -> La valeur max est: " + max);
		} else if (b > a && b > c) {
			int max = b;
			System.out.println(" -> La valeur max est: " + max);
		} else if (c > a && c > b) {
			int max = c;
			System.out.println(" -> La valeur max est: " + max);
		}

		if (a < b && a < c) {
			int min = a;
			System.out.println(" -> La valeur min est: " + min);
		} else if (b < a && b < c) {
			int min = b;
			System.out.println(" -> La valeur min est: " + min);
		} else if (c < a && c < b) {
			int min = c;
			System.out.println(" -> La valeur min est: " + min);
		}
	}

    // exercice3.4 Voyelle ou consonne

	public static void letterCheck(char letter) {

		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
			System.out.println(" -> C'est une voyelle");
		} else {
			System.out.println(" -> C'est une consonne");
		}
	}

	// exercice 3.5 vérification bancaire

	public static void moneyChecker(int solde, int prix) {

		int reste = solde - prix;
		if (solde >= prix) {
			System.out.println(" -> Le solde est suffisant pour votre achat, Solde restant: " + reste + "euros");
		} else {
			System.out.println(" -> Le solde est insuffisant pour votre achat, il vous manque: " + reste + "euros");
		}
	}

	// exercice 3.6 Taux de participation employeur

	public static void tauxEmployeur(char status, int enfant, int salaire) {

		// Ici le ? sert à questionner à savoir si la condition est vraie ou fausse, si
		// c'est vrai, on prend la valeur 1:20, sinon prend la valeur 2:25.
		int taux = (status == 'c') ? 20 : 25;
		final int tauxMax = 50;

		// Majoration par enfant
		for (int i = 0; i < enfant; i++) {
			taux += taux * 0.15;
			if (taux > tauxMax) {
				taux = tauxMax;
				break;
			}
		}

		// Majoration pour salaire inférieur à 1800€
		if (salaire < 1800) {
			taux += taux * 0.10;
			if (taux > tauxMax) {
				taux = tauxMax;
			}
		}

		System.out.println(" -> Votre taux s'élève à: " + taux + '%');
	}

}
