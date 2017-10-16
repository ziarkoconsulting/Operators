package com.jasonziarko;

public class Main {

    public static void main(String[] args) {

        double myFirstDouble = 20;
        double mySecondDouble = 80;

        double myThirdDouble = 25 * (myFirstDouble + mySecondDouble);

        double theRemainder = myThirdDouble % 40;

        if(theRemainder <=20)
            System.out.println("Total was over the limit.");



    }
}
