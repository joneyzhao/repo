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
}
