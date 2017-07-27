package com.gc;

public class BoomFizz {

    public String boom(int number) {

        if (number % 7 == 0) {
            return "Boom!";

        }else if (Integer.toString(number).contains("7")) {
            return"Boom!";

        }return String.valueOf(number);
    }

}


/*
Accepts integer input values and returns "Boom" if the input number is divisible
by 7 or contains the digit 7 otherwise
*/
