package com.company.zadanie3_2;
import java.util.EmptyStackException;

abstract class Wierzcholek {
    Wierzcholek lewy, prawy;
    public abstract int wartosc() throws WrongExpressionException;
}
class Stala extends Wierzcholek {
    private int wart;
    public Stala(int x) {
        wart = x; }
    public int wartosc() {
        return wart;
    } }
class Dzialanie extends Wierzcholek {
    private char op; // operator +, -, / lub *
    public Dzialanie(char znak) {
        op = znak;
    }
    public void dodajLewyArg(Wierzcholek arg) {
        lewy = arg;
    }
    public void dodajPrawyArg(Wierzcholek arg) {
        prawy = arg;
    }
    public int wartosc() throws WrongExpressionException {
        switch (op) {
            case '+': return lewy.wartosc()+ prawy.wartosc();
            case '-':
                if(prawy.wartosc() == 0){
                    throw new ArithmeticException("Zero division!");
                }
                return lewy.wartosc()- prawy.wartosc();
            case '/': return lewy.wartosc()/ prawy.wartosc();
            case '*': return lewy.wartosc()* prawy.wartosc();
            default:
                throw new WrongExpressionException("Wrong expression!");
        }
    }
}
class Wyrazenie {
    private Wierzcholek korzen;
    private Wierzcholek utworzDrzewo(String w, int p, int q) throws WrongExpressionException {
        if (p > q) {
            throw new WrongExpressionException("Wrong expression!");
        }

        if (p == q) {
            return new Stala(Character.digit(w.charAt(p), 10));
        } else {
            int i = p + 1;
            int nawiasy = 0;

            while ((nawiasy != 0) || (w.charAt(i) == '(') || (w.charAt(i) == ')') || (Character.isDigit(w.charAt(i)))) {
                if (w.charAt(i) == '(') {
                    ++nawiasy;
                }
                if (w.charAt(i) == ')') {
                    --nawiasy;
                }
                ++i;

                if (i > q + 1) {
                    throw new WrongExpressionException("Wrong expression!");
                }
            }

            if (i > q) {
                throw new WrongExpressionException("Wrong expression!");
            }

            Dzialanie nowy = new Dzialanie(w.charAt(i));
            nowy.dodajLewyArg(utworzDrzewo(w, p + 1, i - 1));
            nowy.dodajPrawyArg(utworzDrzewo(w, i + 1, q - 1));
            return nowy;
        }
    }


    public Wyrazenie(String w) throws WrongExpressionException{
        korzen = utworzDrzewo(w, 0, w.length()-1);
    }
    public int oblicz() throws WrongExpressionException{
        return korzen.wartosc();
    }
}

class WrongExpressionException extends Exception{
    public WrongExpressionException(String message){
        super(message);
    }
}