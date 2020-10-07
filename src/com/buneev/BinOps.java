package com.buneev;

public class BinOps {
    public String sum(String a, String b) {
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(decimalA + decimalB);
    }

    public String mult(String a, String b) {
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(decimalA * decimalB);
    }
}

