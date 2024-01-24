package io.github.chameerar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EchoServiceTest {

    @Test
    void echo() {
        assertEquals("Hello World", new EchoService().echo("Hello World"));
    }
}