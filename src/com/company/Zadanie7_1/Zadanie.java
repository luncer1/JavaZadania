package com.company.Zadanie7_1;

import java.net.*;
import java.io.*;

public class Zadanie {
    public static void main(String[] args) {
        String nazwahosta;
        if (args.length > 0) {
            nazwahosta = args[0];
        } else {
            nazwahosta = "time-nw.nist.gov";
        }

        try {
            Socket gniazdo = new Socket(nazwahosta, 37);
            InputStream strumien = gniazdo.getInputStream();

            long liczbaSekund = 0;
            for (int i = 0; i < 4; i++) {
                int wartosc = strumien.read();
                liczbaSekund = (liczbaSekund << 8) | wartosc;
            }

            // Liczba sekund od 1900 r.
            System.out.println("Liczba sekund: " + liczbaSekund);

            gniazdo.close();
        } catch (UnknownHostException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
