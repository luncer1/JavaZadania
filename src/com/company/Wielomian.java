package com.company;

import static java.lang.Math.sqrt;

public abstract class Wielomian {

    abstract void wypiszMiejscaZerowe();
}

class FunkcjaLiniowa extends Wielomian{
    private final float a;
    private final float b;
    public FunkcjaLiniowa(float a, float b){
        this.a = a;
        this.b = b;
    }
    @Override
    void wypiszMiejscaZerowe() {
        if (this.a==0){
            System.out.println("Brak");
        }
        else {
            System.out.println((-b) / a);
        }
    }
}

class FunkcjaKwadratowa extends Wielomian{
    private float a;
    private float b;
    private float c;
    private float delta;

    public FunkcjaKwadratowa(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private int calculateSqrt(){
        this.delta = (this.b* this.b) - 4 * this.a * this.c;
        int retVal = 0;
        if (delta > 0){
            retVal = 2;
        } else if (delta == 0) {
            retVal = 1;
        }
        return retVal;
    }
    @Override
    void wypiszMiejscaZerowe() {
        switch (this.calculateSqrt()) {
            case 0 -> System.out.println("Brak");
            case 1 -> System.out.println((-this.b) / (2 * this.a));
            case 2 ->
                    System.out.println((-this.b - sqrt(delta)) / (2 * this.a) + " " + (-this.b + sqrt(delta)) / (2 * this.a));
        }
    }
}