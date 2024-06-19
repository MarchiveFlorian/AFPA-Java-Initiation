package com.example;

public class PrintPyramide {
    
    // 7.0 Affichage d'une pyramide de caractères
	// v1 https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/
	public static void pyramideV1(int n) {

		// int i, j;

		// // outer loop to handle number of rows
		// // n in this case
		// for(i=0; i<n; i++)
		// {

		// // inner loop to handle number of columns
		// // values changing acc. to outer loop
		// for(j=0; j<=i; j++)
		// {
		// // printing stars
		// System.out.print("* ");
		// }

		// // ending line after each row
		// System.out.println();
		// }

		int i = 0; // initialisation du compteur pour les lignes et les colonnes
		int j = 0; // initialisation du compteur pour les étoiles par ligne

		while (i < n) {
			// Si j est inférieur ou égal à i, imprimez une étoile et incrémentez j
			if (j <= i) {
				System.out.print("* ");
				j++;
			} else {
				// Sinon, passez à la ligne suivante
				System.out.println();
				i++;
				j = 0; // réinitialiser j pour la prochaine ligne
			}
		}
	}

	// v2
	public static void pyramideV2(int n) {

		int i = 1;
		// Print the increasing part of the pyramid
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

		i = n - 1;
		// Print the decreasing part of the pyramid
		while (i >= 1) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
