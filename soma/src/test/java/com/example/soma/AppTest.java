package com.example.soma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testSoma() {
        App app = new App();
        assertEquals(5, app.soma(2, 3));
    }
}
