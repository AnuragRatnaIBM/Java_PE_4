package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {
    MultipleOccurrence multipleOccurrence;

    @Before
    public void setUp() throws Exception {
        multipleOccurrence=new MultipleOccurrence();
    }

    @After
    public void tearDown() throws Exception {
        multipleOccurrence=null;
    }

    @Test
    public void occurrence() {
        String expectedValue="4-6 10-12 27-29";
        assertEquals(expectedValue,multipleOccurrence.Occurrence("She sells seashells by the seashore"));

    }
}