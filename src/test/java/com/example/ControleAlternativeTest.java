package com.example;

import org.junit.Test;

public class ControleAlternativeTest {
    


    @Test
    public void testLegalStatus(){
        int birthYear = 1995;
        ControleAlternative.displayLegalStatus(birthYear);
    }

    @Test
    public void testCustomNumberDisplay(){
        int a = 19;
        int b = 56;
        ControleAlternative.customNumberDisplay(a,b);
    }

    @Test
    public void testMinMax(){
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        ControleAlternative.minMax(var1, var2, var3);
    }

    @Test
    public void testLetterCheck(){
        char letter = 'x';
        ControleAlternative.letterCheck(letter);
    }

    @Test
    public void testMoneyChecker(){
        int solde = 1000;
        int prix = 250;
        ControleAlternative.moneyChecker(solde, prix);
    }

    @Test
    public void testTauxEmployeur(){
        char status = 'c';
        int enfant = 2;
        int salaire = 2000;
        ControleAlternative.tauxEmployeur(status, enfant, salaire);;
    }
}   
