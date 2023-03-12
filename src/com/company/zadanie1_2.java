package com.company;

import javax.swing.*;
import java.math.BigInteger;

public class zadanie1_2 {

    private BigInteger calculateFactorial(int n){
        BigInteger factorial = BigInteger.ONE;
        for(int i=1; i<=n;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return  factorial;
    }

    public void execute() {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Podaj liczbę:");
            if(input == null){
                break;
            }
            try {
                JOptionPane.showMessageDialog(null, calculateFactorial(Integer.parseInt(input)), "Wynik", JOptionPane.INFORMATION_MESSAGE);
                break;
            } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null, "Musisz podać liczbę", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
