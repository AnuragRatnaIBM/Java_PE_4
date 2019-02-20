package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphTest {
    Paragraph paragraph;

    @Before
    public void setUp() throws Exception {
        paragraph=new Paragraph();
    }

    @After
    public void tearDown() throws Exception {
        paragraph=null;
    }

    @Test
    public void extractWords() {
        assertEquals("Bhaiya Raja",paragraph.extractWords("Raja Bhaiya"));
    }
    @Test
    public void extractWordsFail() {
        assertNotEquals("raja abhaiya",paragraph.extractWords("raja bhaiya"));
    }
}