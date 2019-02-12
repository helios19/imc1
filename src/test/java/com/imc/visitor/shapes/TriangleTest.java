package com.imc.visitor.shapes;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TriangleTest {


    @Test
    public void shouldReturnATriangleInstanceWhenHeightAndBreadthAreValid() {
        // given
        BigDecimal height = BigDecimal.valueOf(7);
        BigDecimal base = BigDecimal.valueOf(6);

        // when
        Triangle triangle = Triangle.builder().height(height).base(base).build();

        // then
        assertNotNull(triangle);
        assertTrue(triangle.getHeight().intValue() == 7);
        assertTrue(triangle.getBase().intValue() == 6);

    }

    @Test
    public void shouldThrowAnExceptionWhenHeightIsNotPositive() {
        // given
        BigDecimal height = BigDecimal.valueOf(-7);

        // when
        Triangle.TriangleBuilder triangleBuilder = Triangle.builder();

        // then
        assertThrows(IllegalArgumentException.class, () -> triangleBuilder.height(height),
                "Triangle height must be a positive value");

    }

    @Test
    public void shouldThrowAnExceptionWhenBaseIsNotPositive() {
        // given
        BigDecimal base = BigDecimal.valueOf(-6);

        // when
        Triangle.TriangleBuilder triangleBuilder = Triangle.builder();

        // then
        assertThrows(IllegalArgumentException.class, () -> triangleBuilder.base(base),
                "Triangle breadth must be a positive value");

    }

}
