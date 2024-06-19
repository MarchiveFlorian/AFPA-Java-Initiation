package com.example;

public class ControleIteratif {
    
    // 4.1 Abonnés youtube
	public static void subscriberCount(int subs, int months) {

		// FOR
		for (int i = 0; i < months; i++) {
			int subsWithGrowth = subs += subs * 0.05;
			System.out.println(" -> Le nombre d'abonnés a augmenté de 5%: " + subsWithGrowth);
		}

		// WHILE
		// int i = 0;
		// while (i < months){
		// int subsWithGrowth = subs += subs*0.05;
		// System.out.println(" -> Le nombre d'abonnés a augmenté de 5%: " +
		// subsWithGrowth);
		// i++;
		// }
	}

	// 4.2 Somme de n entiers
	public static void sum0ToN(int n) {

		int somme = 0;

		for (int i = 0; i <= n; i++) {
			somme += i;
		}

		System.out.println(" -> La somme des entiers de 0 à " + n + " est: " + somme);
	}

	// 4.3 Fizzbuzz
	public static void fizzBuzz(int nFizz) {

		int modulo1 = 3;
		int modulo2 = 5;

		for (int i = 0; i < nFizz; i++) {
			if (i % modulo1 == 0 && i % modulo2 == 0) {
				System.out.println(" -> Fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println(" -> Fizz");
			} else if (i % 5 == 0) {
				System.out.println(" -> Buzz");
			} else {
				System.out.println(" -> " + i);
			}
		}
	}

	// 4.4 Factorielle
	public static void factorial(int nFacto) {

		int fact = 1;

		for (int i = 1; i <= nFacto; i++) {
			fact = fact * i;
		}

		System.out.println("La factorielle de " + nFacto + " est " + fact);
	}
}
