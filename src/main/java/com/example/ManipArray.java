package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ManipArray {
    
    // 11 Fusion de tableaux
	// https://stackoverflow.com/questions/80476/how-can-i-concatenate-two-arrays-in-java
	public static void arrayMerge() {

		Scanner sc = new Scanner(System.in);

		// Demander à l'utilisateur de donner la taille du tableau 1
		System.out.println("Exo 11 : Veuillez choisir un nombre de valeurs à saisir dans le tableau 1:");
		int array1Size = 0;
		if (sc.hasNextInt()) {
			array1Size = sc.nextInt();
		}

		// Demander à l'utilisateur de donner la taille du tableau 2
		System.out.println("Veuillez choisir un nombre de valeurs à saisir dans le tableau 2:");
		int array2Size = 0;
		if (sc.hasNextInt()) {
			array2Size = sc.nextInt();
		}

		// Faire en sorte que le tableau utilise la taille saisie par l'utilisateur
		Integer[] array1 = new Integer[array1Size];
		Integer[] array2 = new Integer[array2Size];

		// Remplir le tableau 1 avec les valeurs utilisateurs
		System.out.println("Entrez les " + array1Size + " valeurs du tableau 1");
		for (int i = 0; i < array1Size; i++) {
			System.out.println("Veuillez saisir le nombre " + (i + 1) + " :");
			if (sc.hasNextInt()) {
				array1[i] = sc.nextInt();
			}
		}

		// Remplir le tableau 2 avec les valeurs utilisateurs
		System.out.println("Entrez les " + array2Size + " valeurs du tableau 2");
		for (int i = 0; i < array2Size; i++) {
			System.out.println("Veuillez saisir le nombre " + (i + 1) + " :");
			if (sc.hasNextInt()) {
				array2[i] = sc.nextInt();
			}
		}

		// Afficher les tableaux avant modification
		System.out.println("Tableau de nombres saisis :" + Arrays.toString(array1));
		System.out.println("Tableau de nombres saisis :" + Arrays.toString(array2));

		// Fusion des deux tableaux
		List<Integer> resultList = new ArrayList<>(array1Size + array2Size);
		Collections.addAll(resultList, array1);
		Collections.addAll(resultList, array2);

		// Convertir la liste en un tableau d'entiers
		Integer[] resultArray = resultList.toArray(new Integer[0]);

		// Afficher le tableau fusionné
		System.out.println("Tableau fusionné :" + Arrays.toString(resultArray));

		// Trier les valeurs du tableau par ordre croissant
		Arrays.sort(resultArray);
		System.out.println("Tableau fusionné avec les valeurs en ordre croissant:" + Arrays.toString(resultArray));
		sc.close();
	}


    // 19 Recherche dichotomique
	public static int dichotomique(int valueToFind) {

		Scanner scanner = new Scanner(System.in);

		// Demande à l'utilisateur de spécifier la taille du tableau
		System.out.print("Entrez la taille du tableau : ");
		int n = scanner.nextInt();

		// Initialisation du tableau
		int[] arr = new int[n];

		// Remplissage du tableau avec les valeurs entrées par l'utilisateur
		for (int i = 0; i < n; i++) {
			System.out.print("Entrez l'élément " + (i + 1) + " : ");
			arr[i] = scanner.nextInt();
		}

		SortHelper.quickSort(arr); // appel de la fonction quicksort pour trier le tableau par ordre croissant

		// Affichage du tableau pour vérifier les entrées
		System.out.println("Les éléments du tableau sont : ");
		for (int i = 0; i < n; i++) {
			System.out.println("Élément " + (i + 1) + ": " + arr[i]);
		}

		// Fermeture du scanner
		scanner.close();

		int debut = 0;
		int fin = arr.length - 1;

		while (debut <= fin) {
			int middle = (debut + fin) / 2;

			if (valueToFind == arr[middle]) {
				return middle;
			} else if (valueToFind > arr[middle]) {
				debut = middle + 1; // recherche dans la partie droite
			} else {
				fin = middle - 1; // recherche dans la partie gauche
			}
		}
		return -1; // si l'élement n'est pas trouvé
	}

    // 20 Les k les plus grands éléments
	// https://www.geeksforgeeks.org/next-greater-element/
	public static void findBiggers() {

		Scanner scanner = new Scanner(System.in);

		// Demande à l'utilisateur de spécifier la taille du tableau
		System.out.print("Exo 20: Entrez la taille du tableau : ");
		int n = scanner.nextInt();

		// Initialisation du tableau
		int[] arr = new int[n];

		// Remplissage du tableau avec les valeurs entrées par l'utilisateur
		for (int i = 0; i < n; i++) {
			System.out.print("Entrez l'élément " + (i + 1) + " : ");
			arr[i] = scanner.nextInt();
		}

		// Affichage du tableau pour vérifier les entrées
		System.out.println("Les éléments du tableau sont : " + Arrays.toString(arr));

		System.out.println("Entrez le nombre de grands éléments à trouver");
		int k = scanner.nextInt();

		// Fermeture du scanner
		scanner.close();

		SortHelper.quickSort(arr);

		// Affiche les k plus grands éléments
		System.out.println("Les " + k + " plus grands éléments sont : ");
		for (int i = arr.length - k; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	

	// 23 Binomes de stagiaires
	// https://stackoverflow.com/questions/56028165/produce-random-numbers-in-pairs-with-java
	public static void createLearnersGroup() {

		String[] learnerNames = { "Ada", "Charles", "Aaron", "Margaret", "Linus", "Grace" };
		Random r = new Random();
		int min = 1;
		int max = 3;
		int[] group = new int[learnerNames.length];
		int[] count = new int[max - min + 1];
		for (int i = 0; i < learnerNames.length; i++) {
			int num;
			do {
				num = r.nextInt((max - min) + 1) + min;
			} while (count[num - min] >= 2);
			group[i] = num;
			count[num - min]++;
		}

		// Affichage des tableaux
		System.out.println("Le tableau des stagiaires : " + Arrays.toString(learnerNames));
		System.out.println("Les groupes seront : " + Arrays.toString(group));
	}

}
