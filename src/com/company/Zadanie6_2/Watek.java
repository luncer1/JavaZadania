package com.company.Zadanie6_2;

class Watek extends Thread {
    private KolejkaKomunikatow koko;
    private String klucz;
    private int wartosc;

    public Watek(KolejkaKomunikatow kk, String klucz, int wartosc) {
        koko = kk;
        this.klucz = klucz;
        this.wartosc = wartosc;
    }

    public void run() {
        try {
            koko.wyslij(klucz, wartosc);
            Thread.sleep(50);
        } catch (InterruptedException e) {}
    }
}