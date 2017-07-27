package com.gc;


import org.junit.Test;

import static org.junit.Assert.*;

public class BoomFizzTest {
    @Test
    public void boomTest1() throws Exception {
        BoomFizz boomFizz = new BoomFizz();
        String expected = "1";
        String actual = boomFizz.boom(1) ;
        // assertion
        assertEquals("your code sucks!", expected, actual);
    }

    @Test
    public void boomTest7() throws Exception{
        BoomFizz boomFizz = new BoomFizz();
        String expected = "Boom!";
        String actual = boomFizz.boom(7);
        assertEquals("your code sucks!", expected, actual);

    }

}