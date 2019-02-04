package com.imc.visitor.shapes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RectangleTest {


    @Test
    public void shouldReturnARectangleInstanceWhenHeightAndBreadthAreValid() {
        // given
        double height = 9;
        double breadth = 8;

        // when
        Rectangle rectangle = Rectangle.builder().height(height).breadth(breadth).build();

        // then
        assertNotNull(rectangle);
        assertTrue(rectangle.getHeight() == 9);
        assertTrue(rectangle.getBreadth() == 8);

    }

    @Test
    public void shouldThrowAnExceptionWhenHeightIsNotPositive() {
        // given
        double height = -9;

        // when
        Rectangle.RectangleBuilder rectangleBuilder = Rectangle.builder();

        // then
        assertThrows(IllegalArgumentException.class, () -> rectangleBuilder.height(height),
                "Rectangle height must be a positive value");

    }

    @Test
    public void shouldThrowAnExceptionWhenBreadthIsNotPositive() {
        // given
        double breadth = -8;

        // when
        Rectangle.RectangleBuilder rectangleBuilder = Rectangle.builder();

        // then
        assertThrows(IllegalArgumentException.class, () -> rectangleBuilder.breadth(breadth),
                "Rectangle breadth must be a positive value");

    }

}
