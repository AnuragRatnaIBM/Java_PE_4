package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexHarryTest {
    RegexHarry regexHarry;

    @Before
    public void setUp() throws Exception {
        regexHarry=new RegexHarry();
    }

    @After
    public void tearDown() throws Exception {
        regexHarry=null;
    }

    @Test
    public void contains() {
        assertTrue(regexHarry.contains("This is Harry"));
    }
    @Test
    public void notContains() {
        assertFalse(regexHarry.contains("This is Henry"));
    }
}