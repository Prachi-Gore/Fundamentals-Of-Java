package com.prachi;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // System.out.println( isPrime(3));
        prime(7);

    }

    public static boolean isPrime(int n) {
        int c = 2;
        while (c * c <= n) {   // c<=sqrt(n)
            if (n % c == 0)
                return false;
            else
                c++;
        }
        return true;
    }

    // prime no. which are less than equal to n

    static void prime(int n) {
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                primeList.add(i);
        }
        System.out.println(primeList);
    }
// Sieve Eratosthenes

}

