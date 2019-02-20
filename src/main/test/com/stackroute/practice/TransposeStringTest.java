package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {
        transposeString=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposeString=null;
    }

    @Test
    public void transpose() {
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",transposeString.transpose("a quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void transposeFail() {
        assertNotEquals("a quick brown fox jumps over the lazy dog",transposeString.transpose("a quick brown fox jumps over the lazy dog"));
    }

}