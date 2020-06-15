package com.thoughtworks;

public class FizzBuzz {
    public String say(int i) {
        boolean isDevidedByThree = i%3==0;
        boolean isDevidedByFive = i%5==0;
        boolean isDevidedBySeven = i%7==0;
        String FizzBuzzWhizzResult = "";
        if(isDevidedByThree) {
            FizzBuzzWhizzResult = FizzBuzzWhizzConstants.ThreeOutput;
        }
        if(isDevidedByFive){
            FizzBuzzWhizzResult = FizzBuzzWhizzResult + FizzBuzzWhizzConstants.FiveOutput;
        }
        if(isDevidedBySeven){
            FizzBuzzWhizzResult = FizzBuzzWhizzResult + FizzBuzzWhizzConstants.SevenOutput;
        }
        if(FizzBuzzWhizzResult == ""){
            FizzBuzzWhizzResult =  String.valueOf(i);
        }
        return FizzBuzzWhizzResult;
    }
}
