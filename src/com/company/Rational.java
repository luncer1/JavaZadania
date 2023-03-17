package com.company;

import static java.lang.Math.abs;

public class Rational {
    int denominator;
    int numerator;

    Rational(int numerator, int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    private void shortRational(Rational arg){
        boolean isGood;
        do{
             isGood= false;
            for(int i = 2; i <= abs(arg.denominator); i++){
                if (arg.denominator % i == 0 && arg.numerator % i == 0){
                    arg.numerator /= i;
                    arg.denominator /= i;
                    isGood = true;
                }
            }
        }while(isGood);

        minusCheck(arg);

    }
     private void minusCheck(Rational arg){
         if((arg.denominator < 0) && (arg.numerator >= 0)){
             arg.denominator = abs(arg.denominator);
             arg.numerator = arg.numerator * (-1);
         }

     }

    public Rational add(Rational arg){
        Rational tmp = new Rational(0,0);
        tmp.numerator = (this.numerator* arg.denominator) + (arg.numerator*this.denominator);
        tmp.denominator = (this.denominator* arg.denominator);
        shortRational(tmp);
        return tmp;
    }

    public Rational sub(Rational arg){
        Rational tmp = new Rational(0,0);
        tmp.numerator = (this.numerator* arg.denominator) - (arg.numerator*this.denominator);
        tmp.denominator = (this.denominator* arg.denominator);
        shortRational(tmp);
        return tmp;
    }
    public Rational mul(Rational arg){
        Rational tmp = new Rational(0,0);
        tmp.numerator = (this.numerator* arg.numerator);
        tmp.denominator = (this.denominator* arg.denominator);
        shortRational(tmp);
        return tmp;
    }
    public Rational div(Rational arg){
        Rational tmp = new Rational(0,0);
        tmp.numerator = (this.numerator* arg.denominator);
        tmp.denominator = (this.denominator* arg.numerator);
        shortRational(tmp);
        return tmp;
    }

    public boolean equals(Rational arg){
        boolean retVal = false;
        minusCheck(arg);
        minusCheck(this);
        if((this.numerator == arg.numerator) && (this.denominator == arg.denominator)){
            retVal = true;
        }
        return retVal;
    }

    public int compareTo(Rational arg){
        minusCheck(arg);
        minusCheck(this);
        int retVal = 0;
        float origin = (float)this.numerator / this.denominator;
        float argument = (float)arg.numerator / arg.denominator;

        if(origin > argument){
            retVal = 1;
        }
        else if(origin < argument){
            retVal = -1;
        }
        return retVal;
    }

    public String toString(){
        minusCheck(this);
        return this.numerator + "/" + this.denominator;
    }
}
