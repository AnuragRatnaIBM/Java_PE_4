package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrencesTest {
    CountOccurrences countOccurrences;

    @Before
    public void setUp() throws Exception {
        countOccurrences=new CountOccurrences();
    }

    @After
    public void tearDown() throws Exception {
        countOccurrences=null;
    }

    @Test
    public void occurrences() {
        assertEquals(5,countOccurrences.occurrences("my name is anurag Ratna"));
    }
    @Test
    public void occurrencesPart2() {
        assertEquals(10,countOccurrences.occurrences("Java is java again java again"));
    }
    @Test
    public void occurrencesFailure() {
        assertNotEquals(24,countOccurrences.occurrences("Java is java again java again"));
    }
}