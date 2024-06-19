package com.example;

import org.junit.Test;

public class ControleIteratifTest {
    
    @Test
    public void testSubscriberCount(){
        int subs = 2500;
        int months = 24;
        ControleIteratif.subscriberCount(subs, months);
    }

    @Test
    public void testSum0ToN(){
        int n = 5;
        ControleIteratif.sum0ToN(n);;
    }

    @Test
    public void testFizzBuzz(){
        int n = 20;
        ControleIteratif.fizzBuzz(n);;
    }

    @Test
    public void testFactorial(){
        int n = 29;
        ControleIteratif.factorial(n);;
    }
}
