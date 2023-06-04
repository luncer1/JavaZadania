package com.company.Zadanie6_1;

import javax.swing.*;

class Cenzura extends Thread {
    JTextArea okno;
    volatile boolean zakonczyc;
    public Cenzura(JTextArea comp) {
        okno = comp;
        zakonczyc = false;
    }
    public void run() {
        while (! zakonczyc) {
            try {
                String tekst = okno.getText();
                int indeks = tekst.indexOf("dupsko");
                if (indeks >= 0) {
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Nie pisz tak spoko ok?");
                }
                sleep(2000);
            }
            catch (Exception e) {}
        }
    }
}