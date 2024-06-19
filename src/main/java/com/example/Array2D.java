package com.example;

import java.util.Scanner;

public class Array2D {
    
    // 6.1 Somme des valeurs d'un tableau
	public static void sumArray2D(int[][] array2D) {

		// On déclare les lignes, colonnes, et leurs sommes
		int rows, cols, sumRow, sumCol, totalSum = 0;

		// Calcul du nombre de lignes et colonnes présentent dans le tableau array2D
		rows = array2D.length;
		cols = array2D[0].length;

		// Calcul de chaque lignes du tableau
		for (int iRow = 0; iRow < rows; iRow++) {
			sumRow = 0;
			for (int j = 0; j < cols; j++) {
				sumRow = sumRow + array2D[iRow][j];
				totalSum = totalSum + array2D[iRow][j]; // Ajout à la somme totale
			}
			System.out.println("La somme de la ligne " + (iRow + 1) + " est: " + sumRow);
		}

		// Calcul de chaque colonnes du tableau
		for (int iCols = 0; iCols < cols; iCols++) {
			sumCol = 0;
			for (int j = 0; j < rows; j++) {
				sumCol = sumCol + array2D[j][iCols];
			}
			System.out.println("La somme de la colonne " + (iCols + 1) + " est: " + sumCol);
		}

		// Calcul de la somme finale
		System.out.println("La somme totale de tous les nombres du tableau: " + totalSum);
	}


	// 6.2 annexe
	public static int getDiagonalSum(int[][] matrix) {
		int n = matrix.length;
		int diagonalSum = 0;
		for (int i = 0; i < n; i++) {
			diagonalSum += matrix[i][i];
		}
		return diagonalSum;
	}

	public static int getDiagonalSumOpposite(int[][] matrix) {
		int n = matrix.length;
		int diagonalSum = 0;
		for (int i = 0; i < n; i++) {
			diagonalSum += matrix[i][n - i - 1];
		}
		return diagonalSum;
	}

	// 6.2 Somme des valeurs d'un tableau sur une diagonale
	public static void diagonale() {

		Scanner scanner = new Scanner(System.in);

		// Demander à l'utilisateur de créer le tableau
		System.out.print("Exo 6.2: Entrez le nombre de lignes du tableau: ");
		int rows = scanner.nextInt();
		System.out.print("Entrez son nombre de colonnes: ");
		int columns = scanner.nextInt();

		// Création du tableau
		int[][] matrix = new int[rows][columns];

		// Lecture du tableau
		System.out.println("Remplissez le tableau:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		// Calcul des diagonales
		int diagonalSumEfficient = getDiagonalSum(matrix);
		int diagonalSumOpposite = getDiagonalSumOpposite(matrix);
		System.out.println("Somme de la diagonale 1 (haut gauche - bas droite): " + diagonalSumEfficient);
		System.out.println("Somme de la diagonale 2 (haut droite - bas gauche): " + diagonalSumOpposite);

		scanner.close();
	}
}
