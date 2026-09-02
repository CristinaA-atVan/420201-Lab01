package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testCountDigits() {
        assertEquals(3, Main.countDigits("abc123"));
    }

    @org.junit.jupiter.api.Test
    void testCountDigitsNoDigits() {
        assertEquals(0, Main.countDigits("Hello, world!"));
    }

    @org.junit.jupiter.api.Test
    void testCountDigitsEmpty() {
        assertEquals(0, Main.countDigits(""));
    }

    @org.junit.jupiter.api.Test
    void testValidPassword() {
        assertTrue(Main.isValidPassword("Vanier123"));
    }

    @org.junit.jupiter.api.Test
    void testInvalidPassword() {
        assertFalse(Main.isValidPassword("vanier"));
    }

    @org.junit.jupiter.api.Test
    void testNullPassword() {
        assertFalse(Main.isValidPassword(null));
    }

    @org.junit.jupiter.api.Test
    void testCountUppercase() {
        assertEquals(2,Main.countUppercase("vaNIer"));
    }

    @org.junit.jupiter.api.Test
    void testCountUppercaseAllUpper() {
        assertEquals(6,Main.countUppercase("VANIER"));
    }

    @org.junit.jupiter.api.Test
    void testCountUppercaseAllLower() {
        assertEquals(0,Main.countUppercase("vanier"));
    }

    @org.junit.jupiter.api.Test
    void testGenerateCode() {
        String code =Main.generateCode();
        assertEquals(4, code.length());
        for (int i = 0; i < code.length(); i++) {
            assertTrue("ABCDE".indexOf(code.charAt(i)) >= 0);
        }
    }

    @org.junit.jupiter.api.Test
    void testGenerateCodeContainsOnlyAllowedCharacters() {
        String code = Main.generateCode();
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            assertTrue(
                    c == 'A' ||
                            c == 'B' ||
                            c == 'C' ||
                            c == 'D' ||
                            c == 'E',
                    "Unexpected character: " + c
            );
        }
    }
}