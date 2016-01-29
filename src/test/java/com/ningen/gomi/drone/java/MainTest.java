package com.ningen.gomi.drone.java;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class MainTest extends TestCase {

    @Test
    public void testGetOne() {
        assertThat(Main.getOne(), is(1));   
        assertThat(Main.getOne(), is(not(2)));
    }

}