package com.company.zadanie3_2;

public class Zadanie {
    public static void main(String[] args) {
        try {
//            Wyrazenie wyr = new Wyrazenie("(9*(1+1))");
            Wyrazenie wyr1 = new Wyrazenie("((9*(1+1))/0)");
//            Wyrazenie wyr2 = new Wyrazenie("(9*(1+1))----");
//            System.out.println("" + wyr.oblicz());
            System.out.println("" + wyr1.oblicz());
//            System.out.println("" + wyr2.oblicz());
        }catch (ArithmeticException e){
            System.out.println("Wystąpił błąd arytmetyczny: " + e.getMessage());
        }catch (WrongExpressionException e){
            System.out.println("Wystąpił błąd wyrażenia: " + e.getMessage());
        }

    }
}

