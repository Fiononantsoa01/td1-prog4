package com.prog.hei.conf.arith;

import com.prog.hei.service.ArithService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ArithServiceTest {

    private ArithService arithService;

    @BeforeEach
    void setUp() {
        arithService = new ArithService();
    }
    @Test
    void shouldAddPositiveNumbers() {
        assertEquals(8L, arithService.addition(5L, 3L));
    }

    @Test
    void shouldAddNegativeNumbers() {
        assertEquals(-2L, arithService.addition(-5L, 3L));
        assertEquals(-8L, arithService.addition(-5L, -3L));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(7L, arithService.substruct(10L, 3L));
        assertEquals(-8L, arithService.substruct(2L, 10L));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(20L, arithService.multiply(4L, 5L));
        assertEquals(0L, arithService.multiply(10L, 0L));
        assertEquals(-12L, arithService.multiply(-3L, 4L));
    }


    @Test
    void shouldDividePositiveNumbers() {
        assertEquals(new BigDecimal("5.000000000"), arithService.divide(20L, 4L));
        assertEquals(new BigDecimal("4.000000000"), arithService.divide(20L, 5L));
    }

    @Test
    void shouldReturnZeroWhenNumeratorIsZero() {
        assertEquals(BigDecimal.ZERO, arithService.divide(0L, 5L));
        assertEquals(BigDecimal.ZERO, arithService.divide(0L, -7L));
    }

    @Test
    void shouldThrowExceptionWhenDivideByZero() {
        assertThrows(ArithmeticException.class, () -> arithService.divide(10L, 0L));
        assertThrows(ArithmeticException.class, () -> arithService.divide(-5L, 0L));
        assertThrows(ArithmeticException.class, () -> arithService.divide(0L, 0L));
    }
}