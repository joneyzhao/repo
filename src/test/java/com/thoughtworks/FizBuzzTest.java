package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
}
