package com.thoughtworks;

public class FizzBuzz {
    public String say(int i) {
        boolean isDevidedByThreeAndFive = (i%3==0 && i%5==0);
        boolean isDevidedByThree = i%3==0;
        boolean isDevidedByFive = i%5==0;
        if(isDevidedByThreeAndFive){
            return "FizzBuzz";
        }
        if(isDevidedByThree) {
            return "Fizz";
        }
        if(isDevidedByFive){
            return "Buzz";
        }
        return String.valueOf(i);
    }
}
