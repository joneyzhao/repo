package com.thoughtworks;

public class FizzBuzz {
    public String say(int number) {
        boolean isDevidedByThree = number % FizzBuzzWhizzConstants.FizzNumber == 0;
        boolean isDevidedByFive = number % FizzBuzzWhizzConstants.BuzzNumber == 0;
        boolean isDevidedBySeven = number % FizzBuzzWhizzConstants.WhizzNumber == 0;
        String FizzBuzzWhizzResult = "";
        String inputValue = String.valueOf(number);

        if(inputValue.contains(FizzBuzzWhizzConstants.BuzzString)){
            if(isDevidedByFive && isDevidedBySeven){
                return "BuzzWhizz";
            }
        }

        if(inputValue.contains(FizzBuzzWhizzConstants.FizzString)){
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
