package com.company;

import javax.swing.*;

class zadanie1_1 {

    public void execute() {
        String input = JOptionPane.showInputDialog(null, "Podaj tekst:");
        JOptionPane.showMessageDialog(null, input.toUpperCase(), "Wynik", JOptionPane.INFORMATION_MESSAGE);
    }

}
