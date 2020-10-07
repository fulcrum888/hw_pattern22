package com.buneev;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println(bins.sum("00000011", "00000011"));
        System.out.println(bins.mult("00000010", "00000010"));
    }
}
