package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Lien vers le tuto permettant de demander des prompts utilisateur via scanner:
		// https://zestedesavoir.com/tutoriels/646/apprenez-a-programmer-en-java/556_bien-commencer-en-java/2688_lire-les-entrees-clavier/
		// Création d'une seule instance de scanner
		Scanner sc = new Scanner(System.in);
		
        
		// 3.1
		// On demande à l'utilisateur de rentrer une valeur
		System.out.println(" Exo 3.1: Entrez votre année de naissance :");
		int birthYear = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 3.1
		ControleAlternative.displayLegalStatus(birthYear);
        
		// 3.2
		// On demande à l'utilisateur de rentrer une valeur
		System.out.println(" Exo 3.2: Entrez le premier nombre :");
		int a = sc.nextInt();
		System.out.println("Entrez le deuxieme nombre :");
		int b = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 3.2
		ControleAlternative.customNumberDisplay(a, b);
        
		// 3.3
		// On demande à l'utilisateur de rentrer une valeur
		System.out.println(" Exo 3.3: Entrez le premier nombre :");
		int c = sc.nextInt();
		System.out.println("Entrez le deuxieme nombre :");
		int d = sc.nextInt();
		System.out.println("Entrez le troisième nombre :");
		int e = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 3.3
		ControleAlternative.minMax(c, d, e);
        
		// 3.4
		// On demande à l'utilisateur de rentrer une valeur
		System.out.println(" Exo 3.4: Entrez une lettre :");
		char carac = sc.next().charAt(0);
		sc.nextLine();
		// Appel de la fonction 3.4
		ControleAlternative.letterCheck(carac);
        
		// 3.5
		// On demande à l'utilisateur de rentrer une valeur
		System.out.println(" Exo 3.5: Entrez la valeur de votre solde :");
		int solde = sc.nextInt();
		System.out.println("Entrez le prix de l'achat :");
		int prix = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 3.5
		ControleAlternative.moneyChecker(solde, prix);
        
		// 3.6
		// On demande à l'utilisateur de rentrer une valeur
        char letter;
		do{
            System.out.println(" Exo 3.6: Entrez c si vous êtes célibataire, sinon entrez une autre lettre :");
            String str2 = sc.nextLine();
            char status = str2.charAt(0);
            System.out.println("Entrez votre nombre d'enfant(s): ");
            int enfant = sc.nextInt();
            System.out.println("Entre votre salaire: ");
            int salaire = sc.nextInt();
            sc.nextLine();
            // Appel de la fonction 3.6
            ControleAlternative.tauxEmployeur(status, enfant, salaire);
            // Demande de répétition
            System.out.println("Souhaitez-vous effectuer le calcul pour un autre employé ? (Y/N)");
            letter = sc.nextLine().charAt(0);
            } while (Character.toUpperCase(letter) == 'Y');
            
            // 4.1
            // On demande à l'utilisateur de rentrer les valeurs
            System.out.println(" Exo 4.2: Entrez le nombre d'abonnée initial");
            int subs = sc.nextInt();
            System.out.println("Entrez le nombre de mois pour procéder au calcul de l'estimation");
            int months = sc.nextInt();
            sc.nextLine();
            // Appel de la fonction 4.2
            ControleIteratif.subscriberCount(subs, months);
            
            // 4.2
            //On demande à l'utilisateur de rentrer le nombre n
            System.out.println(" Exo 4.3: Entrez le nombre n");
            int n = sc.nextInt();
            sc.nextLine();
            // Appel de la fonction 4.3
            ControleIteratif.sum0ToN(n);
            
		// 4.3
		// On demande à l'utilisateur de rentrer le nombre n
		System.out.println(" Exo 4.4: Entrez le nombre n");
		int nFizz = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 4.4
		ControleIteratif.fizzBuzz(nFizz);

		// 4.4
		// On demande à l'utilisateur de rentrer le nombre n
		System.out.println(" Exo 4.5: Entrez le nombre n");
		int nFacto = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 4.5
		ControleIteratif.factorial(nFacto);

		// 5.1
		// On demande à l'utilisateur de rentrer les valeurs du tableau
		System.out.println(" Exo 5.1: Entrez quatres valeurs pour créer notretableau");
		float arrayNum1 = sc.nextFloat();
		float arrayNum2 = sc.nextFloat();
		float arrayNum3 = sc.nextFloat();
		float arrayNum4 = sc.nextFloat();
		sc.nextLine();
		// Appel de la fonction 5.1
		Array1D.readArray(arrayNum1, arrayNum2, arrayNum3, arrayNum4);

		// 5.2
		// On demande à l'utilisateur de rentrer les valeurs du tableau
		System.out.println(" Exo 4.1: Entrez 5 valeurs afin de constuire notre tableau");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		// On demande à l'utilisateur de rentrer la valeur à chercher
		System.out.println("Entrez la valeur dont vous voulez vérifier la présence");
		int valueToCheck = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 4.1
		Array1D.searchArrayValue(n1, n2, n3, n4, n5, valueToCheck);

		// 5.3
		// On demande à l'utilisateur de rentrer les valeurs du tableau
		System.out.println(" Exo 5.2: Entrez les quatres valeurs de notre tableau");
		int indexSumNumber1 = sc.nextInt();
		int indexSumNumber2 = sc.nextInt();
		int indexSumNumber3 = sc.nextInt();
		int indexSumNumber4 = sc.nextInt();
		System.out.println("Veuillez donner un nombre pour déterminer l'index i");
		int indexI = sc.nextInt();
		System.out.println("Veuillez donner un nombre pour déterminer l'index j");
		int indexJ = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 5.2
		Array1D.indexSum(indexSumNumber1, indexSumNumber2, indexSumNumber3, indexSumNumber4,
		indexI, indexJ);

		// 5.4
		// On demande à l'utilisateur de rentrer les valeurs du tableau
		System.out.println(" Exo 5.4: Entres les quatres valeurs du tableau");
		int returnIndexNumber1 = sc.nextInt();
		int returnIndexNumber2 = sc.nextInt();
		int returnIndexNumber3 = sc.nextInt();
		int returnIndexNumber4 = sc.nextInt();
		sc.nextLine();
		// Appel de la fonction 5.4
		Array1D.returnIndex(returnIndexNumber1, returnIndexNumber2, returnIndexNumber3,
		returnIndexNumber4);

		// 5.5
		// Appel de la fonction 5.5
		Array1D.swap();

		// 5.6
		// Appel de la fonction 5.6
		Array1D.getAverage();

		// 5.7
		// Appel de la fonction 5.3
		Array1D.averageArray();

		// 5.8
		// Appel de fonction 5.8
		Array1D.invert();

		// 6.1
		// On déclare le tableau array2D
		int[][] array2D = {
		{4, 6, 5},
		{7, 11, 34},
		{28, 6, 2},
		{1, 2, 3},
		{4, 3, 10}
		};
		// Appel de la fonction 6.1
		Array2D.sumArray2D(array2D);

		// 6.2
		// Appel de la fonction 6.2
		Array2D.diagonale();

		// 7.0
		// v1
		System.out.println("Exo 7.0v1 : Entrez un nombre");
		int num = sc.nextInt();
		sc.nextLine();
		PrintPyramide.pyramideV1(num);
		// v2
		System.out.println("v2:");
		PrintPyramide.pyramideV2(num);

		// 8
		Games.guessRandom();

		// 9.1
		ManipString.vowelCounter();

		// 9.2
		ManipString.upperCaseCounter();

		// 9.3
		ManipString.toUpperCase();

		// 9.4
		ManipString.stringRevert();

		// 9.5
		ManipString.stringToCamelCase();

		// 9.6
		ManipString.stringFinder();

		// 10.1
		Binary.binaryBase10();

		// 10.2
		Binary.base10ToBinary();

		// 11
		ManipArray.arrayMerge();

		// 12
		Palindrome.palindromeStringChecker();
		// bonus
		Palindrome.palindromeIntChecker();

		// 13
		Algo.algoLuhn();

		// 14
		Algo.algoGlouton();

		// 15.1 Possible d'y ajouter un scanner pour avoir un tableau variable suivant l'entrée utilisateur.
		int arr[] = {1, 2, 3, 4, 5};
		Recursivity.recursiveAddArray(arr, 5);
		System.out.println("Exo 15.1: " + Recursivity.recursiveAddArray(arr, arr.length));

		// 15.2
		String input = "abc";
		String result = Recursivity.recursiveString(input);
		System.out.println("Exo 15.2: " + result);

		// 16
		System.out.println("Exo 16: Entrez un texte à chiffrer");
		String str = sc.nextLine();
		System.out.println("Entrez une direction 'RIGHT' ou 'LEFT'");
		String shift_direction = sc.nextLine();
		System.out.println("Entrez une valeur pour le décalage");
		int shift_value = sc.nextInt();
		System.out.println("Le texte : " + str);
		System.out.println("La direction: " + shift_direction );
		System.out.println("Le décalage: " + shift_value);
		System.out.println("Le texte enchiffré : " + Crypto.caesarCipher(str, shift_value,
		shift_direction));

		//17

		//18
		// Quicksort
		int[] tab = {3, 6, 8, 10, 1, 2, 1};
		SortHelper.quickSort(tab);
		for (int number : tab){
		System.out.println(number + " ");
		}

		// Bubble sort
		int[] array = {3, 6, 8, 10, 1, 2, 1};
		SortHelper.bubbleSort(array);
		for(int number : array){
		System.out.println(number + " ");
		}

		//19
		System.out.println(" Exo 19: Entrez la valeur à rechercher dans le tableau");
		int valueToFind = sc.nextInt();
		int index = ManipArray.dichotomique(valueToFind);

		if (index != -1) {
		System.out.println("L'élément a été trouvé à l'index : " + index);
		} else {
		System.out.println("L'élément est introuvable : -1");
		}

		//20
		ManipArray.findBiggers();

		// 21
		Games.masterMind();

		// 23
		ManipArray.createLearnersGroup();

		//24
		Algo.compressRLE();

		//Fermeture du scanner après toutes les entrées utilisateur
		sc.close();
    }
}
