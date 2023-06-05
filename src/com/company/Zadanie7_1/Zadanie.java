package com.company.Zadanie7_1;

import java.net.*;
import java.io.*;


//Cięzko przetestować ponieważ każdy server cały czas zwraca -1
public class Zadanie {
    public static void main(String[] args) {
        String nazwahosta;
        if (args.length > 0) {
            nazwahosta = args[0];
        }
        else {
            nazwahosta = "time-a.nist.gov";
        }
        try {
            Socket gniazdo = new Socket(nazwahosta, 37);
            InputStream strumien = gniazdo.getInputStream();

            long sekundy = 0;

            for (int i = 0; i < 4; i++) {
                sekundy = (sekundy << 8) | (strumien.read() & 0xFF);
            }

            gniazdo.close();

            System.out.println("Liczba sekund: " + sekundy);
        }
        catch (UnknownHostException e) {
            System.err.println(e);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
