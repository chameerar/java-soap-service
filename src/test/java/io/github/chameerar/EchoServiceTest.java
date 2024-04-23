package io.github.chameerar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EchoServiceTest {

    @Test
    void echo() {
        assertEquals("Hello World", new EchoService().echo("Hello World"));
    }
}