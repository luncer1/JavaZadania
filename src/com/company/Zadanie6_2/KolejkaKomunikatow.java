package com.company.Zadanie6_2;

import java.util.*;
class KolejkaKomunikatow {
    private HashMap<String, Integer> kolejka = new HashMap<>();

    public synchronized void wyslij(String klucz, Integer wartosc) {
        kolejka.put(klucz, wartosc);
    }

    public synchronized Integer odbierz(String klucz) {
        return kolejka.remove(klucz);
    }
}