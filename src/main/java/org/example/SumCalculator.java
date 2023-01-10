package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n <= 0) {
           throw new IllegalArgumentException("aaa");
        }

        int k = 0;
            for (int i = 1; i <= n; i++) {
                k += i;
            }
            return k;
    }
}
