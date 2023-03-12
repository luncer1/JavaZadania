package com.company;

import javax.swing.*;

public class zadanie1_4 {
    public String toBinary(int n) {
        String retVal = "";
        while (n >= 1) {
            retVal = (n % 2) + retVal;
            n = n / 2;
        }
        return retVal;
    }

    public String toOct(int n){
        String retVal = "";
        while(n>=1) {
            retVal = (n % 8) + retVal;
            n = n / 8;
        }
        return retVal;
    }

    public String toHex(int n){
        String retVal = "";
        while(n>=1){
            switch (n % 16){
                case 10:
                    retVal = "A" + retVal;
                    n = n/16;
                    break;
                case 11:
                    retVal = "B" + retVal;
                    n = n/16;
                    break;
                case 12:
                    retVal = "C" + retVal;
                    n = n/16;
                    break;
                case 13:
                    retVal = "D" + retVal;
                    n = n/16;
                    break;
                case 14:
                    retVal = "E" + retVal;
                    n = n/16;
                    break;
                case 15:
                    retVal = "F" + retVal;
                    n = n/16;
                    break;
                default:
                    retVal = (n % 16) + retVal;
                    n = n/16;
                    break;

            }
        }
        return retVal;
    }
}
