package com.company.Zadanie7_1;

import java.net.*;
import java.io.*;

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

            DataInputStream dataStream = new DataInputStream(strumien);
            System.out.println(dataStream.read());

        }
        catch (UnknownHostException e) {
            System.err.println(e);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}