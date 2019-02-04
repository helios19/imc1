package com.imc.visitor.shapes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TriangleTest {


    @Test
    public void shouldReturnATriangleInstanceWhenHeightAndBreadthAreValid() {
        // given
        double height = 7;
        double base = 6;

        // when
        Triangle triangle = Triangle.builder().height(height).base(base).build();

        // then
        assertNotNull(triangle);
        assertTrue(triangle.getHeight() == 7);
        assertTrue(triangle.getBase() == 6);

    }

    @Test
    public void shouldThrowAnExceptionWhenHeightIsNotPositive() {
        // given
        double height = -7;

        // when
        Triangle.TriangleBuilder triangleBuilder = Triangle.builder();

        // then
        assertThrows(IllegalArgumentException.class, () -> triangleBuilder.height(height),
                "Triangle height must be a positive value");

    }

    @Test
    public void shouldThrowAnExceptionWhenBaseIsNotPositive() {
        // given
        double base = -6;

        // when
        Triangle.TriangleBuilder triangleBuilder = Triangle.builder();

        // then
        assertThrows(IllegalArgumentException.class, () -> triangleBuilder.base(base),
                "Triangle breadth must be a positive value");

    }

}
