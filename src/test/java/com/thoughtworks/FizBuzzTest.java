package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizBuzzTest {
    @Test
    public void should_return_1_when_say_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(1);
        //then
        assertEquals("1", resultValue);
    }

    @Test
    public void should_return_Fizz_when_say_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(3);
        //then
        assertEquals("Fizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(5);
        //then
        assertEquals("Buzz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_15() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(15);
        //then
        assertEquals("FizzBuzz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(7);
        //then
        assertEquals("Whizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_21() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(21);
        //then
        assertEquals("FizzWhizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_70() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(70);
        //then
        assertEquals("BuzzWhizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_30() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(30);
        //then
        assertEquals("Fizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_13() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(13);
        //then
        assertEquals("Fizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_105() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(105);
        //then
        assertEquals("BuzzWhizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_210() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(210);
        //then
        assertEquals("FizzBuzzWhizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_35() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(35);
        //then
        assertEquals("BuzzWhizz", resultValue);
    }


    @Test
    public void should_return_Buzz_when_say_753() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(753);
        //then
        assertEquals("Fizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_73() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(73);
        //then
        assertEquals("Fizz", resultValue);
    }

    @Test
    public void should_return_Buzz_when_say_173() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String resultValue = fizzBuzz.say(173);
        //then
        assertEquals("Fizz", resultValue);
    }

}
