package com.company;

import javax.swing.*;

public class zadanie1_3 {

    private int sumOdd(int n){
        int sum = 0;

        for(int i=1;i<=n;i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }

    public void execute() {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Podaj liczbę:");
            if(input == null){
                break;
            }
            try {
                JOptionPane.showMessageDialog(null, sumOdd(Integer.parseInt(input)), "Wynik", JOptionPane.INFORMATION_MESSAGE);
                break;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Musisz podać liczbę", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
