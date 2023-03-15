package com.company;

public class zadanie2_2 {
    private float a;
    private float b;
    private float c;

    public zadanie2_2(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public int calculateSqrt(){
        float delta = (this.b* this.b) - 4 * this.a * this.c;
        int retVal = 0;
        if (delta > 0){
            retVal = 2;
        } else if (delta == 0) {
            retVal = 1;
        }
        return retVal;
    }
    public void setA(float value){
        this.a = value;
    }
    public void setB(float value){
        this.b = value;
    }
    public void setC(float value){
        this.c = value;
    }
    public float calculateY(int x){
        return ((x*x)*this.a)+(this.b*x)+this.c;
    }
}
