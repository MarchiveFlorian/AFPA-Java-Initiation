package com.example;

import java.util.Scanner;

public class Palindrome {
    
    // 12 Palindrome
	// https://www.programiz.com/java-programming/examples/palindrome-number
	public static void palindromeStringChecker() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Exo 12: Entrez la chaine de caractère à vérifier : ");
		String str = sc.nextLine();
		String reverseStr = "";

		for (int i = (str.length() - 1); i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " est un palindrome.");
		} else {
			System.out.println(str + " n'est pas un palindrome.");
		}
		sc.close();
	}

	// 12 Palindrome bonus pour les nombres
	// https://www.programiz.com/java-programming/examples/palindrome-number
	public static void palindromeIntChecker() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Exo 12 (bonus): Entrez le nombre à vérifier : ");
		int num = sc.nextInt();
		int reversedNum = 0;
		int remainder;

		// On conserve le nombre d'origine
		int originalNum = num;

		// On recupere et stock l'inverse d'originalNum
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}

		// On vérifie si reversedNum et originalNum sont égaux
		if (originalNum == reversedNum) {
			System.out.println(originalNum + " est un palindrome.");
		} else {
			System.out.println(originalNum + " n'est pas un palindrome.");
		}

		sc.close();
	}
}
