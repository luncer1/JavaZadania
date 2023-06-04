package com.company.Zadanie6_2;

public class Zadanie {
    public static void main(String args[]) {
        KolejkaKomunikatow k = new KolejkaKomunikatow();
        Watek w1 = new Watek(k, "klucz1", 1);
        Watek w2 = new Watek(k, "klucz2", 2);
        Watek w3 = new Watek(k, "klucz3", 12);
        w1.start();
        w2.start();
        w3.start();
        try {
            w1.join();
            w2.join();
            w3.join();
        } catch (InterruptedException e) {}

        Integer wartosc1 = k.odbierz("klucz1");
        Integer wartosc2 = k.odbierz("klucz2");
        Integer wartosc3 = k.odbierz("klucz3");

        if (wartosc1 != null) {
            System.out.println("Wartość dla klucza 'klucz1': " + wartosc1);
        } else {
            System.out.println("Brak wartości dla klucza 'klucz1'.");
        }

        if (wartosc2 != null) {
            System.out.println("Wartość dla klucza 'klucz2': " + wartosc2);
        } else {
            System.out.println("Brak wartości dla klucza 'klucz2'.");
        }
        if (wartosc3 != null) {
            System.out.println("Wartość dla klucza 'klucz3': " + wartosc3);
        } else {
            System.out.println("Brak wartości dla klucza 'klucz3'.");
        }


    }
}