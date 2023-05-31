package com.company.zadanie5_1;

class Wspolrzedna implements Comparable<Wspolrzedna>{
    private int x, y;
    public Wspolrzedna(int _x, int _y) {
        x = _x;
        y = _y; }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public int compareTo(Wspolrzedna wspolrzedna){
        if(x > wspolrzedna.x || x < wspolrzedna.x){
            return x - wspolrzedna.x;
        }
        else{
            return y- wspolrzedna.y;
        }

    }
}

