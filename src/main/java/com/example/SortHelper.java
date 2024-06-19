package com.example;

import java.util.Random;

public class SortHelper {

    // tri à bulle / bubble sort
    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        int tmp;

        // Boucle pour réduire la portée de la comparaison
        for (int i = n - 1; i >= 1; i--) {
            // Boucle pour comparer et échanger les élements adjacents
            for (int k = 0; k < i; k++) {
                if (arr[k] > arr[k + 1]) {
                    // Echange des éléments si l'élément courant est plus grand que le suivant
                    tmp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = tmp;
                }
            }
        }
    }

    /**
     * quicksort
     * @param tab
     * @param debut
     * @param fin
     * @return
     */
    public static int partition(int[] tab, int debut, int fin) {

		int indicePivot;
		int k = debut;
		int tmp; // sert aux échanges dans le tableau lors du tri
		Random random = new Random();

		// La valeur pivot est tirée aléatoirement et est placée au début du tableau
		indicePivot = debut + random.nextInt(fin - debut + 1);
		tmp = tab[indicePivot];
		tab[indicePivot] = tab[debut];
		tab[debut] = tmp;

		// Les éléments du tableau sont parcourus à partir de debut + 1. Si un élément
		// est inférieur au pivot, il est échangé avec l'élément à la position k+1, et k
		// est incrémenté.
		for (int i = debut + 1; i <= fin; i++) {
			if (tab[i] < tab[debut]) {
				tmp = tab[i];
				tab[i] = tab[k + 1];
				tab[k + 1] = tmp;
				k++;
			}
		}

		// Echange avec le pivot
		tmp = tab[debut];
		tab[debut] = tab[k];
		tab[k] = tmp;
		return k;
	}

	// Partitionne le tableau en utilisant la fonction partition, puis appelle
	// récursivement quickSortRecurvive sur les sous-tableaux à gauche et à droite
	// du pivot.
	public static void quickSortRecurvise(int[] tab, int debut, int fin) {
		if (fin > debut) {
			int indicePivot = partition(tab, debut, fin);
			quickSortRecurvise(tab, debut, indicePivot - 1);
			quickSortRecurvise(tab, indicePivot + 1, fin);
		}
	}

	// La fonction quickSort initialise l'appel récursif de quickSortRecurvive.
	public static void quickSort(int[] tab) {
		if (tab != null && tab.length > 1) {
			quickSortRecurvise(tab, 0, tab.length - 1);
		}
	}

}
