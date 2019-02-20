package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDandLTest {
    ReplaceDandL replaceDandL;

    @Before
    public void setUp() throws Exception {
        replaceDandL=new ReplaceDandL();
    }

    @After
    public void tearDown() throws Exception {
        replaceDandL=null;
    }

    @Test
    public void replace() {
        assertEquals("faity fry",replaceDandL.replace("daily dry"));
    }
    @Test
    public void replaceFail() {
        assertNotEquals("faily fry",replaceDandL.replace("daily dry"));
    }
}