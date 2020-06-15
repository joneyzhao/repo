package com.thoughtworks;


public class FizzBuzz {
    public String say(int i) {
        boolean isDevidedByThreeAndFiveAndSeven = (i%3==0 && i%5==0 && i%7==0);
        boolean isDevidedByThreeAndFive = (i%3==0 && i%5==0);
        boolean isDevidedByThreeAndSeven = (i%3==0 && i%7==0);
        boolean isDevidedByFiveAndSeven = (i%5==0 && i%7==0);
        boolean isDevidedByThree = i%3==0;
        boolean isDevidedByFive = i%5==0;
        boolean isDevidedBySeven = i%7==0;
        if(isDevidedByThreeAndFiveAndSeven){
            return "FizzBuzzWhizz";
        }
        if(isDevidedByThreeAndFive){
            return "FizzBuzz";
        }
        if(isDevidedByThreeAndSeven){
            return "FizzWhizz";
        }
        if(isDevidedByFiveAndSeven){
            return "BuzzWhizz";
        }
        if(isDevidedByThree) {
            return FizzBuzzWhizzConstants.ThreeOutput;
        }
        if(isDevidedByFive){
            return FizzBuzzWhizzConstants.FiveOutput;
        }
        if(isDevidedBySeven){
            return FizzBuzzWhizzConstants.SevenOutput;
        }
        return String.valueOf(i);
    }
}
