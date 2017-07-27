package com.gc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrokenClassTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isCardAMatch() throws Exception {
        BrokenClass brokenClass = new BrokenClass();

        boolean expected = true;
        boolean actual = brokenClass.isCardAMatch("ace", "ace");

        assertTrue("This code sucks!", actual);
    }

    //WRONG
    @Test
    public void baseEncodeFileName() throws Exception {

        BrokenClass brokenClass = new BrokenClass();
        String expected = "c2VjcmV0";
        String actual = brokenClass.baseEncodeFileName("secret");
        assertEquals("this code sucks", expected, actual);

    }

    @Test
    public void roundUp() throws Exception {

        BrokenClass brokenClass = new BrokenClass();
        int expected = 2;
        float actual = brokenClass.roundUp(1.135f);
        assertEquals("this code sucks", expected, actual, .0003);


    }

    @Test
    public void sum() throws Exception {

        BrokenClass brokenClass = new BrokenClass();

        int expected = ;
        int actual = brokenClass.sum(Integer.MAX_VALUE,1);
        assertEquals("sdfsdfg", actual);

    }

}