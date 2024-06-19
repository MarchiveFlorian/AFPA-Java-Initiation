package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array1D {
    
    // 5.1 Itération sur un tableau
	public static void readArray(float arrayNum1, float arrayNum2, float arrayNum3, float arrayNum4) {

		float[] arrayNumbers = { arrayNum1, arrayNum2, arrayNum3, arrayNum4 };

		for (int i = 0; i < arrayNumbers.length; i++) {
			System.out.println(" -> les valeurs présentent dans le tableau sont : " + arrayNumbers[i]);
		}
	}

	// 5.2 Recherche séquentielle
	public static void searchArrayValue(int n1, int n2, int n3, int n4, int n5, int valueToCheck) {

		// on créer un tableau
		int[] nums = { n1, n2, n3, n4, n5 };

		// FOR
		// la boucle qui parcours le tableau et affiche la liste des valeurs
		for (int i = 0; i < nums.length; i++) {
			int values = nums[i];
			System.out.println(" -> Voici la liste de vos valeurs: " + values);
		}

		// vérification si la valeur est bien dans le tableau et récupérer l'index
		boolean test = false;
		int index = -1; // Initialiser à -1 pour indiquer que la valeur n'est pas trouvée
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == valueToCheck) {
				test = true;
				index = i; // Mettre à jour l'index lorsque la valeur est trouvée
				break;
			}
		}

		// WHILE
		// Boucle while qui parcourt le tableau et affiche la liste des valeurs
		// int i = 0;
		// while (i < nums.length) {
		// int values = nums[i];
		// System.out.println(" -> Voici la liste de vos valeurs: " + values);
		// i++;
		// }

		// // Vérification si la valeur est bien dans le tableau
		// boolean test = false;
		// int index = -1; // Initialiser à -1 pour indiquer que la valeur n'est pas
		// trouvée
		// int j = 0;
		// while (j < nums.length) {
		// if (nums[j] == valueToCheck) {
		// test = true;
		// index = j; // Mettre à jour l'index lorsque la valeur est trouvée
		// break;
		// }
		// j++;
		// }

		// DO WHILE
		// Boucle do-while qui parcourt le tableau et affiche la liste des valeurs
		// int i = 0;
		// do {
		// int values = nums[i];
		// System.out.println(" -> Voici la liste de vos valeurs: " + values);
		// i++;
		// } while (i < nums.length);

		// // Vérification si la valeur est bien dans le tableau
		// boolean test = false;
		// int index = -1; // Initialiser à -1 pour indiquer que la valeur n'est pas
		// trouvée
		// int j = 0;
		// do {
		// if (nums[j] == valueToCheck) {
		// test = true;
		// index = j; // Mettre à jour l'index lorsque la valeur est trouvée
		// break;
		// }
		// j++;
		// } while (j < nums.length);

		// resultat dans la console
		System.out.println(
				" -> Est ce que " + valueToCheck + " se trouve dans le tableau? : " + test + " à l'index : " + index);
	}

	// 5.3 Somme entre deux index
	public static void indexSum(int indexSumNumber1, int indexSumNumber2, int indexSumNumber3, int indexSumNumber4,
			int indexI, int indexJ) {

		// Le tableau
		int[] indexSumArray = { indexSumNumber1, indexSumNumber2, indexSumNumber3, indexSumNumber4 };

		// Variable pour stocker la somme
		int sum = 0;

		// Boucle pour parcourir les éléments du tableau entre indexI (inclus) et indexJ
		// (exclu)
		for (int k = indexI; k < indexJ; k++) {
			sum += indexSumArray[k];
		}

		// Affichage du résultat
		System.out.println("La somme des éléments entre les index " + indexI + " et " + indexJ + " est: " + sum);
	}

	// 5.4 Recherche d'indices
	public static void returnIndex(int returnIndexNumber1, int returnIndexNumber2, int returnIndexNumber3,
			int returnIndexNumber4) {

		// Création des tableaux
		int[] arr = { returnIndexNumber1, returnIndexNumber2, returnIndexNumber3, returnIndexNumber4 };
		int[] arrResult = new int[2];

		// On affiche le tableau arr
		System.out.println("Le tableau est composé des nombres : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

		// Trouver le minimum et le maximum
		int min = arrResult[0];
		int max = arrResult[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		// Remplir le tableau arrResult
		arrResult[0] = min;
		arrResult[1] = max;

		// Afficher le min et le max
		System.out.println("Le minimum = " + min);
		System.out.println("Le maximum = " + max);

		// Afficher le tableau arrResult
		System.out.println("Le tableau des résultats est donc : ");
		for (int i = 0; i < arrResult.length; i++) {
			System.out.println(arrResult[i] + " ");
		}
	}

	// 5.5 Echange de valeurs
	public static boolean swap() {

		Scanner sc = new Scanner(System.in);
		int iSwap = 0;
		int jSwap = 0;
		boolean result = false;

		// Demander à l'utilisateur de donner la taille du tableau
		System.out.println(" Exo 5.5 : Veuillez choisir un nombre de valeurs à saisir :");
		int swapArraySize = 0;
		if (sc.hasNextInt()) {
			swapArraySize = sc.nextInt();
		}

		// Faire en sorte que le tableau utilise la taille saisie par l'utilisateur
		int[] swapArray = new int[swapArraySize];

		// Remplir le tableau avec les valeurs utilisateurs
		System.out.println("Entrez les " + swapArraySize + " valeurs du tableau");
		for (int i = 0; i < swapArraySize; i++) {
			System.out.println("Veuillez saisir le nombre " + (i + 1) + " :");
			if (sc.hasNextInt()) {
				swapArray[i] = sc.nextInt();
			}
		}

		// Afficher le tableau avant modification
		System.out.println("Tableau de nombres saisis :" + Arrays.toString(swapArray));

		try {
			// Demander à l'utilisateur de définir les index
			System.out.println("Définir l'index i compris entre 0 et " + (swapArraySize - 1));
			if (sc.hasNextInt()) {
				iSwap = sc.nextInt();
				result = true;
			} else {
				System.out.println("Erreur: vous n'avez pas rentré un chiffre");
			}
			System.out.println(
					"Définir l'index j compris entre 0 et " + (swapArraySize - 1) + " (différent de l'index i)");
			if (sc.hasNextInt()) {
				jSwap = sc.nextInt();
				result = true;
			} else {
				System.out.println("Erreur: vous n'avez pas rentré un chiffre");
			}

			int swap = swapArray[iSwap];
			swapArray[iSwap] = swapArray[jSwap];
			swapArray[jSwap] = swap;

			// Afficher le tableau après modification
			System.out.println("Tableau après modification :" + Arrays.toString(swapArray));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("L'index utilisé est invalide");
			System.out.println("Entrez une valeur d'index comprise entre 0 et 4");
			result = false;
		}

		sc.close();
		System.out.println("return : " + result);
		return result;
	}

	// 5.6 Calcul de moyenne
	public static void getAverage() {
		Scanner sc = new Scanner(System.in);

		// Demander à l'utilisateur de donner la taille du tableau
		System.out.println(" Exo 5.3 : Veuillez choisir un nombre de valeurs à saisir :");
		int averageArraySize = 0;
		if (sc.hasNextInt()) {
			averageArraySize = sc.nextInt();
		}

		// Faire en sorte que le tableau utilise la taille saisie par l'utilisateur
		int[] arr = new int[averageArraySize];

		// Remplir le tableau avec les valeurs utilisateurs
		System.out.println("Entrez les " + averageArraySize + " valeurs du tableau");
		for (int i = 0; i < averageArraySize; i++) {
			System.out.println("Veuillez saisir le nombre " + (i + 1) + " :");
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}

		int sum = 0;

		for (int i = 0; i < averageArraySize; i++) {
			sum += arr[i];
		}

		double average = (double) sum / averageArraySize;

		// Afficher les résultats
		System.out.println("Tableau de nombres saisis :");
		for (int i = 0; i < averageArraySize; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Moyenne = " + average);
		sc.close();
	}

	// 5.7 Manipulation de tableau d'entiers et saisie utilisateur
	public static void averageArray() {
		Scanner sc = new Scanner(System.in);

		// Demander à l'utilisateur de donner la taille du tableau
		System.out.println(" Exo 5.3 : Veuillez choisir un nombre de valeurs à saisir :");
		int averageArraySize = 0;
		if (sc.hasNextInt()) {
			averageArraySize = sc.nextInt();
		}

		// Faire en sorte que le tableau utilise la taille saisie par l'utilisateur
		int[] arr = new int[averageArraySize];

		// Remplir le tableau avec les valeurs utilisateurs
		System.out.println("Entrez les " + averageArraySize + " valeurs du tableau");
		for (int i = 0; i < averageArraySize; i++) {
			System.out.println("Veuillez saisir le nombre " + (i + 1) + " :");
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}

		// Calculer la moyenne, le minimum et le maximum
		int sum = 0;
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < averageArraySize; i++) {
			sum += arr[i];
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		double average = (double) sum / averageArraySize;

		// Afficher les résultats
		System.out.println("Tableau de nombres saisis :");
		for (int i = 0; i < averageArraySize; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Moyenne = " + average);
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);

		sc.close();
	}

	// 5.8 Inversion de tableau
	public static void invert() {

		Scanner sc = new Scanner(System.in);

		// Demander à l'utilisateur de donner la taille du tableau
		System.out.println(" Exo 5.3 : Veuillez choisir un nombre de valeurs à saisir :");
		int arraySize = 0;
		if (sc.hasNextInt()) {
			arraySize = sc.nextInt();
		}

		// Faire en sorte que le tableau utilise la taille saisie par l'utilisateur
		Integer[] arr = new Integer[arraySize];

		// Remplir le tableau avec les valeurs utilisateurs
		System.out.println("Entrez les " + arraySize + " valeurs du tableau");
		for (int i = 0; i < arraySize; i++) {
			System.out.println("Veuillez saisir le nombre " + (i + 1) + " :");
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}

		}

		// Afficher le tableau
		System.out.println("Tableau de nombres saisis :" + Arrays.toString(arr));

		// On utilise la method Collection.reverse afin d'inverser notre tableau
		Collections.reverse(Arrays.asList(arr));

		// Afficher le tableau inversé
		System.out.println("Tableau inversé est donc :" + Arrays.toString(arr));
		sc.close();
	}
}
