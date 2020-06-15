package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        boolean isDevidedByThree = number % 3 == 0;
        boolean isDevidedByFive = number % 5 == 0;
        boolean isDevidedBySeven = number % 7 == 0;
        String FizzBuzzWhizzResult = "";
        String inputValue = String.valueOf(number);

        if(inputValue.contains("3")){
            return FizzBuzzWhizzConstants.ThreeOutput;
        }

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
            FizzBuzzWhizzResult =  String.valueOf(number);
        }
        return FizzBuzzWhizzResult;
    }
}
